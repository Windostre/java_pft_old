package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    /* Задание №2 пункт  1*/
    Point p1 = new Point(2, 3);
    Point p2 = new Point(2, -1);

    /* Задание №2 пункт  3*/
    double result = distance(p1, p2);
    System.out.println("Растояние между точками " + "p1 (" + p1.x + "," + p1.y + ")" + " и " + "t2 (" + p2.x + "," + p2.y + ")" + " = " + result);
  }

  /* Задание №2 пункт 2*/
  public static double distance(Point p1, Point p2) {
    double xdelta = p1.x - p2.x;
    double ydelta = p1.y - p2.y;
    double sqrtxdelta = xdelta * xdelta;
    double sqrtydelta = ydelta * ydelta;

    return Math.sqrt(sqrtxdelta + sqrtydelta);

  }

}