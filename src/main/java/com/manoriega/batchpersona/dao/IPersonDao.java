package com.manoriega.batchpersona.dao;

import com.manoriega.batchpersona.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonDao extends JpaRepository<Person, Long> {
}
