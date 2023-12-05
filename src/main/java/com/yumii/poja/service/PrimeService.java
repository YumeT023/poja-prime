package com.yumii.poja.service;

import static java.math.BigInteger.probablePrime;

import com.yumii.poja.repository.PrimeRepository;
import com.yumii.poja.repository.model.Prime;
import java.time.Instant;
import java.util.Random;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PrimeService {
  public static int BIT_LEN = 10_000;

  private final PrimeRepository repository;

  private static String doGeneratePrime() {
    return probablePrime(BIT_LEN, new Random()).toString();
  }

  public String generate() {
    var prime = Prime.builder().creationDatetime(Instant.now()).value(doGeneratePrime()).build();
    return repository.save(prime).getValue();
  }
}
