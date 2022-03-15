package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    /* Предусловие: проверка наличия контакта, если нет - создать*/
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("NewFirst", "NewMiddle", "NewLast"
              , "New", "3 Vavilova STR", "+7(123)123-12-12", "new@test.com"
              , null));
    }

    /* Тест */
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("ModifiedFirst", "ModifiedMiddle", "ModifiedLast"
            , "ModifiedNick", "Modified address", "8-00000-00-00", "modified@test.com"
            , null), false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returnLinkToHomePage();
    app.getSessionHelper().logout();
  }
}
