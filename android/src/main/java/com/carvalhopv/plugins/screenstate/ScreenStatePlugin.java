package com.carvalhopv.plugins.screenstate;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "ScreenStatePlugin")
public class ScreenStatePlugin extends Plugin {

    private ScreenState implementation;

    @Override
    public void load() {
        implementation = new ScreenState(this);
    }

    @PluginMethod
    public void isScreenLocked(PluginCall call) {
        try {

            boolean isLocked = false;
            isLocked = implementation.isScreenLocked();

            JSObject result = new JSObject();
            result.put("isLocked", isLocked);
            call.resolve(result);
        } catch (Exception exception) {
            call.reject(exception.getMessage());
        }
    }
}
