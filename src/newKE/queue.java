package newKE;

import java.util.*;

public class queue {
	/*public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int[] array = new int[100000];
		while(n--!=0){
			int aryn=sc.nextInt();
			find(array,aryn);
			for(int i=0;i<aryn-1;i++){
				System.out.print(array[i]+" ");
			}
			System.out.println(array[aryn-1]);
		}
	}
	//25 1 48 2 26 3 38 4 27 5 44 6 28 7 39 8 29 9 47 10 30 11 40 12 31 13 45 14 32 15 41 16 33 17 49 18 34 19 42 20 35 21 46 22 36 23 43 24 37
	public static void find(int[] a,int aryn){
		int totle=1;
		int i=1;
		a[i]=1;
		boolean[] b=new boolean[aryn];
		for(int j=0;j<aryn;j++){
			b[j]=false;
		}
		b[1]=true;
		while(totle<aryn){
			int m=0;
			while(b[(i+m)%aryn])
				m++;
			m++;
			while(b[(i+m)%aryn])
				m++;
				
			a[(i+m)%aryn]=a[i]+1;
			i=(i+m)%aryn;
			b[i]=true;
			totle++;
		}
	}*/
}
