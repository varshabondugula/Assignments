
import java.io.*;
import java.util.*;

public class wordCount {
	public static void main(String s[]) throws FileNotFoundException
	{
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		Scanner fileName=new Scanner(new File("v:\\varsha.txt"));
		while(fileName.hasNext())
		{
			String word=fileName.next();
			if(map.containsKey(word))
			{
				int count=map.get(word)+1;
				map.put(word, count);
			}
			
			else 
			{
				map.put(word, 1);
			}	
		}
		fileName.close();
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			System.out.println(entry);
		}
			
	}
}
