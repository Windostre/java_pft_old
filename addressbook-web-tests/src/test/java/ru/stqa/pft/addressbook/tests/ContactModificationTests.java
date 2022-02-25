package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("John", "Smith", "+5800223435", "j.smith@mail.com"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returnLinkToHomePage();
    app.getSessionHelper().logout();
  }
}
