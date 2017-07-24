/*package recursion;

public class TelephoneNumber {
	private static final int PHONE_NUMBER_LENGTH = 7;
	private final int [] phoneNum;
	private char[] result = new char[ PHONE_NUMBER_LENGTH ];
	public TelephoneNumber ( int[] n ) { phoneNum = n; }
	public void printWords(){ printWords( 0 ); }
	
	public static void main(String[] args)
	{
		int[] arr={7,8,9,1,8,9,7};
		TelephoneNumber t=new TelephoneNumber(arr);
		t.printWords();
	}
	private void printWords(int curDigit ) {
		if( curDigit == PHONE_NUMBER_LENGTH ) {
		System.out.println( new String( result ) );
		return;
		}
		for( int i = 1; i <= 3; ++i ) {
		result[ curDigit ] = getCharKey(phoneNum[curDigit], i );
		printWords( curDigit + 1 );
		if( phoneNum[curDigit] == 0 ||
		phoneNum[curDigit] == 1) return;
		}
		}
		}


}
*/