
import java.util.*;
public class assignment5
{		/*method for determining whether array is sorted or not 
		and if sorted type of sort*/
			int arraySorting(int a[])
			{
				
				
				int flag=-1;
				
				for(int i=0;i<a.length-1;i++)
				{	//to check whether array is sorted in ascending manner
					if((a[i]<=a[i+1]) && flag!=2 )
					{
						flag=1;					
					}
						//to check whether array is sorted in descending manner
					else if((a[i]>=a[i+1]) && flag!=1 )
					{
						flag=2;					
					}
					else
					{		// array is not sorted 
						flag=3;
						break;
					}
				}
				
				if(flag == 3)
				{
					System.out.println("Not Sorted");
					return 0;
				}
				else if(flag==1)
				{
				System.out.println("Ascending");
				return 1;
				}
				else
				{
					System.out.println("Descending");
					return 2;
				}
			}

}
			