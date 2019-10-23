package com.company;
import java.util.Scanner;                           //needed for user input
import java.util.regex.Matcher;                     //needed to validate student email
import java.util.regex.Pattern;                     //needed to validate student email\


    public class studentprofile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //-------------------------------------------------------

        int student;    int countloop=0; String buffer1; String buffer2;

        do{
            System.out.println("How many student's data will be entered?"); //*****************************************//

            while(!sc.hasNextInt()){
                String input = sc.next();
                System.out.println("Enter only integers!");
            }

        }while(!sc.hasNextInt());
        student = sc.nextInt();

        System.out.println("This is the value for students: " + student);

        buffer1 = sc.nextLine();                                                 // needs a buffer wont work with out it

        do{

        //-------------------------------------------------------

        String studentfirst;                                                       //global variable
        do {
            System.out.println("Hello, what is your first name?");                 //input first name of student

            studentfirst = sc.nextLine();

            if (!studentfirst.matches("[a-zA-Z+]+")) {
                System.out.println("Invalid entry! Try again!");
            }                    //error message if invalid entry for studentname
        /*while(!studentfirst.matches("[a-zA-Z+]+")){                     //this is used to check for letter input
            System.out.println("Enter a valid name!");
            studentfirst = sc.nextLine();
        }*/
        }
        while (!studentfirst.matches("[a-zA-Z+]+"));                        //continues loop until user uses appropriate input (a-z)
//-------------------------------------------------------
        String studentlast;                                                     //global variable
        do {
            System.out.println("What is your last name?");                          //input last name of student
            studentlast = sc.nextLine();

            if (!studentlast.matches("[a-zA-Z+]+")) {
                System.out.println("Invalid entry! Try again!");
            }
        }
        while (!studentlast.matches("[a-zA-Z+]+"));
//-------------------------------------------------------
        int Id;
        int Idcount = 0;
        int Idcount2 = 0;
        int Idholder = 0;                  //global variables, to use outside of loop, they need to be initialize outside
        do {
            System.out.println("What is your PeopleSoft ID (Don't use original, input 7 digit number)");   //input of peoplesoft ID
            while (!sc.hasNextInt()) {                                        //if the NEXT input does not have an INT
                String input = sc.next();                                   //determines if String input is an INTEGER
                System.out.println("Invalid entry! Try again! Input integers.");            //if invalid then this code exits
            }
            Id = sc.nextInt();                                        //if input is integer than it's assigned to Id

            Idholder = Id;                                          //the following code counts the number of spaces user input
            while (Idholder != 0) {                                     //Idhodler is used to initialize the following code to count
                Idholder = Idholder / 10;                             //idholder is divicded by 10 until it equals 0
                Idcount++;                                          //everytime the loop runs Idcount will be counting, to determine how many numbers user input
                Idcount2 = Idcount;     //do I need this?
            }
            // System.out.println(Idcount2);                                 //testing character #
            Idcount = 0;                                                    //need to set count back to zero after loop
        }
        while (Id <= 0 || Idcount2 != 7);                        //if Id is less than 0 or Idcount is less than 7 then loop will start over.
//-------------------------------------------------------
        int studentyear;                                                   //global variable initialized
        do {
            System.out.println("What is your class standing? (1 year , 2 year, 3 year , or 4 year student)");
            while (!sc.hasNextInt()) {
                String input = sc.next();                                  //check if string input is an INTEGER
                System.out.println("Invalid entry! Try again! Input integers.");
            }
            studentyear = sc.nextInt();                                    //what year, student input
        }
        while (studentyear >= 5 || studentyear <= 0);                 //loop will restart if year is not 1 2 3 or 4
//-------------------------------------------------------
        String studentemail;
        String emailcheck;
        boolean e = false;
        do {
            System.out.println("What is your email?");                             //input email of student
            studentemail = sc.next();

            String email_regex = "^[a-zA-Z0-9_+&*-]+(?:\\." +                //this is the values available for the user to input
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";
            emailcheck = studentemail;
            e = emailcheck.matches(email_regex);

            if (!e) {                                                        //this code will run if email input is invalid
                System.out.println("Invalid input! Try again!");
            }

            //TEST System.out.println("Hey it works look " + studentemail + "---check " + emailcheck);
        }
        while (!e);
        String placeholder = sc.nextLine();             //this is needed, idk why but it works, other wise it skips the next String addresline

//-------------------------------------------------------
            String addressline;
            // String addresscheck;
            boolean a = false;
            do {
                System.out.println("What is your home address? Please Enter one at a time.");
                System.out.println("What is your address line 1?");
                addressline = sc.nextLine();

                if(!addressline.matches("[0-9a-zA-Z ]*+")){
                    System.out.println("Invalid input! Try again!");
                }

                // System.out.println(addressline + " check " + addresscheck);
            }
            while (!addressline.matches("[0-9a-zA-Z ]*+"));
//-------------------------------------------------------


        String studentcity;                             //global variable
        do {
            System.out.println("Input City");
            studentcity = sc.nextLine();               //takes user input

            if (!studentcity.matches("[a-zA-Z ]*+")) {        //this checks that studentcity contains only letter and blank spaces
                System.out.println("Invalid Entry! Try again!");    // invalid entry of numbers or symbols will activate this code.
            }

        }
        while (!studentcity.matches("[a-zA-Z ]*+"));        //if studentcity does now meet requirements loop will keep re initializing

//-------------------------------------------------------
        String studentstate;                             //global variable
        do {
            System.out.println("Input State");
            studentstate = sc.nextLine();               //takes user input

            if (!studentstate.matches("[a-zA-Z ]*+")) {   //checks to see if studentstate meets requirements of only letters and spaces
                System.out.println("Invalid input! Try again!");
            }
        }
        while (!studentstate.matches("[a-zA-Z ]*+"));     //has to meet requirements or it will re initialize the loop
//-------------------------------------------------------
        int studentzipcode;
        int zipcodecount;
        int countholder = 0;
        int countholder2 = 0;
        do {
            System.out.println("Input a 9 digit zipcode");
            while (!sc.hasNextInt()) {
                String input = sc.next();                     //user input stored in INPUT while validating it
                System.out.println("Invalid entry! Try again! 9 digit zip code");
            }
            studentzipcode = sc.nextInt();                  //if users input is valid then it's sent to studentzipcode

            zipcodecount = studentzipcode;
            while (zipcodecount != 0) {
                zipcodecount = zipcodecount / 10;          //counts the numbers of digits
                countholder++;
                countholder2 = countholder;             //countholder2 is used to count the number of digits
            }
            countholder = 0;                            //set back to zero! otherwise loop will never end
            //System.out.println(countholder2 + " holder2 ");
        }
        while (studentzipcode <= 100000000 || countholder2 != 9);        //zipcode has to be 5 digits and greater than 10000


//-------------------------------------------------------
        System.out.println("------------- Department of ILT ---------------");
        System.out.println("******* Student details are as follows *******");

        System.out.println("First name:   " + studentfirst + "\nLast name:    " + studentlast);
        System.out.println("Year:         " + studentyear + "\nID:           " + Id);
        System.out.println("e mail:       " + studentemail + "\naddress line: " + addressline);
        System.out.println("City:         " + studentcity + "\nState:        " + studentstate);
        System.out.println("Zipcode:      " + studentzipcode);

        //System.out.println("Total number of students is :" + student);

        buffer2 = sc.nextLine();                                                 // needs a buffer wont work with out it

//-------------------------------------------------------

        countloop++;                                             //goes on bottom to keep track of student count

        // test System.out.println("Countlopp = " + countloop + "  student count = " + student );
    }
        while(student < 0  || student != countloop);            // the whole porgram stops after user has placed all the info
                                                                // of all the students he asked for.


        System.out.println("Total number of students is :" + student);  //total displayed at end of code

    }}

//still need this
/*
A. First, the application should ask how many students’ data (“N”) are to be entered.   done
B. Then initialize an array of objects to that number                                   nah
C. Define a Class named Student with the student details from 1. – 6. As fields.
D. The Student Class should have a method “getInfo” to obtain the student details. When
reading each input, you should validate the data as described from i. – viii.
E. The Student class should have a method “displayInfo” to display the student details.
Each student data needs to be printed in a separated line with each data separated by
a space (use “\t”).
F. The Student class should have a static member “count” to count the number of         countloop done
students.
G. While printing, the display should have a header line as “Students Details, Department
of ILT”.
H. At the bottom of the display, it should print “Number of students: count”, where count
should be equal to N.
[Optional: You could use GUI for getting inputs if you like. You will get ten extra points.]
 */



