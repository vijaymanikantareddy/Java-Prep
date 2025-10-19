package com.flm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.flm.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("select u from User u where name= :name")
	User findByUserName(@Param("name") String name);

	@Query(value = "select * from usersinfo where age=?1", nativeQuery = true)
	User findByUserAge(int age);

	User findByName(String name);

	User findByNameAndAge(String name, int age);

	List<User> findByNameOrAge(String name, int age);

	List<User> findByNameStartingWith(String name);
}
