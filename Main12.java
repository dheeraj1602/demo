import java.util.Optional;
public class Main12
		{
			public static void main(String args[])
			{
				String str[]=new String[10];
				Optional<String> checkNull=Optional.ofNullable(str[5]);
   			
			if(checkNull.isPresent()){
 			String word= str[5].toLowerCase();
			System.out.print(word);
			}
			else
			System.out.println("string is null");
System.out.println("string is null");
			}
		}

		