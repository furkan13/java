
import java.util.*;



public class BankAccount {
    String memberName;
    int accountNumber;
    double accountBalance;
    int minimumBalance;
    BankAccount(String _memberName,int _accountBalance,int _minimumbalance)
    {
        memberName=_memberName;
        accountBalance=_accountBalance;
        minimumBalance=_minimumbalance;
        Random r=new Random();
        accountNumber=r.nextInt(99999)+10000;


    }

    void deposite(double deposite)
    {
        accountBalance=accountBalance+deposite;
    }

    String withdraw(double withdraw)
    {
        if(accountBalance-withdraw>=minimumBalance)
        {
            accountBalance=accountBalance-withdraw;
            return("withdraw successful");
        }
        return ("withdraw unsuccessful");
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
