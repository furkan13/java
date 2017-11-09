public class SavingsAccount extends BankAccount{
    double interest;
    int maxWithdraw;
    SavingsAccount(String _memberName,double _accountBalance,int _minimumbalance)
    {
        super(_memberName,_accountBalance,_minimumbalance);
        interest=.5;
    }
    double getBalanceWithinterest()
    {
        double interest=accountBalance*this.interest+accountBalance;
        return interest;
    }

    public void setMaxWithdraw(int maxWithdraw) {
        this.maxWithdraw = maxWithdraw;
    }



    String withdraw(double withdraw) {
        if(maxWithdraw>=withdraw)
        {
            accountBalance=accountBalance-withdraw;
            return ("withdraw successful");
        }
        return ("exceed withdraw limit");
    }
}
