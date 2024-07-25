package com.dhanush.springproject.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class loadController {

  @GetMapping("/home")
  public String home() {
    return "home";
  }

}
