package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    /* Предусловие: проверка наличия контакта, если нет - создать*/
    if (!app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoGroupPage();
      /* Проверка наличия группы для создания контакта, если нет - создать*/
        if (!app.getGroupHelper().isThereAGroup()) {
        app.getGroupHelper().createGroup(new GroupData("group1", null, null));
      }
      app.getContactHelper().createContact(new ContactData("NewFirst", "NewMiddle", "NewLast"
              , "New", "3 Vavilova STR", "+7(123)123-12-12", "new@test.com"
              , "group1"));
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
