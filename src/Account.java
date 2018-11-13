// ************** Account Class *************

class Account {
    private int number;
    private Customer owner;
    private double balance ;

    // returns the identification number for this account
    public int getNumber() {
        return this.number;
    }

    // returns the balance in this account
    public double getBalance() {
        return this.balance;
    }

    // method to withdraw given amount
    public double withdraw(double amt) {
        this.balance = this.balance - amt;
        return amt;
    }
}