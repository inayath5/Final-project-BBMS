package com.example.bloodbankmanagement.bloodbankmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bloodbankmanagement.bloodbankmanagement.entity.Blood;
import com.example.bloodbankmanagement.bloodbankmanagement.repository.BloodRepository;

@Service
public class BloodServiceImpl implements BloodService{

	@Autowired
    private BloodRepository bloodRepository;

	@Override
	public List<Blood> findAllBloods() {
		List<Blood> bloodList = new ArrayList<Blood>();
		bloodRepository.findAll().forEach(bloodList::add);
		return bloodList;
	}

	@Override
	public void saveBloods(Blood blood) {
		// TODO Auto-generated method stub
		bloodRepository.save(blood);
	}

	@Override
	public Blood updateBloods(Blood blood) {
		// TODO Auto-generated method stub
		if(blood.getId()!=null) {
			bloodRepository.save(blood);
		}
		return blood;
	}

	@Override
	public Optional<Blood> findById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Blood> blood = bloodRepository.findById(id);
		return blood;
	}

	@Override
	public void deleteBlood(Integer id) {
		bloodRepository.deleteById(id);
		
	}

    
}
