package ru.spring.datajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.spring.datajpa.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
