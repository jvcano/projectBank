class BankingService {
    private IAccountSet accounts;
    private ICustSet customers;

    BankingService(IAccountSet accounts, ICustSet customers) {
        this.accounts = accounts;
        this.customers = customers;
    }

    // this method should be allowed to assume that the acct num is valid
// some other method has task of handling that problem
    public double getBalance(int forAcctNum) throws AcctNotFoundException {
        Account acct = accounts.findByNum(forAcctNum) ;
        return acct.getBalance();
    }

    public double withdraw(int forAcctNum, double amt)
            throws AcctNotFoundException {
        Account acct = accounts.findByNum(forAcctNum) ;
        return acct.withdraw(amt);
    }

    public Customer login(String custname, int withPwd)
            throws LoginFailedException {
        try {
            Customer cust = customers.findByName(custname);
            cust.tryLogin(withPwd);
            return cust;
        } catch (CustNotFoundException e) {
            throw new LoginFailedException();
        }
    }
}