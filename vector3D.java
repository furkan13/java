import org.jcp.xml.dsig.internal.dom.DOMUtils;

public class vector3D {
    double x;
    double y;
    double z;
    vector3D(double _x,double _y,double _z)
    {
        x=_x;
        y=_y;
        z=_z;
    }


    public String toString() {
        return (""+x+" "+y+" "+z+"");
    }

   vector3D multiply(double value)
   {


       vector3D v1=new vector3D(value,value,value);
       v1.x=v1.x*this.x;
       v1.y=v1.y*this.y;
       v1.z=v1.z*this.z;
       return (v1);


   }

    double  multiply(vector3D vec)
    {

        return (vec.x*x+vec.y*y+vec.z*z);
    }


}
