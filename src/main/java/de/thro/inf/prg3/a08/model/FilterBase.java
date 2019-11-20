package de.thro.inf.prg3.a08.model;

import java.util.ArrayList;
import java.util.List;

public abstract class FilterBase implements MealsFilter {

	protected abstract boolean include(Meal m);


	@Override
	public List<Meal> filter(List<Meal> meals) {
		List<Meal> resultmeals = new ArrayList<Meal>();
		for (Meal m : meals){
			if(include(m)){
				resultmeals.add(m);
			}
		}

		return resultmeals;
	}


}
