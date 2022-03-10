package ru.stqa.pft.studynotes;

public class Primes {

  public static boolean isPrime(int n) {
    for (int i = 2; i < n; i ++) { // сокращенная форма от i = i + 1 от i += 1, i++ если прибавляется 1;
      if (n % i == 0) { // тело цикла;
        return false;
      }
    }
    return true;
  }

  public static boolean isPrimeFast(int n) {
    int m = (int) Math.sqrt(n); // (int) преобразуем корень к целому числу;
    for (int i = 2; i < m; i ++) { // делим не на все n, а тольок их половну;
      if (n % i == 0) { // тело цикла;
        return false;
      }
    }
    return true;
  }
/* Это альтернативный вариант - в данном случае работают оба*/
  public static boolean isPrimeWhile(int n) {
    int i = 2; // инициализация
    while (i < n && i != 0) { // проверка условий окончания;
      i++; // действие, которое увеличивает счетчик;
    }
    return i == n;
  }

  /* Вариации цикла for */
  public static boolean isPrime(long n) { // int Для 32 битных чисел, Long для 64 битных чисел;
    for (long i = 2; i < n; i ++) { // сокращенная форма от i = i + 1 от i += 1, i++ если прибавляется 1;
      if (n % i == 0) { // тело цикла;
        return false;
      }
    }
    return true;
  }
}
