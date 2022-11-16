public class BankAcc {

    private String firstname;
    private String lastname;
    private String date;
    private int accountNumber;
    private int balance;

    // CONSTRUCTOR

    public BankAcc(String inputFirstName, String inputLastName, String inputDate, int inputAccountNumber) {
        this.firstname = inputFirstName;
        this.lastname = inputLastName;
        this.date = inputDate;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;
    }

    // GETTERS AND SETTERS

    //firstname getter and setter:

    public String getFirstname() {

        return this.firstname;
    }

    public void setFirstname( String newFirstName) {
        this.firstname = newFirstName;
    }

    //lastname getter and setter:

    public String getLastname() {

        return this.lastname;
    }

    public void setLastname(String newLastName) {

        this.lastname = newLastName;
    }

    // date getter and setter

    public String getDate() {

        return this.date;
    }

    public void setDate(String newDate) {

        this.date = newDate;
    }

    // account number getter and setter:

    public Integer getAccountnumber() {

        return this.accountNumber;
    }

    public void setAccountNumber(Integer newAccountNumber) {

        this.accountNumber = newAccountNumber;
    }

    // balance getter and setter:

    public Integer getBalanca() {

        return this.balance;
    }

    public void setBalance( Integer newBalance) {

        this.balance = newBalance;
    }

    // Methods:

    void deposit (int money) {
        System.out.println(balance += money);


    }

    void withdrawal (int money) {
        System.out.println(balance -= money);


    }

    //method for interest payments into bank account
    void interest(double intpay) {
        System.out.println(balance += (balance * intpay));

    }

}
