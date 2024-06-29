package com.ivoronline.springboot_db_transaction_transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class SpringbootDbTransactionTransactionalApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootDbTransactionTransactionalApplication.class, args);
  }

}
