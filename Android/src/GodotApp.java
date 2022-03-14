package com.godot.game;
 
 import android.os.Bundle;
 import org.godotengine.godot.FullScreenGodotApp;
 
 import androidx.core.splashscreen.SplashScreen;
 
 public class GodotApp extends FullScreenGodotApp {
 
 private static boolean keep = true;
 
 @Override
 public void onCreate(Bundle savedInstanceState) {
 // Handle the splash screen transition.
 SplashScreen splashScreen = SplashScreen.installSplashScreen(this); 
 
 
 setTheme(R.style.GodotAppMainTheme);
 super.onCreate(savedInstanceState);
 
 
 // Keep the splash screen visible for this Activity
 splashScreen.setKeepOnScreenCondition(new SplashScreen.KeepOnScreenCondition() {
 @Override
 public boolean shouldKeepOnScreen() {
 return keep;
 }
 }); 
 
 
 }
 
 public static void setFalseKeep(){
 keep = false;
 }
 
 
 }
 
 
 
 
 

