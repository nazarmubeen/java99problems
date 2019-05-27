/*package com.java.concepts.eight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Comparision_Test {

	public class Golfer {
	    private String first;
	    private String last;
	    private int score;

	    public Golfer(String first, String last, int score)
	    {
	    	this.first=first;
	    	this.last=last;
	    	this.score=score;
	    }
	    
	    
	    List<Golfer> golfers= Arrays.asList(
			    new Golfer("Jack","Nicklaus", 68),
			    new Golfer("Tiger", "Woods", 70),
			    new Golfer("Tom", "Watson", 70),
			    new Golfer("Ty", "Webb", 68),
			    new Golfer("Bubba", "Watson", 70)
			);
		
		public List<Golfer> sortByScoreThenLastThenFirst() {
		    return golfers.stream()
		        .sorted(ComparingInt(Golfer::getScore)
		                    .thenComparing(Golfer::getLast)
		                    .thenComparing(Golfer::getFirst))
		        .collect(toList());
		}
	    
	    // ... other methods ...
	}
	
	public static void main(String[] args)
	{
		
	}
}
*/