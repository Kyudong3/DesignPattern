package cor.Currency;

import java.util.Scanner;

public class ChainOfResponsibilityPattern {
    private DispenseChain c1;

    public ChainOfResponsibilityPattern() {
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ChainOfResponsibilityPattern atmDispenser = new ChainOfResponsibilityPattern();

        while (true) {
            System.out.println("금액 입력");
            int amount = new Scanner(System.in).nextInt();

            if (amount % 10 != 0) {
                break;
            }

            atmDispenser.c1.dispense(new Currency(amount));
        }
    }
}
