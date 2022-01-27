package ru.stqa.pft.sandbox;

public class MyFirstProgram {

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
  }
}