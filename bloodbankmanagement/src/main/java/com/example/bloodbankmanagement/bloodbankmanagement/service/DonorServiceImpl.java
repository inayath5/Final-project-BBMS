package com.example.bloodbankmanagement.bloodbankmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bloodbankmanagement.bloodbankmanagement.entity.Donor;
import com.example.bloodbankmanagement.bloodbankmanagement.repository.DonorRepository;

@Service
public class DonorServiceImpl implements DonorService{
	
	@Autowired
	DonorRepository donorRepo;

	@Override
	public List<Donor> findAllDonors() {
		// TODO Auto-generated method stub
		return (List<Donor>)donorRepo.findAll();
	}

	@Override
	public void saveDonor(Donor donor) {
		donorRepo.save(donor);
		
	}

	@Override
	public Donor updateDonor(Donor donor) {
		if(donor.getId() != null) {
			donorRepo.save(donor);
		}
		return donor;
	}

	@Override
	public Optional<Donor> findById(Integer id) {
		// TODO Auto-generated method stub
		return donorRepo.findById(id) ;
	}

	@Override
	public void deleteDonor(Integer id) {
		donorRepo.deleteById(id);
		
	}

}
