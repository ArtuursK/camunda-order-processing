package com.arturs;

import camundajar.impl.com.google.gson.Gson;
import camundajar.impl.com.google.gson.GsonBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CamundaApplication {

  public static void main(String... args) {
    SpringApplication.run(CamundaApplication.class, args);
  }

  @Bean
  public Gson gson() {
    return new GsonBuilder().setPrettyPrinting().create();
  }

}
