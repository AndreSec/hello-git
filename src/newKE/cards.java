package newKE;

import java.util.*;

public class cards{
   /* public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        int[] cards = new int[200];
        
        while(--t>=0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            //int nt=n;
            //if(n>100){}
            for(int i=0;i<2*n;i++){
                cards[i]=sc.nextInt();
            }
            while(--k>=0){
                refresh(cards,n);
            }
            
            for(int y=0;y<2*n-1;y++){
                System.out.print(cards[y]+" ");
            }
            System.out.println(cards[2*n-1]);
        }
    }
    
    public static void refresh(int[] cards,int n){
        //cards[0]=1;
        int[] cards2= new int[200];
        for(int i=0;i<n;i++){
            cards2[i]=cards[n+i];
        }
        
        for(int j=n-1;j>0;j--){
            cards[2*j]=cards[j];
        }
        for(int l=1;l<=n;l++){
            cards[2*l-1]=cards2[l-1];
        }
    }*/
    
}