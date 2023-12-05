package com.yumii.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.yumii.poja.conf.FacadeIT;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class PrimeControllerIT extends FacadeIT {
  private static final int TOLERANCE = 100;

  @Autowired PrimeController controller;

  @Test
  public void generated_number_is_probably_prime() {
    var probableNumber = controller.newPrime();
    assertTrue(new BigInteger(probableNumber).isProbablePrime(TOLERANCE));
  }
}
