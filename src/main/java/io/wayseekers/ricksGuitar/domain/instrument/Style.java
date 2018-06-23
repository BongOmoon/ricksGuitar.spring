package io.wayseekers.ricksGuitar.domain.instrument;

public enum Style {
	NS, A, F;
	
	public String toString() {
		switch(this) {
			case A:
				return "A";
			case F:
				return "F";
			default:
				return null;
		}
	}
}
