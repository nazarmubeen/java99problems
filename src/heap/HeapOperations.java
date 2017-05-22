package heap;

public class HeapOperations {


	 
	 public static void main(String[] args)
	 {
	  int Elem[]={4,3,7,1,8,5,2,6};
	 HeapFunctions func=new HeapFunctions();
	 //max heapify
	 System.out.println("build max heap");
	 func.build_maxheap(Elem, Elem.length);
	 System.out.println("");
	 print(Elem);
	 System.out.println("");
	 //
	 
	/* //min heapify
	 System.out.println("min heap");
	 func.build_minheap(Elem, Elem.length);
	 System.out.println("");
	 print(Elem);
	 System.out.println("");
	 //
*/	 
	/* //heap sort
	 System.out.println("Heap Sort length"+ Elem.length);
	 int Elemm[]={4,3,7,1,8,5};
	 func.heap_sort(Elemm, Elemm.length);
	 System.out.println("");
	 System.out.println("sorted array");
	 print(Elem); 
	 //
*/	 }
	 
	 static void print(int[] Elem)
	 {
		 for(int i=0;i<Elem.length;i++)
		 {
		  System.out.print(Elem[i]+",");
		 }
	 }
	}
