package com.carvalhopv.plugins.screenstate;

import android.app.KeyguardManager;
import android.content.Context;
import android.app.KeyguardManager;
import com.getcapacitor.Plugin;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;

public class ScreenState {

    private final ScreenStatePlugin plugin;

     public ScreenState(ScreenStatePlugin plugin) {
        this.plugin = plugin;
    }

    public boolean isScreenLocked() {
        KeyguardManager keyguardManager = (KeyguardManager) plugin.getContext().getSystemService(Context.KEYGUARD_SERVICE);
        return keyguardManager.isKeyguardLocked();
    }
}
