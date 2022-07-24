import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        AccountDetails accountDetails = new AccountDetails();
        int inputNumber;

        System.out.println("Hello You. Welcome in our bankApp");

        do {
            System.out.println("\nSelect an option: \n 1. Create new account. \n 2. Your account details. \n 3. Money deposite. \n 4. Exit." );
            inputNumber = sc.nextInt();
            switch (inputNumber) {
                case 1:
                    accountDetails.createAccount();
                case 2:
                    accountDetails.showAccount();
                    break;
                case 3:
                    accountDetails.depisit();
                    break;
            }
        }while(inputNumber !=4);

            }
        }



