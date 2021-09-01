package com.ivoronline.springboot_db_query_jpql_projection_interface_closed.repositories;

import com.ivoronline.springboot_db_query_jpql_projection_interface_closed.entities.Person;
import com.ivoronline.springboot_db_query_jpql_projection_interface_closed.entities.PersonView;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

  //=======================================================================================
  // RETURN PERSON VIEW
  //=======================================================================================
  @Query(value = "SELECT john FROM Person john WHERE john.name = 'John' AND john.age  = 20")
  PersonView returnPersonView();

}

