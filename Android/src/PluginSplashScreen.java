package com.godot.game;

import android.app.Activity;
import androidx.annotation.NonNull;
import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.UsedByGodot;

public class PluginSplashScreen extends GodotPlugin {
  public static final String PLUGIN_NAME = "PluginSplashScreen";
  
  Activity activity;
  
  public PluginSplashScreen(Godot godot) {
    super(godot);
    this.activity = (Activity)godot.getActivity();
  }
  
  @NonNull
  public String getPluginName() {
    return PLUGIN_NAME;
  }
  
  @UsedByGodot
  public void ExitSplashScreen() {
   	GodotApp.setFalseKeep();
  }
}
