
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int x=n/2+1;
 /* for Upper Portion*/
 
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+2;j++)
            System.out.print("  ");
            
        System.out.println("*");
        }
       
/* for middle  half portion*/   
        for(int i=1;i<x+1;i++)
        {
            
            for(int j=1;j<=n+2;j++)
            {
                if(i==n/2+1)
                System.out.print("$ ");
                else
                System.out.print("  ");
            } 
            
            for(int j=1;j<=i;j++)
            {
               System.out.print("@ ");
            }
            
        
             for(int j=1;j<=n+2;j++)
            {
                System.out.print("  ");
            }
            
               System.out.println();
        }
/* for middle second half*/       
           int h=x-1;
           for(int i=h;i>=1;i--)
           {
               for(int j=1;j<=n+2;j++)
               System.out.print("  ");
                
               for(int j=1;j<=i;j++)
               System.out.print("@ ");
               
               
               System.out.println();
           }

/* for lower portion*/
            
         for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+2;j++)
            System.out.print("  ");
            
        System.out.println("*");
        }
            
	}
}


