# Godot-SplashScreen-Android-12
An excellent SplashScreen that works for android versions before and after Android 12

#Splash Screen Godot Android Solution

- First go to android/build/src/com/godot/game and paste there GodotApp.java and PluginSplashScreen.java from the src folder of this project.

- Now go to AndroidManifest.xml in android/build/ and delete `android:theme="@style/GodotAppSplashTheme"` from
<activity android:name=".GodotApp"
- in <application> put this 
`android:theme="@style/Theme.App.Starting"`


- Also included the following tag inside your <application> tag:
 `\<meta-data
  android:name="org.godotengine.plugin.v1.PluginSplashScreen"
  android:value="com.matematica.canhaokids.PluginSplashScreen" \/\> `
  
 - Finally copy the xml from the res/values ​​folder of this project and paste it in the res/values ​​folder of android/build/
