import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        AccountDetails accountDetails = new AccountDetails();
        int inputNumber;

        System.out.println("Witaj w aplikacji bankowej");
        accountDetails.createAccount();

        do {
            System.out.println("Wybierz opcję \n 1. Wyświetl informacje o koncie");
            inputNumber = sc.nextInt();
            switch (inputNumber) {
                case 1:
                    accountDetails.showAccount();
                    break;
            }
        }while(inputNumber !=4);

            }
        }



