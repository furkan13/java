
import java.util.*;

public class Bank {







 public static void display(String name,int accountnumber,double balance)
 {
     System.out.println("account opened successfully\t\t\nAccount holder name\t"+name+"\nAccount number:\t"+accountnumber+"\ninitial balance:\t"+balance);
 }

 public static int display()
 {
     System.out.println("*****options menu*****");
     System.out.println("1.deposit\n2.withdraw\n3.balance\n0.Exit");
     Scanner sc=new Scanner(System.in);
     int ans=sc.nextInt();
     return ans;
 }


public static void main(String args[])
{
    System.out.println("welcome to our bank");
    System.out.println("Please choose your account type \n 1.Saving Account \n 2.Current account \n 3.Student account");

    Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt();
    if(choice==1)
    {
        String nm=sc.nextLine();
        System.out.println("Enter your name");

        String name=sc.nextLine();
        System.out.println("Enter Initial deposit");
        double initial=sc.nextDouble();
        if(initial<2000)
        {
            System.out.println("Cant open account due to low initial deposit");
            System.exit(0);
        }

        System.out.println("enter Maximum withdraw limit");
        int max=sc.nextInt();

        SavingsAccount sv=new SavingsAccount(name,initial,2000);

        sv.setMaxWithdraw(max);


        //Account creation done


        display(sv.memberName,sv.accountNumber,sv.accountBalance);
        int ans=display();
        if(ans==1)
        {
            System.out.println("Enter amount");
            int ammount=sc.nextInt();
            sv.deposite(ammount);
            display();
        }
        else if(ans==2)
        {
            System.out.println("Enter amount");
            int ammount=sc.nextInt();
            String report=sv.withdraw(ammount);
            System.out.println(report);
            display();
        }
        else if(ans==3)
        {
            double amount=sv.accountBalance;
            System.out.println("balance is\t"+amount);
            display();
        }
        else if(ans==0)
        {
            System.exit(0);
        }
        else
        {
            display();
        }






    }
    else if(choice==2)
    {
        String nm=sc.nextLine();
        System.out.println("Enter your name");


        String name=sc.nextLine();
        System.out.println("Enter Initial deposit");
        double initial=sc.nextDouble();
        System.out.println("Enter your Trade license number");
        int license=sc.nextInt();


        CurrentAccount ca=new CurrentAccount(name,initial,5000,license);



        display(ca.memberName,ca.accountNumber,ca.accountBalance);
        int ans=display();
        if(ans==1)
        {
            System.out.println("Enter amount");
            int ammount=sc.nextInt();
            ca.deposite(ammount);
            display();
        }
        else if(ans==2)
        {
            System.out.println("Enter amount");
            int ammount=sc.nextInt();
            String report=ca.withdraw(ammount);
            System.out.println(report);
            display();
        }
        else if(ans==3)
        {
            double amount=ca.accountBalance;
            System.out.println("balance is\t"+amount);
            display();
        }
        else
        {
            System.exit(0);
        }

    }

    else if(choice==3)
    {

        String nm=sc.nextLine();
        System.out.println("Enter your name");

        String name=sc.nextLine();
        System.out.println("Enter Initial deposit");
        double initial=sc.nextDouble();
        System.out.println("enter Institution name");
        String ln=sc.nextLine();


        StudentAccount sa =new StudentAccount(name,initial,0,ln);


        display(sa.memberName,sa.accountNumber,sa.accountBalance);
        int ans=display();
        if(ans==1)
        {
            System.out.println("Enter amount");
            int ammount=sc.nextInt();
            sa.deposite(ammount);
            display();
        }
        else if(ans==2)
        {
            System.out.println("Enter amount");
            int ammount=sc.nextInt();
            String report=sa.withdraw(ammount);
            System.out.println(report);
            display();
        }
        else if(ans==3)
        {
            double amount=sa.accountBalance;
            System.out.println("balance is\t"+amount);
            display();
        }
        else
        {
            System.exit(0);
        }







    }




}
}
