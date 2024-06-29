package com.ivoronline.springboot_db_transaction_transactional.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.SQLException;

@Repository
public class MyRepository {

  //PROPERTIES
  @Autowired private JdbcTemplate jdbcTemplate;

  //=========================================================================================================
  // INSERT
  //=========================================================================================================
  public void insert(String name, int age) throws SQLException {
    jdbcTemplate.update(
      " INSERT INTO PERSON(NAME, AGE) VALUES(?, ?)"
      , new Object[] { name, age }
    );
  }


}

