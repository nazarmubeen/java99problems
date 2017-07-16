package recursion;

public class CombinationOfString {
	private StringBuilder out=new StringBuilder();
	private final String word;
	
	public CombinationOfString()
	{
		word="wxyz";
		
	}
	
	public static void main(String[] args)
	{
		CombinationOfString cb=new CombinationOfString();
		cb.Combine(0);
		
	}
	
	void Combine(int next)
	{
		
		for(int i=next;i<word.length();++i)
		{
			//System.out.println("i = "+i);
			out.append(word.charAt(i));
			System.out.println(out);
			if(i<word.length())
			Combine(i+1);
			out.setLength(out.length()-1);
			//System.out.println("out now "+out+" i is = "+i);
		}
	}
	
}
