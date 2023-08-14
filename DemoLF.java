interface DemoInt
{
  void show();
}

public class DemoLF
{
		public static void main(String ar[])
		{
			DemoInt di=()->System.out.println("hi this is Dheeraj");
                    di.show();

		}
}