package com.ivoronline.springboot_db_query_jpql_projection_interface_closed.controllers;

import com.ivoronline.springboot_db_query_jpql_projection_interface_closed.entities.PersonProjection;
import com.ivoronline.springboot_db_query_jpql_projection_interface_closed.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN PERSON PROJECTION
  //================================================================
  @RequestMapping("ReturnPersonProjection")
  PersonProjection returnPersonProjection() {
    PersonProjection personProjection = personRepository.returnPersonProjection();
    return personProjection;
  }

}
