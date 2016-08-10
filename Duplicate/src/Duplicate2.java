import java.util.Scanner;
public class Duplicate2 {
	//public static void main(String args[])
	//{   
		Scanner input=new Scanner(System.in);
		int []a=new int[5];
		static int m;
		public void checkNum(int num)
		{
		     if(num>100||num<10)
		     {
		    	 System.out.println("\nEnter the correct number");
		    	 return;
		     }
		     else if(m==0)
		     {
		    	 System.out.println(num);
		    	 a[m++]=num;
		    	 return;
		     }
		     else
		     {
		    	 for(int j=0;j<m;j++)
		    	 {
		    		 if(a[j]==num)
		    		 {
		    			 System.out.println("\nThe number is already read");
		    			 return;
		    		 }
		    	 }
		     System.out.println(num);
		     a[m++]=num;
		     }
		}
		public void insertElements()
		{
			int l;
			for(int i=0;i<5;i++)
			{
				System.out.printf("\nEnter element: ",i+1);
				l=input.nextInt();
				checkNum(l);
			}
		}
		public void displayArray()
		{
			System.out.println("\nThe Required Array\n");
			for(int k=0;k<m;k++)
				System.out.println(a[k]);
		}
	}
				
			
		
		