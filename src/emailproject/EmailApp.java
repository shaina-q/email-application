package emailproject;


public class EmailApp{
public static void main(String[] args) {


        Email myemail= new Email("rosy","smith");// object because its not static
        myemail.changePassword("shianbsbs");
        System.out.println(myemail.getPassword());

        }
        }
