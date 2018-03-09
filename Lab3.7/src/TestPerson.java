import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class TestPerson
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Person allperson=new Person();
        String firstName;
        String lastName;
        String gender;
        
        
        System.out.println("First Name:");
        firstName=sc.next();
        
        System.out.println("Last Name:");
        lastName=sc.next();
        
        System.out.println("Gender:");
        gender=sc.next();
        
        System.out.println("Enter ur DOB:");
        String dob=sc.next();
        
        
        allperson=new Person(firstName,lastName,gender.charAt(0),dob);
        System.out.println(allperson);
        allperson.getFullName(firstName,lastName);
        allperson.calculateAge(dob);
       // allperson.getFullName(firstName,lastName);
        
    }

}

