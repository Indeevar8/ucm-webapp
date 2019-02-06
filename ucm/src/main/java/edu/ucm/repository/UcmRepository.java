package edu.ucm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ucm.model.Scheduler;

public interface UcmRepository extends JpaRepository<Scheduler, Long> {

}
