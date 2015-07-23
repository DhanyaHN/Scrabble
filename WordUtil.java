import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;


public class WordUtil
{
	static int score[] = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
	
	static int calc_val(String word)
	{
		int value = 0;
		for (int i = 0; i < word.length(); i++ )
		{
			char c = word.charAt(i);
			value += score[c-'a'];
		}
		return value;
	}

	static void writeToFile(List<Word> l, String path)
	{
		try
<<<<<<< HEAD
		{ 
			File file = new File(path);
=======
		{
 
			File file = new File(path);
 
>>>>>>> 478201cbc2a8af28a1cf4b9d84fd3b262e9b2a6e
			if (!file.exists()) 
			{
				file.createNewFile();
			}
<<<<<<< HEAD
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for (Word word : l)
			{
				bw.write(word.key + " " + word.value+"\n");	
=======
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for(Word word:l)
			{
				bw.write(word.key+" "+word.value+"\n");	
>>>>>>> 478201cbc2a8af28a1cf4b9d84fd3b262e9b2a6e
			}
			bw.close(); 
			System.out.println("Done");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
<<<<<<< HEAD
=======
		
>>>>>>> 478201cbc2a8af28a1cf4b9d84fd3b262e9b2a6e
	}
	
	static List<Word> readFile(String path)
	{
<<<<<<< HEAD
		List<Word> l = new ArrayList<Word>();
		try
		{
			Scanner sc = new Scanner(new File(path));
			while(sc.hasNext())
			{
				String s = sc.next();
				Word w = new Word(s,calc_val(s));
=======
		List<Word> l=new ArrayList<Word>();
		try
		{
			Scanner sc= new Scanner(new File(path));
			while(sc.hasNext())
			{
				String s=sc.next();
				Word w=new Word(s,calc_val(s));
>>>>>>> 478201cbc2a8af28a1cf4b9d84fd3b262e9b2a6e
				l.add(w);
			}	
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		return l;
	}
	
	static List<Word> wordSort(List<Word> l)
	{
		Collections.sort(l);
		return l;
	}
	
<<<<<<< HEAD
	static boolean finder(String word, String input)
	{
		List<Character> list = new LinkedList<Character>();
		for (char c : word.toCharArray())
		{
			list.add(c);	
		}		
		int flag = 0;
		for (char c : input.toCharArray())
		{
			if (c == ' ') flag++;
			list.remove(new Character(c));
		}
		if (list.size() == flag)
		//if(list.isEmpty()||(list.size() == flag && flag > 0))
		{
			return true;
		}
		return false;
	}
	
	static String findMaxWord(List<Word> l, String input)
	{
		for (Word w : l)
		{
			if (finder(w.value, input))
			{
				return w.value;	
=======
	static String findMaxWord(List<Word> l, String input)
	{
		for (Word w: l)
		{
			char[] cArray = w.value.toCharArray();
			Arrays.sort(cArray);
			
			
			char[] cGivenArray = input.toCharArray();
			Arrays.sort(cGivenArray);
			input=new String(cGivenArray);
			if (input.contains(new String(cArray)))
			{
			return w.value;	
>>>>>>> 478201cbc2a8af28a1cf4b9d84fd3b262e9b2a6e
			}
		}
		return "";
	}
<<<<<<< HEAD
	
=======
>>>>>>> 478201cbc2a8af28a1cf4b9d84fd3b262e9b2a6e
	public static void main(String args[])
	{
		List<Word> list = readFile("C:\\Users\\test\\workspace\\Test\\src\\sowpods.txt");
		list = wordSort(list);
<<<<<<< HEAD
		String inp = "helloz";
		System.out.println(findMaxWord(list, inp));
	}
=======
		System.out.println(findMaxWord(list, "aeroaaa"));
	}

>>>>>>> 478201cbc2a8af28a1cf4b9d84fd3b262e9b2a6e
}

class Word implements Comparable<Word>
{
	String value;
	int key;
	int length;
	
	public Word(String value, int key)
	{
<<<<<<< HEAD
		this.value = value;
		this.key = key;
=======
		this.value=value;
		this.key=key;
>>>>>>> 478201cbc2a8af28a1cf4b9d84fd3b262e9b2a6e
		this.length = value.length();
	}
	@Override
	public int compareTo(Word o)
	{
		if(this.key == o.key)
		{
			return (this.value.compareTo(o.value));
		}
		return o.key-this.key;
	}
}