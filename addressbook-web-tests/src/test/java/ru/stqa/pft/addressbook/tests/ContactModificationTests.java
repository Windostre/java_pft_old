package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Mariya", "Ivanovna", "Petrova"
              , "TestNick", "3 Vavilova STR", "+7(123)123-12-12", "test_mail@test.com"
              , null), true);
    }
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Ivan", "Ivanovich", "Petrov"
            , "Modified Nick", "Modified address", null, "test_mail@test.com"
            , null), false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returnLinkToHomePage();
    app.getSessionHelper().logout();
  }
}
