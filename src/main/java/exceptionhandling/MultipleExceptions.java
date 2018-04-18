package main.java.exceptionhandling;

public class MultipleExceptions {

//	Throw vs Throws
	
	
	
//	   void checkAge(int age){  
//			if(age<18)  
//			   throw new ArithmeticException("Not Eligible for voting");  
//			else  
//			   System.out.println("Eligible for voting");  
//		   }  
//		
//
//		int division(int a, int b) throws ArithmeticException{  
//			int t = a/b;
//			return t;
//		}  
	

		
	
	
	
	public static void main(String args[]){  
//		MultipleExceptions m = new MultipleExceptions();
//		m.checkAge(10);
//		
//		
//		try{
//			   System.out.println(m.division(15,0));  
//			}
//			catch(ArithmeticException e){
//			   System.out.println("Division by Zero");
//			}
//		
		
		
		
		try{  
			int a[]=new int[5];  
			a[5]=30/0;  
		}  
		catch(ArithmeticException e){System.out.println("task1 is completed");}  
		catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
		catch(Exception e){System.out.println("common task completed");}  

		System.out.println("rest of the code...");  
	  
	
	
	//Compile time error
//	   try{  
//		    int a[]=new int[5];  
//		    a[5]=30/0;  
//		   }  
//		   catch(Exception e){System.out.println("common task completed");}  
//		   catch(ArithmeticException e){System.out.println("task1 is completed");}  
//		   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
//		   System.out.println("rest of the code...");  
//		 }  
	}
}
