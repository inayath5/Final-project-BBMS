package com.example.bloodbankmanagement.bloodbankmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bloodbankmanagement.bloodbankmanagement.entity.Donor;
import com.example.bloodbankmanagement.bloodbankmanagement.service.DonorService;

@RestController
@RequestMapping("/donor")
public class DonorController {
	
	@Autowired
	DonorService donorService;
	
	@GetMapping("/getAllDonor")
    public List<Donor> allDonors() {
        return donorService.findAllDonors();
    }

    @PostMapping()
    public String addDonor(@RequestBody Donor donor) {
        System.out.println("save"+donor);
         donorService .saveDonor(donor);
         return "Donor added successfully";
    }

    @PutMapping(value="/{id}")
    public Donor updateDonor(@RequestBody Donor donor) {
        return donorService.updateDonor(donor);

    }

    @GetMapping(value = "/{id}")
    public Optional<Donor> getDonorById(@PathVariable Integer id) {
        return donorService.findById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteDonor(@PathVariable ("id")Integer id) {
        donorService.deleteDonor(id);

    }


}
