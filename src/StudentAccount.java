public class StudentAccount extends SavingsAccount {
    String institutionName;
    StudentAccount(String _memberName,int _accountBalance,int _minimumbalance,String insname)
    {
        super(_memberName,_accountBalance,_minimumbalance);
        institutionName=insname;
    }

}
