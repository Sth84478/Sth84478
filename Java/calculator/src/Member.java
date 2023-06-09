import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {
     private String firstName;
    private String lastName;
    private int age;
    private String dateOfBirth;
    private int socialSecurityNumber;

    // Setters and getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Default empty constructor
    public Member(){

    }

    // Overload constructor
    public Member(String firstName, String lastName, int age, int socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Overload constructor for no SSN
    public Member(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void createHousehold(){
        Scanner userInput = new Scanner(System.in);
        List<Member> householdUnit = new ArrayList<>();
        boolean isFinished = false;
        while (!isFinished){
            System.out.println("Please enter the member's information");
            System.out.print("First name: ");
            setFirstName(userInput.nextLine());
            System.out.print("Last name: ");
            setLastName(userInput.nextLine());
            System.out.print("Age: ");
            setAge(Integer.parseInt(userInput.nextLine()));
            System.out.print("Social Security Number ");
            setSocialSecurityNumber(Integer.parseInt(userInput.nextLine()));
            System.out.print("Do you need to add another member? (Y/N): ");
            String keepGoing = userInput.nextLine();








        }
    }

}
