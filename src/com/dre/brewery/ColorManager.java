package com.dre.brewery;

import com.dre.brewery.utility.BUtil;

import java.util.HashMap;
import java.util.Map;

public class ColorManager {
	private static ColorManager instance;
	public static ColorManager getInstance() {
		if (instance == null) {
			instance = new ColorManager();
		}
		return instance;
	}
	private Map<String,String> colorMap = new HashMap<>();

	public String getColor(String color) {
		String parsedColor;
		if(this.colorMap.containsKey(color)) {
			parsedColor = this.colorMap.get(color);
		} else {
			parsedColor = BUtil.color(color);
			this.colorMap.put(color, parsedColor);
		}
		return parsedColor;
	}

}
