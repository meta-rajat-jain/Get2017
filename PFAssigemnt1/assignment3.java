

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class assignment3 {
	//method for finding longest increasing Sequence 
	  public int[] longestSequence(int a[]){       
          int maxNow=0,start1=0,end=0,maxPre=0,start2=0,i=0,k=0;
         
          for(i=0;i<a.length-1;i++){
        	  //check whether element is increasing or not
              if(a[i]<a[i+1]){
                 
                  maxNow++;//mainting the length
                 
              }
              else{
                  if(maxNow<maxPre){//check whether current length is maximum or not
                     
                      start2=i+1;
                  }
                  else{
                      start1=start2;
                      maxPre=maxNow;
                      end=i;
                      start2=i+1;
                  }
                 
             
              maxNow=0;   
              }
         
          }	
              if(maxNow<maxPre){
                     
                      start2=i+1;
                  }
                  else{
                      start1=start2;
                      maxPre=maxNow;
                      end=i;
                      start2=i+1;
                  }
          int b[]=new int[end-start1+1];
         //longest sequence
          for(int j=start1;j<=end;j++){
             
              b[k++]=a[j];
         
          }
  return b;
 
}
	
	
}
