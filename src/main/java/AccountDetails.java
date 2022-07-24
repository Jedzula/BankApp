import java.util.Scanner;

public class AccountDetails {

    private String name;
    private String accountNumber;
    private String login;
    private long balance;

    public void showAccount() {
        System.out.println("Yor account name is: " + name + ". " +
                "\nYour account number: " + accountNumber
                + ". \nYour login: " + login + ". \nYour balance: " + balance);
    }

    Scanner sc = new Scanner(System.in);

    public void createAccount(){
        System.out.println("Provide an account name: ");
        name = sc.next();

        System.out.println("Provide an account number: ");
        accountNumber = sc.next();

        System.out.println("Provide your login: ");
        login = sc.next();

        System.out.println("Provide your start balance: ");
        balance = sc.nextLong();
    }

}
