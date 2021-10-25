package com.example.bloodbankmanagement.bloodbankmanagement.repository;

public interface Command {
	
	public void execute();
	public void undo();
	
}
