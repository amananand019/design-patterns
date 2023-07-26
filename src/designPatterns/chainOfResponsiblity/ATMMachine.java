package designPatterns.chainOfResponsiblity;

import designPatterns.chainOfResponsiblity.dispenser.DispenseChain;
import designPatterns.chainOfResponsiblity.dispenser.Dollar10Dispenser;
import designPatterns.chainOfResponsiblity.dispenser.Dollar20Dispenser;
import designPatterns.chainOfResponsiblity.dispenser.Dollar50Dispenser;
import designPatterns.chainOfResponsiblity.model.Currency;

import java.util.Scanner;

public class ATMMachine {
    private DispenseChain c1;

    public ATMMachine() {
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ATMMachine machine = new ATMMachine();
        while (true) {
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            int amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            machine.c1.dispense(new Currency(amount));
        }
    }
}
