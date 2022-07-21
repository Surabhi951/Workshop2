package com.bridgelabz;
import java.util.HashMap;
import java.util.Scanner;
public class AddressBook {

    HashMap<String, Contact> map = new HashMap<>();

    Scanner sc = new Scanner(System.in);
    static AddressBook book = new AddressBook();

    private Contact getUserInput() {
        System.out.print("Enter FirstName:");
        String FirstName = sc.next();

        System.out.println("Enter LastName: ");
        String LastName = sc.next();

        System.out.print("Enter Address: ");
        String Address = sc.next();

        System.out.print("Enter City: ");
        String City = sc.next();

        System.out.print("Enter State: ");
        String State = sc.next();

        System.out.print("Enter ZipCode: ");
        String ZIPCode = sc.next();

        System.out.print("Enter Mobile Number: ");
        String MobileNo = sc.next();

        System.out.println("Enter Email Id:");
        String emailId = sc.next();

        Contact person = new Contact();
        person.setFirstName(FirstName);
        person.setLastName(LastName);
        person.setAddress(Address);
        person.setCity(City);
        person.setZIPCode(ZIPCode);
        person.setState(State);
        person.setMobileNo(MobileNo);
        person.setEmailId(emailId);
        System.out.println(person);
        System.out.println();
        return person;
    }

    private void getUserChoice() {
        boolean isTerminate = false;
        while (!isTerminate) {
            System.out.println("1:Adding new contact \n" + "2:Print address book \n"  + "5:Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    Contact person = book.getUserInput();
                    map.put(person.getEmailId(), person);
                    break;

                case 2:
                    System.out.println(map);
                    break;

                case 3:
                    isTerminate = true;
                    break;
                default:
                    System.out.println("please select valid option");
                    break;
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to address book program");
        book.getUserChoice();
    }
}
