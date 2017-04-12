package newKE;

public class countSort {
	public static void main(String[] args){
		int[] array ={9,3,5,6,10,2};
		countS(array,10);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	
	public static void countS(int[] a,int range){
		int[] k=new int[range+1];
		for(int i=0;i<a.length;i++){
			k[a[i]]++;
		}
		
		for(int i=1;i<range+1;i++){
			k[i]+=k[i-1];
		}
		
		int[] b =new int[a.length];
		
		for(int i=a.length-1;i>=0;i--){
			int value=a[i];
			int position = k[value]-1;
			
			b[position]=a[i];
			k[value]--;
		}
		
		for(int i=0;i<a.length;i++){
			a[i]=b[i];
		}
	}
}
