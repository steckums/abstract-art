package com.steckums.abstractart.settings;

import com.steckums.abstractart.Renderer;
import com.steckums.abstractart.Wallpaper;
import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.widget.Toast;

public class ClearCachePreference extends Preference
{
	Context context;
	Renderer renderer;
	
	public ClearCachePreference(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.context = context;
		renderer = new Renderer(context);
	}
	
	public ClearCachePreference(Context context, AttributeSet attrs) {
		this(context, attrs, android.R.attr.dialogPreferenceStyle);
	}
	
	public ClearCachePreference(Context context) {
		this(context, null, android.R.attr.dialogPreferenceStyle);
	}
	
	@Override
    protected void onClick() {
		Wallpaper.clearCache();
		Toast.makeText(context, "Cache cleared", Toast.LENGTH_SHORT).show();
    }
}
