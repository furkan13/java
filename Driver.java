import java.util.Scanner;


public class Driver {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("Checking overloading offline");

        for(int k=1;k<=3;++k){

            System.out.println("Input vector parameters: ");

            int arr[] = new int[3];
            for(int i=0;i<3;++i)arr[i] = scn.nextInt();
            vector3D myvector = new vector3D(arr[0],arr[1],arr[2]);


            //For checking scalar multiplication
            System.out.println("Input value to multiply with");
            int val = scn.nextInt();
            System.out.println("Result is "+myvector.multiply(val));


            //For checking vector dot multiplication
            System.out.println("Input vector to multiply with");
            for(int i=0;i<3;++i)arr[i] = scn.nextInt();
            vector3D myvector2 = new vector3D(arr[0],arr[1],arr[2]);
            System.out.println("Result is "+myvector.multiply(myvector2));

        }

        System.out.println("-----------------------------");
        System.out.println("Checking inheritance offline");

       {

            BankVaultDoor bankdoor = new BankVaultDoor();
            HouseDoor housedoor = new HouseDoor();

            housedoor.lock();
            housedoor.lock();
            housedoor.unlock();
            housedoor.unlock();
            housedoor.lock();
            housedoor.lock();
            housedoor.unlock();

            while(true){

                System.out.println("What do you want to do with this bankdoor?\n1.Change Password\n2.Open Door\n3.Get Report");

                int command = scn.nextInt();

                if(command==1){
                    System.out.println("Enter old Password"); int oldp = scn.nextInt();
                    System.out.println("Enter new Password"); int newp = scn.nextInt();
                    bankdoor.changepassword(oldp, newp);
                }

                else if(command==2){
                    bankdoor.open();
                }
                else if(command==3){
                    System.out.println(bankdoor);
                }

            }

        }
    }

}