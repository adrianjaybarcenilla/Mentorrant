package com.Mentorrant.mentorrant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mentorrant.mentorrant.Entity.EbooksEntity;

@Repository
public interface EbooksRepository extends JpaRepository<EbooksEntity , Integer>{

	EbooksEntity findByGenre(String Genre);
	
}
