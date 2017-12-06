package Moduletwo;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Helloworld {

	@Test
	public void testex() {

		//String s = "\"hello world\"";
		//System.out.println(s);
		
		/* int x;
	      System.out.println("Enter an integer to check if it is odd or even ");
	      Scanner in = new Scanner(System.in);
	      x = in.nextInt();
	 
	      if ( x % 2 == 0 )
	         System.out.println("You entered an even number.");
	      else
	         System.out.println("You entered an odd number.");
	   }

	}
*/
	
	
	/*
		 int[] arr = new int[] { 5,4,8,1,9,0,0,-5 };

		    for (int i = 0; i < arr.length; i++) {
		      
		    	for (int j = i ; j < arr.length; j++) {
		            int tmp = 0;
		            if (arr[i] > arr[j]) {
		                tmp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = tmp;
		            }
		            
		        }
		       // System.out.println(arr[j]);
	            System.out.println(arr[i]);
		    }
		    
		    
		    
		    */
		    
		    
		/*int[] myarray = { 1, 2, 4, 1, 2 };
		for (int i = 0; i < myarray.length; i++) {
			for (int j = i; j < myarray.length; j++) {
				if (myarray[i] == myarray[j] && i != j) {
					System.out.println(myarray[j]);
				}
			}
		}
		  */
		    
		    //reverse string 
		
		
		String s="infiniti Research";
		
		String rev = "";
		for(int i=s.length()-1;i>0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println("reverse string="+rev);
		
		
		
		    
		    
		    
		    
		    
		    
	
	}
	}
