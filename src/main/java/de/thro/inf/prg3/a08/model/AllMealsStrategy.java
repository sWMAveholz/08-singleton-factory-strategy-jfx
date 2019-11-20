package de.thro.inf.prg3.a08.model;

import java.util.List;

public class AllMealsStrategy implements MealsFilter{


	@Override
	public List<Meal> filter(List<Meal> meals) {
		return meals;
	}
}
