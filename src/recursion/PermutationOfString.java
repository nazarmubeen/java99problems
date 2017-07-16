package recursion;

public class PermutationOfString {

	private boolean[] used;
	private StringBuilder out=new StringBuilder();
	private final String word;
	public PermutationOfString()
	{
		word="abcd";
		used=new boolean[word.length()];
	}
	
	public static void main(String[] args)
	{
		
		PermutationOfString pst=new PermutationOfString();
		pst.permute();
	}
	
	public void permute()
	{
		if(out.length()==word.length())
		{
			System.out.println("length is equal returning back");
			System.out.println(out);
			return;
		}
		
		for(int i=0;i<word.length();++i)
		{
			System.out.println(" i = "+i);
			System.out.println("current character = "+word.charAt(i));
			if(used[i])
			{
				System.out.println("current character = "+word.charAt(i)+ " already in string ");
				continue;
			}
			
			out.append(word.charAt(i));
			used[i]=true;
			printArray(used);
			System.out.println("calling remaing word");
			permute();
			System.out.println("after printing string make  "+word.charAt(i)+ " false used");
			used[i]=false;
			printArray(used);
			out.setLength(out.length()-1);
		}
		
	}
	
	void printArray(boolean[] array)
	{
		System.out.println(" ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println(" ");
	}
}
