package com.example.bloodbankmanagement.bloodbankmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.bloodbankmanagement.bloodbankmanagement.entity.Blood;

@Component
public interface BloodService {
	
    public List<Blood> findAllBloods();

    public void saveBloods(Blood blood);

    public Blood updateBloods(Blood blood);

    public Optional<Blood> findById(Integer id);

    public void deleteBlood(Integer id);
}
