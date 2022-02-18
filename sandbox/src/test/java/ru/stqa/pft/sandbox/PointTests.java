package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testPoint1() {
    Point earth = new Point(2, 3);
    Point mars = new Point(2, -1);
    assert earth.distance(mars) == 4.0;
  }

  @Test
  public void testPoint2() {
    Point earth = new Point(0, 2);
    Point mars = new Point(0, -2);
    Assert.assertEquals(earth.distance(mars), 4);
  }

  @Test
  void testPoint3() {
    //Point earth = new Point(2,3);
    Point mars = new Point(1  ,-1);
    Assert.assertEquals(mars.distance(mars), 0);
  }
}
