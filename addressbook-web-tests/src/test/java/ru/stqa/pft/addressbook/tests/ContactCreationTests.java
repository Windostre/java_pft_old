package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Mariya","Ivanovna", "Petrova"
    , "TestNick", "3 Vavilova STR", "+7(123)123-12-12","test_mail@test.com"
    , null), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnLinkToHomePage();
    app.getSessionHelper().logout();
  }

}
