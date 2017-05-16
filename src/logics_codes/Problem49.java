package logics_codes;

import java.util.ArrayList;
import java.util.List;


/*P49 (**) Gray code.
An n-bit Gray code is a sequence of n-bit strings constructed according to certain rules. For example,
n = 1: C(1) = ("0", "1").
n = 2: C(2) = ("00", "01", "11", "10").
n = 3: C(3) = ("000", "001", "011", "010", "110", "111", "101", "100").
Find out the construction rules and write a function to generate Gray codes.

scala> gray(3)
res0 List[String] = List(000, 001, 011, 010, 110, 111, 101, 100)*/
public class Problem49 {
	
	
	 public static void main(String[] args) {
	        int n = 3;
	        System.out.println("method 1");
	        gray("", n);
	        System.out.println("method 2 to get numbers");
	        List<Integer> l=grayCode(n);
	        
	        System.out.println(l);
	    }



    // append order n gray code to end of prefix string, and print
    public static void gray(String prefix, int n) {
        if (n == 0) 
        	System.out.println(prefix);
        else {
            gray(prefix + "0", n - 1);
            yarg(prefix + "1", n - 1);
        }
    }  

	// append reverse of order n gray code to prefix string, and print
    public static void yarg(String prefix, int n) {
        if (n == 0) System.out.println(prefix);
        else {
            gray(prefix + "1", n - 1);
            yarg(prefix + "0", n - 1);
        }
    }  
    
    //method 2
    public static List<Integer> grayCode(int n) {
        if(n==0){
            List<Integer> result = new ArrayList<Integer>();
            result.add(0);
            return result;
        }
     
        List<Integer> result = grayCode(n-1);
        int numToAdd = 1<<(n-1);
     
        for(int i=result.size()-1; i>=0; i--){
            result.add(numToAdd+result.get(i));
        }
        
        
     
        return result;
    }
	
}
