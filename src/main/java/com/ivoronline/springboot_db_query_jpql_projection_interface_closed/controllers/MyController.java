package com.ivoronline.springboot_db_query_jpql_projection_interface_closed.controllers;

import com.ivoronline.springboot_db_query_jpql_projection_interface_closed.dto.PersonDTO;
import com.ivoronline.springboot_db_query_jpql_projection_interface_closed.entities.Person;
import com.ivoronline.springboot_db_query_jpql_projection_interface_closed.entities.PersonView;
import com.ivoronline.springboot_db_query_jpql_projection_interface_closed.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN PERSON VIEW
  //================================================================
  @RequestMapping("ReturnPersonView")
  PersonView returnPersonView() {
    PersonView personView = personRepository.returnPersonView();
    return     personView;
  }


}
