extends Node2D

var loader
var time_max = 100 # msec
var current_scene


func _ready():
	#Para apagar esta cena depois
	var root = get_tree().get_root()
	current_scene = root.get_child(root.get_child_count() -1)
	
	goto_scene()
	
	


#SplashScreen plugin
func ExitSplashScreen():
	if Engine.has_singleton("PluginSplashScreen"):
		var splashscreen = Engine.get_singleton("PluginSplashScreen")
		splashscreen.ExitSplashScreen()
		


#Carregar a cena principal
func goto_scene(): # Game requests to switch to this scene.
	loader = ResourceLoader.load_interactive("res://myMainGame.tscn")
	if loader == null: # Check for errors.
		print("error loader")
		return
	set_process(true)
	


func _process(time):
	if loader == null:
		# no need to process anymore
		set_process(false)
		return

	var t = OS.get_ticks_msec()
	# Use "time_max" to control for how long we block this thread.
	while OS.get_ticks_msec() < t + time_max:
		 # Poll your loader.
		var err = loader.poll()
		
		if err == ERR_FILE_EOF: # Finished loading.
			var resource = loader.get_resource()
			loader = null
			set_new_scene(resource)
			break
		elif err == OK:
			pass
		else: 
			# Error during loading.
			print("Error during loading.")
			loader = null
			break
			
			


func set_new_scene(scene_resource):
	#Apaga cena de carragamento
	current_scene.queue_free()
	
	current_scene = scene_resource.instance()
	get_node("/root").add_child(current_scene)
	
	#Exit SplashScreen
	ExitSplashScreen()


