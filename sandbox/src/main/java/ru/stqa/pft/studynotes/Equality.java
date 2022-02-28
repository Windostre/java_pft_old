package ru.stqa.pft.studynotes;

public class Equality {
  public static void main(String[] args) {
    //String s1 = "firefox";
   // String s2 = s1;
   // String s2 = new String(s1);
   // String s2 = "firefox";
    // String s2 = "fire" + "fox";
    String s1 = "firefox 2.0";
    String s2 = "firefox " + Math.sqrt(4.0);


    System.out.println(s1 == s2); // проверка ссылок на объект. Сравнивать числа
    System.out.println(s1.equals(s2)); // сравнение (логическое) содержимого. сравнивать объекты
  }
}
