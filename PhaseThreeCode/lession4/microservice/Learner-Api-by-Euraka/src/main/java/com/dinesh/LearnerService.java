package com.dinesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

@Service
public class LearnerService {
//	Have list of Learners
	ArrayList<Learner> learners = new ArrayList<>(
			Arrays.asList(new Learner("Shivani", "Bangalore", 778), new Learner("Anand", "AP", 7678),
					new Learner("Namrata", "Delhi", 178), new Learner("Ashok", "Mangalore", 8)));

	List<Learner> getAllLearners() {
		return learners;
	}

	Learner getLearnerById(int id) {
		Learner learner = null;
		try {
			learner = learners.stream().filter(ref -> ref.id().equals(id)).findFirst().get();
		} catch (NoSuchElementException e) {
			throw new LearnerNotFoundException();
		}
		return learner;
	}

	void addLearner(Learner theLearner) {
		learners.add(theLearner);
	}

	void updateLearner(Learner theLearner,Integer id) {
		learners.set(learners.indexOf(learners.stream().filter(ref -> ref.id().equals(id)).findFirst().get()),
				theLearner);
	}

	void deleteLearner(int id) {
		learners.remove(learners.indexOf(learners.stream().filter(ref -> ref.id().equals(id)).findFirst().get()));
	}
}
