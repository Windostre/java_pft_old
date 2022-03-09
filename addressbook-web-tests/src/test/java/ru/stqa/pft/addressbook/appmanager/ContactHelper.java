package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
  public ContactHelper(WebDriver wd) {
    super(wd); // метод super - обращение к конструтору базового класса HelperBase
  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void fillContactForm(ContactData contact, boolean creation) {
    type(By.name("firstname"), contact.getFirstName());
    type(By.name("middlename"), contact.getMiddleName());
    type(By.name("lastname"), contact.getLastName());
    type(By.name("nickname"), contact.getNickName());
    type(By.name("address"), contact.getAddress());
    type(By.name("mobile"), contact.getMobileNumber());
    type(By.name("email"), contact.getEmail());

    if (creation) {
      if (contact.getGroup() != null) {
        new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contact.getGroup());
      } else {
        new Select(wd.findElement(By.name("new_group"))).selectByIndex(1);
      }
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void pressDeleteContact() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public void submitContactDelete() {
    wd.switchTo().alert().accept();
  }

  public void initContactModification() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void submitContactModification() {
    click(By.name("update"));
  }

  public void createContact(ContactData contact) {
    initContactCreation();
    fillContactForm(contact, true);
    submitContactCreation();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }
}
