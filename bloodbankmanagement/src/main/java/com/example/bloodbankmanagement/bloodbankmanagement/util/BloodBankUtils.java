package com.example.bloodbankmanagement.bloodbankmanagement.util;

public class BloodBankUtils {
	
	public static final int APPROVED = 3;
	public static final int SEARCH = 2;
	public static final int REQUEST = 1;
	public static final int YETTOREQ = 0;
	String phase;
	int stage;
 
	public BloodBankUtils(String phase) {
		this.phase = phase;
	}
  
	public void approved() {
		// turns the ceiling fan on to high
		stage = APPROVED;
		System.out.println(phase + "Approved");
	} 

	public void inSearch() {
		// turns the ceiling fan on to medium
		stage = SEARCH;
		System.out.println(phase + "is in search");
	}

	public void req() {
		// turns the ceiling fan on to low
		stage = REQUEST;
		System.out.println(phase + "is requested");
	}
 
	public void yetToReq() {
		// turns the ceiling fan off
		stage = YETTOREQ;
		System.out.println(phase + "yet to request");
	}
 
	public int getStage() {
		return stage;
	}
}
