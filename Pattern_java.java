import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

// For upper portion ........................................
	for(int i=1;i<=n;i++)
	{
	    for(int j=1;j<=i;j++)
	    {
	        System.out.print("* ");
	    }
	  
	    for(int k=n;k>=i+1;k--)
	    {
	        System.out.print("  ");
	    }
	    
	    for(int l=1;l<=n;l++){
	        if(i==n)
	            System.out.print("@ ");
	   
	        else
	            System.out.print("  ");
	    }
	    
	    for(int m=n;m>=i+1;m--)
	    {
	        System.out.print("  ");
	    }
	    for(int x=1;x<=i;x++)
	    {
	       System.out.print("* "); 
	    }
	  System.out.println();
	}
	
// Ending of Upper Portion................................

// For Second Portion

for(int i=1;i<n;i++)
{
    for(int j=1;j<=n;j++)
    {
        System.out.print("  ");
    }
    for(int j=1;j<=n;j++)
    {
        System.out.print("@ ");
    }
System.out.println();
}	
//end of Second Portion............................................

//For Third Portion.....
 int x=n;
for(int i=n;i>=1;i=i-2)

{
 
    for(int j=x;j>=1;j--)
 {
 System.out.print("  ");        
 }
  x=x+1;
 
  for(int k=1;k<=i;k++)
  
  {
        
 System.out.print("* "); 
  }
  
  
  System.out.println();  
     }
	
   }
}
