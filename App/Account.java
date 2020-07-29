package App;

import java.util.Locale;
import java.util.Scanner;
import Model.Entities.Reservation;

public class Account {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            
            Reservation reservation = new Reservation(number, holder, balance, withdrawLimit);

            System.out.print("Enter the ammount for withdraw: ");
            reservation.withdraw(sc.nextDouble());

            System.out.print(reservation.getBalance());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch(IllegalAccessError e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}