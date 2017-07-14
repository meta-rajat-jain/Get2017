
public class assignment2
{		//method for removing duplicate values
	 int[] removeDuplicate(int input[]){
	       
	        int end=input.length;
	        for(int i=0;i<end;i++){
	            for(int j=i+1;j<end;j++){
	                if(input[i]==input[j]){       //if found an duplicate element ..shift array by one index
	                    int shl =j;
	                   
	                    for(int k=j+1;k<end;k++){
	                        input[shl++]=input[k];
	                    }
	                    end--;
	                    j--;
	                }
	               
	            }
	        }
	       
	        int result[]=new int[end];                               
	        for(int i = 0; i < end; i++){                    //storing it in reduced array
	            result[i] = input[i];
	        }
	        return result;
	   
	       
	    }
    }
