package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Mariya", "Ivanovna", "Petrova"
              , "TestNick", "3 Vavilova STR", "+7(123)123-12-12", "test_mail@test.com"
              , null), true);
    }
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().pressDeleteContact();
    app.getContactHelper().submitContactDelete();
    app.getNavigationHelper().goToHomePage();
    app.getSessionHelper().logout();
  }

}
