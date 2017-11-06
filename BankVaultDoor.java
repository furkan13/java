import java.util.Scanner;

public class BankVaultDoor extends Door{
    private int password;
    int count;
    BankVaultDoor()
    {
        super();
        password=1234;
    }
    void changepassword(int old,int n)
    {
        if(password==old)
        {
           password=n;
            System.out.println("password is changed");
        }
        else
        {
            System.out.println("password is not changed");
        }




    }



    void open() {

        System.out.println("enter a password");
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        if(p==password)
        {
            count++;
            super.open();
        }
    }


    public String toString() {
        return ("the bank door has been opened"+" "+count+" "+"times");
    }
}



