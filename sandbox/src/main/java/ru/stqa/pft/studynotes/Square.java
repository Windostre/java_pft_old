package ru.stqa.pft.studynotes;

public class Square {

  public double l;

  public Square(double l) { // Конструктор (псевдофункция), double l - параметры
    this.l = l; //this - специальная переменная, которая ссылается на конструируемый объект. this.l = атрибут, l = переменная, которая объевлена внутри функции
  }

  public double area() {

    return this.l * this.l;
  }
}

