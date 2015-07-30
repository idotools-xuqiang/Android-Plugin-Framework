package com.plugin.core.ui;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Stub模式, 用于运行时被插件中的Service替换,这种方式比代理模式更稳定
 * 
 * @author cailiming
 *
 */
public class PluginStubService extends Service {

	public static final String ACTION = "com.plugin.core.ui.ACTION_STUB_SERVICE";
	
	@Override
	public void onCreate() {
		super.onCreate();
		Log.e("PluginStubService", "should not happen");
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		
		Log.e("PluginStubService", "should not happen");

		return super.onStartCommand(intent, flags, startId);
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
	
}