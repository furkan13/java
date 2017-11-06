public class user {
    public String username;
    private int password;



    user()
    {
        password=1234;
    }
    void changePassword(int oldpass,int newpass)
    {
        if (oldpass==password)
        {
            password=newpass;
            System.out.println("password changed");
        }
        else{
            System.out.println("Wrong password");
        }
    }
    public static void main(String []args)
    {
        user u= new user();

        u.changePassword(1234,4321);
        u.changePassword(1234,4321);
        u.changePassword(4321,5432);


    }

}
