package project;
import java.util.*;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength=10;
    private String email;
    private String companySuffix ="xyzcompany.com";



    public Email(String firstName,String lastName)
    {
        this.firstName =firstName;
        this.lastName=lastName;
        System.out.println("EMAIL CREATED: "+this.firstName+""+this.lastName);
        
        this.department=setDepartment();
        System.out.println("Department: " +this.department);

        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your password is "+this.password);
        email =firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix; 
        

    }


    private String setDepartment()
    {
        System.out.println("DEPARTMENT CODES \n1 for Sales\n2 for Development\n3 for Accouting\n0 for none ");
        Scanner in =new Scanner(System.in);
        int depChoice =in.nextInt();
        if(depChoice==1)
        {
            return "sales";

        }
        else if(depChoice==2){return "dev"; }
        else if(depChoice==3){return "acct"; }
        else{return "";}

    } 
    private String randomPassword(int length)
    {
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char [] password =new char[length];
        for(int i=0;i<length;i++)
        {
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);

        }
        return new String(password);
    }
    public void setMailBoxCapacity(int capacity )
    {
        this.mailBoxCapacity=capacity;

    }
    public void setAlternateEmail(String altEmail)
    {
        this.alternateEmail = altEmail;
    } 
    public void changePassword(String password)
    {
        this.password=password;
    }
    public int getMailBoxCapacity() {return mailBoxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword() {return password;}

    public String showInfo()

    {
        return "DISPLAY NAME:" +firstName+" "+lastName+"\n"+
                "COMPANY EMAIL:" + email +"\n"+
                "MAILBOX CAPACITY:"+mailBoxCapacity+"mb";
    }



    
}
