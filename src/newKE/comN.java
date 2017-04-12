package newKE;

import java.util.*;
import java.lang.*;

public class comN {
	/*public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int res=find(sc.nextInt());
		System.out.println(res);
		sc.close();
	}
	
	public static int find(int n){
	    int sqrtn= (int)Math.sqrt(n);
	    int[] na=new int[sqrtn];
	    for(int j=0;j<sqrtn;j++){
	        na[j]=(j+1)*(j+1);
	    }
	   
	    int min = n;
	    
	    for(int l=sqrtn-1;l>=0;l--){
	        int cunIn=l;
	        int cum = 0;
	        int res = n;
	        while(res>0){
	            if(cunIn==0){
	               cum=cum+res;
	               break;
	            }
	            if(res>=na[cunIn]){
	                res=res-na[cunIn];
	                cum++;
	            }else{
	                cunIn--;
	            }
	        }
	        if(cum==1){
	            return 1;
	        }else if(cum<min){
	            min=cum;
	        }
	    }
	    return min;
	}*/
}
