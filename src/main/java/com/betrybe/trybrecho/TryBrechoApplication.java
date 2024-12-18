package com.betrybe.trybrecho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class TryBrechoApplication {

  public static void main(String[] args) {
    SpringApplication.run(TryBrechoApplication.class, args);
  }

}
