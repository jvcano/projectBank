// the banking example with exceptions


class CustNotFoundException extends Exception {
    String unfoundName;

    CustNotFoundException(String name) {
        this.unfoundName = name;
    }
}

class AcctNotFoundException extends Exception {
    int unfoundNum;

    AcctNotFoundException(int num) {
        this.unfoundNum = num;
    }
}

class LoginFailedException extends Exception {
    LoginFailedException(){}
}



