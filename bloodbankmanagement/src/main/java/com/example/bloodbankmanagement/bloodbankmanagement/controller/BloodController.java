package com.example.bloodbankmanagement.bloodbankmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bloodbankmanagement.bloodbankmanagement.entity.Blood;
import com.example.bloodbankmanagement.bloodbankmanagement.service.BloodService;
import com.example.bloodbankmanagement.bloodbankmanagement.util.BloodBankUtils;
import com.example.bloodbankmanagement.bloodbankmanagement.util.DonorApprovedCommand;
import com.example.bloodbankmanagement.bloodbankmanagement.util.DonorInSearchCommand;
import com.example.bloodbankmanagement.bloodbankmanagement.util.DonorRequestCommand;

@RestController
@RequestMapping(value="/api")
public class BloodController {


    @Autowired
    private BloodService bloodService;
    @GetMapping("/approved/{phase}")
	public ResponseEntity<String> approved(@PathVariable("phase") String phase) {

			BloodBankUtils bloodUtils = new BloodBankUtils(phase);
			DonorApprovedCommand donorStage = new DonorApprovedCommand(bloodUtils);
			donorStage.execute();
			return new ResponseEntity<String>("approved for " + phase + "blood", HttpStatus.OK);
	}

	@GetMapping("/search/{phase}")
	public ResponseEntity<String> search(@PathVariable("phase") String phase) {

		BloodBankUtils bloodUtils = new BloodBankUtils(phase);
		DonorInSearchCommand donorStage = new DonorInSearchCommand(bloodUtils);
		donorStage.execute();
		return new ResponseEntity<String>("Search for " + phase + "blood", HttpStatus.OK);
	}

	
	@GetMapping("/request/{phase}")
	public ResponseEntity<String> request(@PathVariable("phase") String phase) {


		BloodBankUtils bloodUtils = new BloodBankUtils(phase);
		DonorRequestCommand donorStage = new DonorRequestCommand(bloodUtils);
		donorStage.execute();
		return new ResponseEntity<String>("Request for " + phase + "blood", HttpStatus.OK);
	}
	

    @GetMapping("/getAll")
    public List<Blood> allBloods() {

        return allBloods();
    }

    @PostMapping("/addBlood")
    public String addBloods(@RequestBody Blood blood) {

         bloodService.saveBloods(blood);
         
         return "blood details are added successfully";
    }

    @PutMapping(value="/{id}")
    public Blood updateBlood(@RequestBody Blood blood) {
        return bloodService.updateBloods(blood);

    }

    @GetMapping(value = "/{id}")
    public  Optional<Blood> getBloodById(@PathVariable Integer id) {
        return bloodService.findById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteBlood(@PathVariable ("id")Integer id) {
        bloodService.deleteBlood(id);

    }
} 
