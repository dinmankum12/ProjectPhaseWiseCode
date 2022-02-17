package com.dinesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnerController {

	@Autowired
	LearnerService service;

//	Fetch All Learners
	@RequestMapping("/learners")
	List<Learner> getAllLearners() {
		return service.getAllLearners();
	}

//	Fetch a Learner by id
	@RequestMapping("/learners/{id}")
	Learner getLearnerById(@PathVariable int id) {

		return service.getLearnerById(id);
	}

//	Add a new Learner
//	@RequestMapping(method = RequestMethod.POST, value = "/learners")
	@PostMapping("/learners")
	void addLearner(@RequestBody Learner theLearner) {
		service.addLearner(theLearner);
	}

//	Update learner
	@PutMapping("/learners/{id}")
	void updateLearner(@RequestBody Learner theLearner, @PathVariable Integer id) {
		service.updateLearner(theLearner, id);
	}

//	Delete learner
	@DeleteMapping("/learners/{id}")
	void deleteLearner(@PathVariable int id) {
		service.deleteLearner(id);
	}

}
