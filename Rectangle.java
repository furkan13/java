package day2;




	public class Rectangle {
		public int width;
		public int height;
		public   Rectangle(int _width,int _height)
		{
			width=_width;
			height=_height;
			
		}
		
		public  double area()
		{
			return width*height;
			
		}
		
		public static void main()
		{
			
			Rectangle r= new Rectangle(10,20);
			
			System.out.println(r.area());
			if (r.width==r.height)
			{
				System.out.println("square");
			}
			else {
				System.out.println("not square");
			}
			
			
		}

	}



