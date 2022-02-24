package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Смирнова", "Лена", "+71231231212", "wyrdsir@gmail.com"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
    app.getSessionHelper().logout();
  }

}
