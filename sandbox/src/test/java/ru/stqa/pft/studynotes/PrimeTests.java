package ru.stqa.pft.studynotes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {

  @Test
  public  void testPrime() {
    Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));
  }

  @Test
  public  void testNonePrime() {
    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
  }

  @Test(enabled = false) // отключение теста
  public  void testPrimeLong() {
    long n = Integer.MAX_VALUE;
    Assert.assertTrue(Primes.isPrime(n));
  }
 }
