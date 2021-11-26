package com.ivoronline.springboot_db_query_jpql_projection_interface_closed.entities;

// Interface can only have Methods. It can't have Properties/State.
public interface PersonProjection {
  String getName();
  String getAge();
}
