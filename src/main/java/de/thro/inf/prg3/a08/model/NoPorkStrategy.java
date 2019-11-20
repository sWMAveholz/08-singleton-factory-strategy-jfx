package de.thro.inf.prg3.a08.model;

public class NoPorkStrategy extends FilterBase {
	@Override
	protected boolean include(Meal m) {
		var containsPork = false;
		for (var s : m.getNotes()){
			containsPork = containsPork || s.contains("pork");
		}
		return !containsPork;
	}
}
