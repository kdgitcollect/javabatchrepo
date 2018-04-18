package main.java.exceptionhandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FamilySeat {
	
 static int sol(int N,String S)
 {
	 // abc defg hjk
	 int c=N*3;
	 String a []=S.split(" ");
	// a.length
	 List<String> list1 = Arrays.asList(a);
	 for(int i=1;i<N+1;i++)
	 {

		 List<String> list2 = new ArrayList<String>();
		 list2.add(i+"B");
		 list2.add(i+"A");
		 list2.add(i+"C");
		 list2.add(i+"E");
		 list2.add(i+"F");
		 list2.add(i+"H");
		 list2.add(i+"J");
		 list2.add(i+"K");
		 
//		 for (String strelem : list2) {
			 if (list1.contains(i+"A") || list1.contains(i+"B") || list1.contains(i+"C"))
				 c--;
			 if (list1.contains(i+"E") || list1.contains(i+"F") || (list1.contains(i+"G") && list1.contains(i+"D"))  )
				 c--;
			 if (list1.contains(i+"H") || list1.contains(i+"J") || list1.contains(i+"K"))
				 c--;
			 
			 

//			 	System.out.println(c);
//		 }
	
	 }	 
	 return c;
	 

 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(sol(3,"1A 2F 1C"));//
System.out.println(sol(6,"1A 2B 2G 3A 3D 3J 1F 4A 5B 5G 6A 6D 6J 4F"));//
//		System.out.println(sol(6,""));
//System.out.println(sol(1,"1A 1F 1H"));
//System.out.println(sol(3,"1A 2B 2G 3A 3D 3J"));
	}

}
