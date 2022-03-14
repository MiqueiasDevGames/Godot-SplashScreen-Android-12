# Godot-SplashScreen-Android-12
An excellent SplashScreen that works for android versions before and after Android 12

#Splash Screen Godot Android Solution

- First go to android/build/src/com/godot/game and paste there GodotApp.java and PluginSplashScreen.java from the src folder of this project.

- Now go to AndroidManifest.xml in android/build/ and delete `android:theme="@style/GodotAppSplashTheme"` from
<activity android:name=".GodotApp"
- in ``<application>`` put this 
`android:theme="@style/Theme.App.Starting"`   So: ``<application android:theme="@style/Theme.App.Starting">``


- Also included the following tag inside your <application> tag:
 `` <meta-data
  android:name="org.godotengine.plugin.v1.PluginSplashScreen"
  android:value="com.matematica.canhaokids.PluginSplashScreen" /> ``
  
 - Finally copy the xml from the res/values ​​folder of this project and paste it in the res/values ​​folder of android/build/

 
 ## One more thing
 
 - In the Scripts_Godot/SplashScreen/ folder you will find the scene that will be your main scene, copy it along with its script, to the root of your godot project and define it as run scene.
 - Change res://myMainGame.tscn in the function goto_scene(), in the Main.gd script to the first scene of your game.
 - It is necessary to do this so that godot closes the SplashScreen android, when it finishes loading your scene.
 - A Godot SplashScreen compatible with Android 12 and later and earlier.
 
 
 ## SplashScreen is only closed when the main scene of your game is fully loaded, perfect right, let it star.
 
 
 
 
# Twitter:
- [https://twitter.com/MiqueiasGames](https://twitter.com/MiqueiasGames)

# My Games: 
- [https://miqueiasdevgames.github.io/](https://miqueiasdevgames.github.io/)
