package cor.Currency;

interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);
}

class Currency {
    private int amount;

    Currency(int amt) {
        this.amount = amt;
    }

    int getAmount() {
        return this.amount;
    }

}
