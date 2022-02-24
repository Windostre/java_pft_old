package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactDeletionTests extends TestBase {
  //private boolean acceptNextAlert = true;

  @Test
  public void testContactDeletion() throws Exception {
    app.getContactHelper().selectContact();
    app.getContactHelper().pressDeleteContact();
    app.getContactHelper().closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"); // Уточнить и попправить
    app.getContactHelper().confirmContactDelete();
    app.getSessionHelper().logout();
  }


}
