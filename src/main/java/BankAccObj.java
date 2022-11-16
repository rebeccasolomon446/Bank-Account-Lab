import org.w3c.dom.ls.LSOutput;

import java.time.Month;

public class BankAccObj {

    public static void main(String[] args) {
        //object instantiation:
        BankAcc human1 = new BankAcc("Jane", "Doe", "15/11/2022", 1234567);


        // new balance total : 1000
        human1.deposit(1000);

        //new balance total 1200
        human1.deposit(200);

        // new balance total: 1100
        human1.withdrawal(100);

        //interest paid when rate is 0.4 per cent :
        human1.interest(0.004);

















    }




}
