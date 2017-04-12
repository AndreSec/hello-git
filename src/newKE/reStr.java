package newKE;

import java.util.*;

public class reStr {
    /*public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            String ss= sc.nextLine();
            int n =ss.length();
            int[][] p = new int[n][n];
            char[] ch = ss.toCharArray();
            int maxlen=0;
            for(int i=0;i<n;i++){
            	for(int j=n-1;j>=i;j--){
            		if(ch[i]==ch[j]&&i<j){
            			if(i==0||j==n-1)
            				p[i][j]=2;
            			else
            				p[i][j]=p[i-1][j+1]+2;
            		}else if(ch[i]==ch[j]&&i==j){
            			if(i==0||j==n-1)
            				p[i][j]=1;
            			else
            				p[i][j]=p[i-1][j+1]+1;
            		}else {
            			if(i==0||j==n-1)
            				p[i][j]=0;
            			else
            				p[i][j]=Math.max(p[i-1][j],p[i][j+1]);
            			
            		}
            		
            		if(p[i][j]>maxlen)
            			maxlen=p[i][j];
            	}
            }
        	System.out.println(n-maxlen);
            }
        }*/

}
