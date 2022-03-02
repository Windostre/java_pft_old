package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Юрий", "Гагарин", "+71231231212", "wyrdsir@gmail.com", "test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnLinkToHomePage();
    app.getSessionHelper().logout();
  }

}
