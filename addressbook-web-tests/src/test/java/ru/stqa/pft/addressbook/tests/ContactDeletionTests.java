package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;


public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    /* Предусловие: проверка наличия контакта, если нет - создать*/
    if (!app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoGroupPage();
      /* Проверка наличия группы для создания контакта, если нет - создать*/
      if (!app.getGroupHelper().isThereAGroup()) {
        app.getGroupHelper().createGroup(new GroupData("test1", null, null));
      }
      app.getContactHelper().createContact(new ContactData("Mariya", "Ivanovna", "Petrova"
              , "TestNick", "3 Vavilova STR", "+7(123)123-12-12", "test_mail@test.com"
              , null), true);
    }

    /* Тест */
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().pressDeleteContact();
    app.getContactHelper().submitContactDelete();
    app.getNavigationHelper().goToHomePage();
    app.getSessionHelper().logout();
  }

}
