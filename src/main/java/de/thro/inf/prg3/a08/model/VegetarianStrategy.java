package de.thro.inf.prg3.a08.model;

import java.util.List;

public class VegetarianStrategy extends FilterBase {

	@Override
	protected boolean include(Meal m) {

		return m.isVegetarian();
	}

}
