package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    /*  Проверка наличия группы для создания контакта, если нет - создать */
    app.getNavigationHelper().gotoGroupPage();
   if (!app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("group1", null, null));
    }

    /* Тест */
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("NewFirst", "NewMiddle", "NewLast"
            , "New", "3 Vavilova STR", "+7(123)123-12-12", "new@test.com"
            , "group1" ), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnLinkToHomePage();
    app.getSessionHelper().logout();
  }

}
