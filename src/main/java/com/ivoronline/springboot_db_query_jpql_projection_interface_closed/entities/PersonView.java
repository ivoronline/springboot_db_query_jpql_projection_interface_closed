package com.ivoronline.springboot_db_query_jpql_projection_interface_closed.entities;

// Interface can only have Methods. It can't have Properties/State.
public interface PersonView {
  String getName();
  String getAge();
}
