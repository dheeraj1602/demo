import java.util.*;
import java.util.stream.Stream;
public class DemoStream
{
  public static void main(String arg[])
		{
		 	List<Integer> nums = Arrays.asList(2,4,9,7,3,1);
			nums.forEach(n ->System.out.println(n));	
			System.out.println("____________________________________");
			
			nums.stream().sorted().map(n ->n*4).filter(n-> n%2==0).forEach(n ->System.out.println(n));			
		} 
}