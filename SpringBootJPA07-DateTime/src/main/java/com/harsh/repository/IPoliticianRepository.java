package com.harsh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.harsh.entity.Politician;

public interface IPoliticianRepository extends JpaRepository<Politician, Integer> {

	// @Query(value="select round(timestampdiff(DAY,dob,curdate())/365.25,2) from Politician where pid=:id",nativeQuery = true) //for mysql
	@Query(value = "select round((sysdate-dob)/365.25, 2) from Politician  where  pid=:id", nativeQuery = true) //fororacle
	public float fetchPoliticianAgeById(int id);

	// @Query(value="select pname,round(timestampdiff(DAY,dob,curdate())/365.25,2) from Politician",nativeQuery = true) //for mysql
	@Query(value = "select pname,round((sysdate-dob)/365.25,2) from Politician", nativeQuery = true)
	public List<Object[]> fetchPolicianNameAgeDetails();
}
