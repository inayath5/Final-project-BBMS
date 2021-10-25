package com.example.bloodbankmanagement.bloodbankmanagement.util;

import com.example.bloodbankmanagement.bloodbankmanagement.repository.Command;

public class DonorInSearchCommand implements Command{
	
	BloodBankUtils util;
	int prevStage;

	public DonorInSearchCommand(BloodBankUtils util) {
		this.util = util;
	}
	public void execute() {
		prevStage = util.getStage();
		util.inSearch();
	}
	public void undo() {
		switch (prevStage) {
		case BloodBankUtils.APPROVED: 	util.approved(); break;
		case BloodBankUtils.SEARCH: util.inSearch(); break;
		case BloodBankUtils.REQUEST: 	util.req(); break;
		default: 				util.yetToReq();
		}
	}
}
