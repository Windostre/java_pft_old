package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    /* Задание 2.1  объявление переменных через созданный класс */
    Point p1 = new Point(2, 3);
    Point p2 = new Point(2, -1);

    /* Задание 2.3 запуск функции чере*/
    distance(p1, p2); // вызов функции
    System.out.println("Растояние между точками " + "p1 (" + p1.x + "," + p1.y + ")" + " и " + "p2 (" + p2.x + "," + p2.y + ")" + " = " + distance(p1, p2));
  }

  /* Задание 2.2 функция */
  public static double distance(Point p1, Point p2) {

    return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));

  }

}