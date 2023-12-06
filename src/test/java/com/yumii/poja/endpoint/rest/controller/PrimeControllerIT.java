package com.yumii.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.yumii.poja.conf.FacadeIT;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class PrimeControllerIT extends FacadeIT {
  private static final int TOLERANCE = 100;

  @Autowired
  PrimeController controller;

  @Test
  public void generated_number_is_probably_prime() {
    var generated = controller.newPrime();
    assertTrue(new BigInteger(generated).isProbablePrime(TOLERANCE));
  }

  @Test
  public void retrieves_last_10th_generated_primes() {
    var initial = controller.findGeneratedPrimes();
    assertEquals(1 /* accounting test1 */, initial.size());

    for (int i = 0; i < 11; i++) {
      controller.newPrime();
    }

    var last10thPrimes = controller.findGeneratedPrimes();
    assertEquals(10, last10thPrimes.size());
  }
}
