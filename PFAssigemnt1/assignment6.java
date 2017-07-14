/* Both inputs can be sorted in any manner 
 * and the result will be sorted in an ascending manner*/
public class assignment6 {
	//method for merging two sorted array into third array
	public static int[] join(int a[] , int n , int b[] , int m ){
		int i = 0, j = 0, k = 0;
		int c[] = new int[n+m];
		
		//Special case--when array is sorted in descending
	
		if(a[0]>a[1]){
		for(int q=0;q<a.length/2;q++){
            int temp=a[q];
            a[q]=a[a.length-q-1];
            a[a.length-q-1]=temp;
		}
		}
		//Special case--when array is sorted in descending
		
		if(b[0]>b[1]){
        for(int q=0;q<b.length/2;q++){
            int temp=b[q];
            b[q]=b[b.length-q-1];
            b[b.length-q-1]=temp;
        }
    }
		
		
	    while (i<n && j <m)
	    {
	        if (a[i] < b[j])
	            c[k++] = a[i++];
	        else
	            c[k++] = b[j++];
	    }
	    while (i < n){
	        c[k++] = a[i++];
	    }
	    while (j < m){
	        c[k++] = b[j++];
	    }
	    return c ; 
	}

	
}