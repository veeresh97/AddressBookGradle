package com.GradleAddresBook;

public class AddressBookMain{
    private String FirstName;
    private String LastName;
    private String Address;
    private int Zip;
    private String City;
    private String State;
    private int PhoneNumber;
    private String Email;

    public AddressBookMain(String FirstName, String LastName, String Address, String City, int Zip,
                           String State, int PhoneNumber, String Email) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Zip = Zip;
        this.City = City;
        this.State = State;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }

    @Override
    public String toString() {
        return FirstName;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AddressBookMain details = new AddressBookMain("Veeresh", "SB", "xyzxyz",
                "Haveri", 00007,"Karnataka",1234567890,"abc@gmail.com");
        System.out.println(details);
    }
}
