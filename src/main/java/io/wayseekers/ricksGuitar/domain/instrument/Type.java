package io.wayseekers.ricksGuitar.domain.instrument;

public enum Type {
	NS, ACOUSTIC, ELECTRIC;
	
	public String toString() {
		switch(this) {
			case ACOUSTIC:
				return "ACOUSTIC";
			case ELECTRIC:
				return "ELECTRIC";
			default:
				return null;
		}
	}
}
