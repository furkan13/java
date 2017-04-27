/**
 * Created by Furkan on 4/2/2017.
 */


import java.util.Scanner;
import java.util.Random;
public class arry {
    public static void main(String[] args)
    {
        ran();
        System.exit(0);
    }
    public static void ran()
    {
        int i, j, sum = 0;
        int arr[] = new int[20];
        int B[] = new int[5];
        for (j = 0; j < 5; j++)
        {

            sum = 0;
            for (i = 0; i < 20; i++)
            {

                Random r = new Random();
                int c = r.nextInt(100);
                arr[i] = c;
                if (arr[i] >= 0 && arr[i] <= 19)
                {
                    sum = sum + arr[i];
                }


            }
            B[j] = sum;
        }

            for (i = 0; i < 5; i++) {
                System.out.println(B[i]);
                System.out.println(i);
            }


    }

}
