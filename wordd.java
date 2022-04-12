import java.text.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.math.*;
import static java.lang.System.*;
import java.io.File;
import java.io.FileNotFoundException;

public class wordd
{
	private String[] arr;
	public wordd() throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("wordleWords.txt"));
		String s = "";
		while(file.hasNext()) {
			s+=file.next() + " ";
		}
		arr = s.split(" ");
		//System.out.println(Arrays.toString(arr));
		//System.out.println(arr.length);
	}
	
	public String[] array() {
		return arr;
	}	
}