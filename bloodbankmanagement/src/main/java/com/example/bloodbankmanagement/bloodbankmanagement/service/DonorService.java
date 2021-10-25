package com.example.bloodbankmanagement.bloodbankmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.bloodbankmanagement.bloodbankmanagement.entity.Donor;

@Component
public interface DonorService {
	
    public List<Donor> findAllDonors();

    public void saveDonor(Donor donor);

    public Donor updateDonor(Donor donor);

    public Optional<Donor> findById(Integer id);

    public void deleteDonor(Integer id);
}