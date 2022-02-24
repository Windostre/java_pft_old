package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
  public ContactHelper(WebDriver wd) {
    super(wd); // метод super - обращение к конструтору базового класса HelperBase
  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("mobile"), contactData.getMobileNumber());
    type(By.name("mobile"), contactData.getMobileNumber());
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }
  public void selectContact() {
    click(By.name("selected[]"));
  }
  public void confirmContactDelete() {
    click(By.linkText("home"));
  }

  public void pressDeleteContact() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public String closeAlertAndGetItsText() {
    boolean acceptNextAlert = true;
    try {
      Alert alert = wd.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true; // Уточнить и поправить
    }
  }
}
