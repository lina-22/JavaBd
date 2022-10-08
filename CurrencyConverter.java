
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
            double amount, bdt, rupee, ruble, pound, doller;
            int choice;

            Scanner sc = new Scanner(System.in);

            System.out.println("Which currency you want to convert?");

            System.out.println("1. Rupee, 2. Ruble, 3. Pound, 4. Doller");

            choice = sc.nextInt();

            System.out.println("How much Money you want to covert?");

            amount = sc.nextDouble();


            //Rupee to taka conversion
            if(choice == 1){
                bdt = amount * 1.192;
                System.out.println("Your " +amount + " Rupee is: "+ bdt + " Taka.");
            }else if(choice == 2) {
                bdt = amount * 1.577;
                System.out.println("Your "+amount + " Ruble is: "+ bdt + " Taka.");
            }else if(choice == 3) {
                bdt = amount * 109.4;
                System.out.println("Your "+amount + " Pound is: "+ bdt + " Taka.");
            }else if(choice == 4) {
                bdt = amount * 95.03;
                System.out.println("Your "+amount + " Doller is: "+ bdt + " Taka.");
            }else {
                System.out.println("");
            }

            //Rupee to bdt
        if(choice == 1){
            bdt = amount * 1.192;
            System.out.println("Your " +amount + " Rupee is: "+ bdt + " Taka.");
        }else if(choice == 2) {
            bdt = amount * 1.577;
            System.out.println("Your "+amount + " Ruble is: "+ bdt + " Taka.");
        }else if(choice == 3) {
            bdt = amount * 109.4;
            System.out.println("Your "+amount + " Pound is: "+ bdt + " Taka.");
        }else if(choice == 4) {
            bdt = amount * 95.03;
            System.out.println("Your "+amount + " Doller is: "+ bdt + " Taka.");
        }else {
            System.out.println("");
        }
            //Ruble to bdt

            //Pound to bdt

            //Dollar to bdt
    }
}
