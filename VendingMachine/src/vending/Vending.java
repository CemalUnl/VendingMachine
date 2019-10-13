package vending;

import java.util.Scanner;

public class Vending {

    public static void main(String[] args) {

        final int quarter = 25;
        final int half = 50;
        final int full = 100;
        Scanner in = new Scanner(System.in);
        boolean control = false;

        while (!control) {
            System.out.println("Enter the price of the item in kuruş:");
            int cost = in.nextInt();
            System.out.println("Enter the number of 1 lira coins you have inserted into the machine:");
            int paid = in.nextInt();
            int change = full * paid - cost;

            if (cost < 50) {
                control = false;
                System.out.println("Error : Cost must be more than 50 kuruş");

            } else if (cost > 200) {
                control = false;
                System.out.println("Error : Cost must be less than 50 kuruş");

            } else if (cost % 25 != 0) {
                control = false;
                System.out.println("Error : Cost  must be a multiple of 25 kuruş");

            } else if (paid > 2) {
                control = false;
                System.out.println("Error : Paid more than 2 lira coins");

            } else if (paid < 1) {
                control = false;
                System.out.println("Error : Paid less than one 1 lira coin");

            } else if (change < 0) {
                control = false;
                System.out.println("Error : Paid cant be less than cost");

            } else {
                control = true;

                int lira = change / full;
                change = change % full;
                int yarımlık = change / half;
                change = change % half;
                int çeyreklik = change / quarter;
                change = change % quarter;

              
                System.out.printf("%d * 1 lira ", lira);
                System.out.println("");
                System.out.printf("%d * 50 kuruş ", yarımlık);
                System.out.println("");
                System.out.printf("%d * 25 kuruş ", çeyreklik);

            }

        }

    }

}
