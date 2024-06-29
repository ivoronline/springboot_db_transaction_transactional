package com.ivoronline.springboot_db_transaction_transactional.service;

import com.ivoronline.springboot_db_transaction_transactional.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MyService {

  //PROPERTIES
  @Autowired private MyRepository myRepository;

  //=========================================================================================================
  // INSERT
  //=========================================================================================================
  @Transactional
  public void insert() throws Exception {

    //INSERT RECORDS
    for (int i = 1; i <= 2; i++) {
      if(i==2) { throw new RuntimeException("Exception"); }
      myRepository.insert("Person " + i, 10 * i);
    }

  }

}
