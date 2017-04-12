package newKE;

import java.util.Scanner; 
public class geleima {
	    public static void main(String[] args) {  
	        Scanner scanner=new Scanner(System.in);  
	        int n=scanner.nextInt();  
	        String []result=grayMard(n);  
	        for(int i=0;i<result.length;i++){  
	            System.out.println(result[i]);  
	        }  
	  
	    }  
	      
	    public static String[] grayMard(int n){  
	        String []strings=new String[(int)Math.pow(2,n)];//1,2,4,8,,16  
	        if(n==1){  
	            strings[0]="0";  
	            strings[1]="1";  
	            return strings;  
	        }  
	          
	        String []resulStrings=grayMard(n-1);  
	        for(int i=0;i<resulStrings.length;i++){  
	            strings[i]="0"+resulStrings[i];  
	            strings[strings.length-i-1]="1"+resulStrings[i];  //0->...<-n-1 ËùÎ½¶Ô³Æ
	        }  
	        return strings;  
	          
	      
	          
	    }  
}
