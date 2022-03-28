package com.revature.p1.myp1.service;

import java.util.List;

import com.revature.p1.myp1.model.Reimbursement;

public interface ReimbursementService {

	public List<Reimbursement> findAll();
	
	public Reimbursement findById(int id);
	
	public List<Reimbursement> findPending();
	
	public List<Reimbursement> findApproved();
	
	public Reimbursement updateReimbursementStatus (int id, int status);
	
	public List<Reimbursement> findByAuthor(int id); 
	
	public void saveReimbursement(Reimbursement newReimbursement);
}