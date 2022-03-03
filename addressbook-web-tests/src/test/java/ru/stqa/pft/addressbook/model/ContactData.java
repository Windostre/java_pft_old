package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstName;
  private final String middleName;
  private final String lastName;
  private final String nickName;
  private final String address;
  private final String mobileNumber;
  private final String email;
  private final String group;

  public ContactData(String firstName,String middleName, String lastName, String nickName, String address, String mobileNumber, String email, String group) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.nickName = nickName;
    this.address = address;
    this.mobileNumber = mobileNumber;
    this.email = email;
    this.group = group;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  public String getEmail() {
    return email;
  }

  public String getGroup() {
    return group;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getNickName() {
    return nickName;
  }

  public String getAddress() {
    return address;
  }
}
