import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i=0;
   BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
   
   try{
		System.out.println("enter number of elements");
		int n= Integer.parseInt(read.readLine());
		
		int[] a=new int[n];
		
		System.out.println("enter anyway elements");
		for(i=0;i<n;i++)
		{
		     a[i]=Integer.parseInt(read.readLine());
		}
		System .out.println("array elements are:");
		for(i=0;i<n;i++)
		{
		    System.out.println(a[i]);
		}
		}
		catch(Exception e){
		}
		}
}

