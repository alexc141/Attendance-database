package fibonacci;
import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<String>> array = new ArrayList<ArrayList<String>>(2);
		array.add(new ArrayList<String>());//Names, array.get(0)
		array.add(new ArrayList<String>());//ID numbers, array.get(1)
		
		//read from file, add to array
		
		System.out.println("Enter an ID Number");
		String input = scan.nextLine();
		int i = 0;
		while(!array.get(1).get(i).equals(input)){
			i++;
		}
		System.out.println(array.get(0).get(i));
		
		//method to write names to file
		//method to delete names from file
		
	}

	
}