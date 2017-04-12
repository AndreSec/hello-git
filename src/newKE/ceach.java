package newKE;

import java.util.*;

public class ceach{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        while(sc.hasNextInt()){
            int n =sc.nextInt();
            int m = sc.nextInt();
            ArrayList cah= new ArrayList();
            int[] nm=new int[m];
            int count =0;
            for(int i=0;i<m;i++){
                int sn=sc.nextInt();
                count+=find(cah,sn,n);
            }
            System.out.println(count);
        }
    }
    public static int find(ArrayList cah,int sn,int n){
		int na= cah.size();
        for(int i=0;i<na;i++){
            if((int)cah.get(i)==sn)
                return 0;
        }
        
        if(na==n)
            cah.remove(0);
        cah.add(sn);
        return 1;
    }
}
