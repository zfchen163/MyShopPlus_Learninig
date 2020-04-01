package com.funtl.myshop.plus.business;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BusinessOAuth2Tests {

  public static void main(String[] args) {
    System.out.println(new BCryptPasswordEncoder().encode("secret"));
  }

}
