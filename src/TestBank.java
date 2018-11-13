public class TestBank {

        public static void main(String args[])
        {
            BankingService B;
            BankingConsole C;

// initialize and connect the service and console in the constructor

            B = new BankingService(new AcctSet(), new CustSet());
            C = new BankingConsole(B);
            C.loginScreen();
        }
    }

