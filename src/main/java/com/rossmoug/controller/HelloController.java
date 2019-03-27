package com.rossmoug.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HelloController {
  @RequestMapping(value = "/greeting", method = GET)
  public String sayHello(Model model) {
    model.addAttribute("greeting", "Hello World");

    return "hello";
  }
}
