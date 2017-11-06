
import static java.lang.Math.*;

public class vector_2d {
    double x;
    double y;
    vector_2d(double _x,double _y)
    {
     x=_x;
     y=_y;
    }
   double dis()
    {

        return  sqrt(x*x+y*y) ;
    }


   public String toString()

    {
        return "vector is "+x+" "+y;
    }




}
