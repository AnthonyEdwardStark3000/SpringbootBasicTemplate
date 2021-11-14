package com.example.ATTENDANCECRUD.Studentrepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ATTENDANCECRUD.Entity.Studententity;

@Repository
public interface Studentrepository extends CrudRepository<Studententity,Long> {

	@Query(value = "SELECT * FROM student", nativeQuery = true)
	String[] studentcheck();
	
	
}
