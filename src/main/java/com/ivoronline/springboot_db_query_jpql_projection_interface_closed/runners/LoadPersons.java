package com.ivoronline.springboot_db_query_jpql_projection_interface_closed.runners;

import com.ivoronline.springboot_db_query_jpql_projection_interface_closed.entities.Person;
import com.ivoronline.springboot_db_query_jpql_projection_interface_closed.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LoadPersons implements CommandLineRunner {

  @Autowired PersonRepository personRepository;

  @Override
  @Transactional
  public void run(String... args) {
    personRepository.save(new Person("John" , 20));
    personRepository.save(new Person("John" , 21));
    personRepository.save(new Person("Bill" , 30));
    personRepository.save(new Person("Nancy", 40));
    personRepository.save(new Person("Susan", 50));
  }

}

