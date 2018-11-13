
class Customer {
    private String name="user";
    private int password;
    private IAccountSet accounts;

    // returns the name of this customer
    public String getName() {
        return this.name;
    }

    // check whether the given password matches the one for this user
// in a real system, this method would return some object with
// info about the customer
    public void tryLogin(int withPwd) throws LoginFailedException {
        if (this.password != withPwd)
            throw new LoginFailedException();
    }
}


