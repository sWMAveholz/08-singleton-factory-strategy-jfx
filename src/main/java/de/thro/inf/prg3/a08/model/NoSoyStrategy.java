package de.thro.inf.prg3.a08.model;

public class NoSoyStrategy extends FilterBase {
	@Override
	protected boolean include(Meal m) {
		var containsSoy = false;
		for (var s : m.getNotes()){
			containsSoy = containsSoy || s.contains("soy");
		}
		return !containsSoy;
	}
}
