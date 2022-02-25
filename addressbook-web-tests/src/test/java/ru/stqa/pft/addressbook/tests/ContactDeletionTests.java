package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.*;


public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    app.getContactHelper().selectContact();
    app.getContactHelper().pressDeleteContact();
    app.getContactHelper().submitContactDelete();
    app.getNavigationHelper().goToHomePage();
    app.getSessionHelper().logout();
  }

}
