
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person 
{
    private String firstName;
    private String lastName;
    private char gender;
    private String dob;
    
    public Person()
    {
        firstName=" ";
        lastName=" ";
        gender=' ';
        dob=" ";
    }


    public Person(String firstName, String lastName, char gender,String dob) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob=dob;
    }

    public void calculateAge(String dob)
    {
        LocalDate today=LocalDate.now();
        DateTimeFormatter myFormat=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate myDOB=LocalDate.parse(dob,myFormat);
        
        Period period=Period.between(myDOB,today);
        int years=period.getYears();
        int month=period.getMonths();
        int days=period.getDays();
        System.out.println("My Age is :" +years+ "Years");
        
    }
    
    public void getFullName(String firstName, String lastName)
    {
        System.out.println(firstName+ " " +lastName);
    }
    
    public String toString() {
        return "FirstName:" + firstName + "\n"+  
                "LastName:" + lastName + "\n" +
                 "Gender:" + gender;
    }
    
    
    
}
