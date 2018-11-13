// ************** The Banking Interface *************

// a class for a user to interact with a Banking System
// obviously, this is a dumb interface
import java.util.Scanner;
class BankingConsole {
    private BankingService forService;

    public BankingConsole(BankingService forService){
        this.forService = forService;
    }

    Scanner keyboard = new Scanner(System.in);

    public void loginScreen() {
        System.out.println("Welcome to the Bank. Please log in.");
        System.out.print("Enter your username: ");
        String username = keyboard.next();
        System.out.print("Enter your password: ");
        int password = keyboard.nextInt();
        try {
            this.forService.login(username,password);
        } catch (LoginFailedException e) {
            System.out.println("Login failed -- please try again\n");
            this.loginScreen();
        }
    }
}