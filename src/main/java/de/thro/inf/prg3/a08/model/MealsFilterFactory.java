package de.thro.inf.prg3.a08.model;

import java.util.HashMap;
import java.util.Map;

public abstract class MealsFilterFactory {

	public static Map<String, MealsFilter> mealsFilterMap;

	static {
		mealsFilterMap = new HashMap<>();
		mealsFilterMap.put("No pork", new NoPorkStrategy());
		mealsFilterMap.put("No soy", new NoSoyStrategy());
		mealsFilterMap.put("Vegetarian", new VegetarianStrategy());
		mealsFilterMap.put("All", new AllMealsStrategy());
	}


	public static MealsFilter getStrategy(String key) {
		try {
			return mealsFilterMap.get(key);
		} catch (Exception e) {
			return mealsFilterMap.get("All");
		}
	}
}
