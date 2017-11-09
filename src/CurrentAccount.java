public class CurrentAccount extends BankAccount{
    int tradeLicenseNumber;
    CurrentAccount(String _memberName,int _accountBalance,int _minimumbalance,int _tradelicenseNumber)
    {
        super(_memberName,_accountBalance,_minimumbalance);
        this.tradeLicenseNumber=_tradelicenseNumber;
    }
}
