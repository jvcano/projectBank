// ************** Encapsulated Account Sets **************
import java.util.LinkedList;
interface IAccountSet {
    Account findByNum(int number) throws AcctNotFoundException;
}

class AcctSet implements IAccountSet {
    LinkedList<Account> accounts = new LinkedList<Account>();

    public Account findByNum(int num) throws AcctNotFoundException {
        for (Account acct:accounts) {
            if (acct.getNumber() == num)
                return acct;
        }
        throw new AcctNotFoundException(num);
    }
}