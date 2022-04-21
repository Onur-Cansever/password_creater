import java.util.Scanner;

public class Ui {
    private Scanner input;
    private String password;

    public Ui() {
        input = new Scanner(System.in);
        
        System.out.println("How many characters do you need on your password ?");

        PwdCrtr pwdcrtr = new PwdCrtr();
        password = pwdcrtr.createPassword(input.nextInt());
        System.out.println("Your password is: " + password);

        System.out.println("Have a nice day!");
    }
}