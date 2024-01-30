package com.tutorial.SpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonDAO extends JpaRepository<Person, Long> {
}
