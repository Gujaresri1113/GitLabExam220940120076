

import java.util.Scanner;

public class ProgramMax {
	
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the number of elements you want to store here =  ");
	        int n=sc.nextInt();
	        
	        int[] arr = new int[100];
	        System.out.print("Enter the elements of array: ");
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        int len = arr.length;
	       
	        System.out.println("Largest value present in the array is: "+ find_Max(arr, len));
	    }
	    
	    public static int find_Max(int arr[], int len)
	    {
	        
	        if(len == 1)
	            return arr[0];  
	 
	        return Math.max(arr[len-1], find_Max(arr, len-1));
	    }
	}

