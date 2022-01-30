package ru.stqa.pft.studynotes;

import ru.stqa.pft.sandbox.Point;

public class MyStudyNote {

  public static void main(String[] args) {

    hello("world");
    hello("user");
    hello("Mariya");

    Square s = new Square(5); // Создание объекта класса Square, s это не сокращение. В скобках значение параметра из конструктора
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area()); // s.area() обращение к методоу

    Rectangle r = new Rectangle(4, 6); // Создание объекта класса Rectangle, r это не сокращение. В скобках значение параметра из конструктора
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");

    /*математические выражения
    System.out.println(2 + 2);
    System.out.println(2 * 2);
    System.out.println(2 / 2);
    System.out.println(2 - 2);
    System.out.println(1 / 2); // выведет 0, так как округление до ближайшего целого числа
    System.out.println(1.0 / 2); // выведет 0.5
    System.out.println(1 / 2.0); //выведет 0.5
    System.out.println("2" + "2"); // 22 - конкатенация
    System.out.println("2" + 2); // 22 - конкатенация
    System.out.println(2 + "2");// 22 - конкатенация
    System.out.println(2 + 2 * 2);// приоритет как в математике
    System.out.println("2 + 2 = " + 2 + 2); // выведет 2 + 2 = 22
    System.out.println("2 + 2 = " + (2 + 2)); // выведет 2 + 2 = 4
*/
  }
  }
