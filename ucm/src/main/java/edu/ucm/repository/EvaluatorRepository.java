package edu.ucm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ucm.model.Evaluator;

public interface EvaluatorRepository extends JpaRepository<Evaluator, Long> {
	
}
