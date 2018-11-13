
// ************** Encapsulated Customer Sets *************
import java.util.LinkedList;

interface ICustSet {
    Customer findByName(String name) throws CustNotFoundException;
}

class CustSet implements ICustSet {
    LinkedList<Customer> customers = new LinkedList<>();

    public Customer findByName(String name) throws CustNotFoundException {
        for (Customer cust:customers) {
            if (cust.getName() == name)
                return cust;
        }
        throw new CustNotFoundException(name);
    }
}