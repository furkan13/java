import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.Collection;

public class unique {



    int numb;
    int div;

    unique(int numb,int div)
    {
        this.numb=numb;
        this.div=div;
        //System.out.println(numb+" "+div);
    }

    public String toString(){
        return (""+numb);
    }


    static class Comparediv implements Comparator<unique>{

        @Override
        public int compare(unique o1, unique o2) {
            if(o1.div>o2.div)return 1;
            else if(o1.div<o2.div)return -1;
            else if(o1.div==o2.div)
            {
                if(o1.numb>o2.numb)
                {
                    return 1;
                }
                else return -1;
            }

            else return 0;

        }



    }













    static int unDiv(int numb)
    {
        ArrayList<Integer> uniqueDiv= new ArrayList <Integer>();
        uniqueDiv.add(0);

        int count=0;
        for(int i=1, x=0;i<=numb;i++,x++)
        {
           if(numb%i==0)
            {
                for (int j=0;j<uniqueDiv.size();j++)
                {
                    if(uniqueDiv.get(j)!=i)
                    {
                        //System.out.println(uniqueDiv.get(j));
                        uniqueDiv.set(0,i);
                        //System.out.println(uniqueDiv.get(j));
                        count++;
                    }
                }

            }



        }
        return count;
    }





    public static void main(String[] args) {
        ArrayList<unique> div=new ArrayList <unique>();
        Scanner sc = new Scanner(System.in);
        int numb;
        int divisor;
        for(int i=0;i<100;i++)
        {
            numb=sc.nextInt();
            if(numb!=0)
            {

                divisor=unDiv(numb);

                div.add(new unique(numb,divisor));


            }

            else
            {
                break;
            }



        }


       Collections.sort(div,new Comparediv());
        for(unique i: div){
            System.out.println(i);
        }

        //System.out.println(div.get(0));











































    }

}
