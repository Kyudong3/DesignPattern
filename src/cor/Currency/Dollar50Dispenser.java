package cor.Currency;

class Dollar50Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 50) {
            int num = cur.getAmount() / 50;
            int remainder = cur.getAmount() % 50;

            System.out.println("50$ " + num + "장");

            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        } else this.chain.dispense(cur);
    }
}

class Dollar20Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 20) {
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;

            System.out.println("20$ " + num + "장");

            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        } else this.chain.dispense(cur);
    }
}

class Dollar10Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 10) {
            int num = cur.getAmount() / 10;
            int remainder = cur.getAmount() % 10;

            System.out.println("10$ " + num + "장");

            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        } else this.chain.dispense(cur);
    }
}

