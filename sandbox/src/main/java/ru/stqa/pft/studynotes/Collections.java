package ru.stqa.pft.studynotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void main(String[] args) {
    /* Альетрнативный способ объеявления массива
    String[] langs = new String[4];
    langs[0] = "Java";
    langs[1] = "C#";
    langs[2] = "Python";
    langs[3] = "PHP"
    */

    String[] langs = {"Java", "C#", "Python", "PHP"};// Объявлена переменная массив строк [];

    List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP"); // преобразовали массив в список;

    /* Альетрнативный способ объеявления массива
    List<String> languages = new ArrayList<String>(); // лева интерефейс, справа класс, котороый реализует интерфейс;
    languages.add("Java");
    languages.add("C#");
    languages.add("Python");
*/
    for (String l : languages) {
      System.out.println("Я хочу выучить " + l);
    }
  }
}