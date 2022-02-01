package ru.stqa.pft.studynotes;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.studynotes.Square;

public class SquareTests {

  @Test //анотация
  public void testArea() {
    Square s = new Square(5);
    /*assert s.area() == 24; // 1. вар. сравнение результата. ОР не показывает*/
    Assert.assertEquals(s.area(),25); // показывает ОР в случае ошибки
  }
}
