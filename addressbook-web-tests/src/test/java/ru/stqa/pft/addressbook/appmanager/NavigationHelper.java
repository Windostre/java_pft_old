package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
   super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }
  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }
  public void returnLinkToHomePage() {
    wd.findElement(By.linkText("home page")).click();
  }
  public void goToHomePage() {
    click(By.partialLinkText("home"));
  }
}
