import static java.lang.Math.*;

public class vector_3d extends vector_2d {
    double z;
    vector_3d(double _x,double _y,double _z)
    {
        super(_x,_y);

        z=_z;

    }

    double dis()
    {


        double p= super.dis()*super.dis();
        return sqrt(p+z*z);

    }


    public String toString()

    {
        return "vector is "+ x +" "+y+" "+z;
    }


}

