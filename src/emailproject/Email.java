package emailproject;


import java.util.Scanner;

    public class Email {


        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String department;
        private int mailboxcapacity = 500;
        private int defaultpasswordlength = 10;
        private String alternatEmail;
        private String companySuffix = "aeycompany.com";


        // Constructor to receive the first and lastname; - ALSO KNOW AS SETTER METHOD (SET BECAUSE ITS PRIVATE VARIABLES)

        public Email(String firstName, String lastName) {    // NOT Static = Create Obj

            this.firstName = firstName; // class private attribute equals parameter
            this.lastName = lastName;// we use this.private variable so we can use attributes easily through project
            System.out.println("EMAIL CREATED : " + this.firstName + " " + this.lastName);

// call method asking for the department - return the department
            this.department = setDepartment();// private method must be under public class
            System.out.println("Department: " + this.department);

            // call method that returns a random password
            this.password = randompassword(defaultpasswordlength);
            System.out.println("Your password is:" + this.password);

            // combine elements to generate email
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
            System.out.println("Your email is: " + email);
        }


// Ask for the department

        private String setDepartment() {
            System.out.println("New Worker: " + firstName + " DEPARTMENT CODES :\n1 for Sales  \n2 for Department \n3 for Accounting \n0 for none \nEnter the department code: ");
            Scanner myScan = new Scanner(System.in);
            int depChoice = myScan.nextInt();// what will the input variable be
            if (depChoice == 1) {
                return "sales";
            } else if (depChoice == 2) {
                return "development";
            } else if (depChoice == 3) {
                return "accounting";
            } else {
                return "none";
            }

        }

        // Generate a random password**

        private String randompassword(int length) {

            String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@$%"; // posibilities you can chose from , how many character we want
            char[] password = new char[length]; //number of characters  - length(parameter) - array **

            for (int i = 0; i < length; i++) {
                int rand = /*cast*/(int) (Math.random()/*between 0 & 1*/ * passwordSet.length()); // we want the lengh of passwordset -THIS MAKES IT RANDOM
                password[i] = passwordSet.charAt(rand); // pick character from passwordset and pass the character  them into passward array one at a time
            }
            return new String(password);
        }


        // Set  the mailbox capacity
        public void setMailboxcapacity(int capacity) {
            this.mailboxcapacity = capacity;

        }

        // set alternate email
        public void setAlternateEmail(String altEmail) {
            this.alternatEmail = altEmail;

        }

        //set password change
        public void changePassword(String password) {
            this.password = password;
        }


        public int getMailboxcapacity() {
            return mailboxcapacity;
        }

        public String getAlternatEmail() {
            return "Your new alternative email is: " + alternatEmail;
        }

        public String getPassword() {
            return "Your new Password is: " + password;
        }

        public String showInfo() {
            this.email = email;
            return "DISPLAY NAME : " + firstName + " " + lastName +
                    " Company Email: " + email +
                    " Mailbox Capacity: " + mailboxcapacity + "mb";
        }
    }


