package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    /* Задание 2.1  объявление переменных через созданный класс */
    Point earth = new Point(1, 3); // значения перменной = this для класса
    Point mars = new Point(2, -1);

    /* Задание 2.3 запуск функции */
    //distance(p1, p2); // вызов функции
    System.out.println("Растояние между точками " + "p1 (" + earth.x + "," + earth.y + ")" + " и " + "p2 (" + mars.x + "," + mars.y + ")" + " = " + earth.distance(mars));
  }

  /* Задание 2.2 функция */
  /* public static double distance(Point earth, Point mars) {

    return Math.sqrt((earth.x - mars.x) * (earth.x - mars.x) + (earth.y - mars.y) * (earth.y - mars.y));

  } */

}