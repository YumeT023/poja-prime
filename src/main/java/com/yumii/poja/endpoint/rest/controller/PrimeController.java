package com.yumii.poja.endpoint.rest.controller;

import com.yumii.poja.service.PrimeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PrimeController {

  private final PrimeService service;

  @GetMapping("/new-prime")
  public String newPrime() {
    return service.generate();
  }
}
