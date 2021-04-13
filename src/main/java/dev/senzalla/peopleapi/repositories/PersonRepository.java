package dev.senzalla.peopleapi.repositories;

import dev.senzalla.peopleapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
