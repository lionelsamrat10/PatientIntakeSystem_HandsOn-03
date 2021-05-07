package com.cognizant.patientintakesystem;

public enum Doctor {
	samrat("Samrat Mitra"),
	sam("Sam Wilson"),
	barnes("Bucky Barnes"),
	jasper("Jasper Cillesen");
	
	private String doctorName;
	
	private Doctor(String doctorName) {
		this.doctorName = doctorName;
	}
}
