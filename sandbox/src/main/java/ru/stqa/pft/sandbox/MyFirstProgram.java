package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    /* Задание №2 пункт  1*/
    Point p1 = new Point(2, 3);
    Point p2 = new Point(2, -1);

    /* Задание №2 пункт  3*/
    double result = distance(p1, p2); // вызов функции
    System.out.println("Растояние между точками " + "p1 (" + p1.x + "," + p1.y + ")" + " и " + "p2 (" + p2.x + "," + p2.y + ")" + " = " + result);
  }

  /* Задание №2 пункт 2*/
  public static double distance(Point p1, Point p2) {
    double deltax = p1.x - p2.x;
    double deltay = p1.y - p2.y;
    double sqrtdeltax = deltax * deltax;
    double sqrtdeltay = deltay * deltay;

    return Math.sqrt(sqrtdeltax + sqrtdeltay);

  }

}