package newKE;

public class radixSort {
	public static void main(String[] args){
		int[] array={120,11,130,210,30,57};
		radixS(array,9,3);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	public static void radixS(int[] a,int range,int b){
		for(int i=1;i<=b;i++){
			countS(a,range,i);
		}
	}
	
	public static void countS(int[] a,int range,int bc){
		int[] array = new int[range+1];//加1 是要把0算上
		for(int i=0;i<a.length;i++){
			array[(a[i]/(int)(Math.pow(10,bc-1))%10)]++;
		}
		
		for(int i=1;i<range+1;i++){
			array[i]+=array[i-1];
		}
		int[] b =new int[a.length];
		for(int i=a.length-1;i>=0;i--){
			int value=(a[i]/(int)(Math.pow(10,bc-1)))%10;
			int position= array[value]-1;
			b[position]=a[i];
			array[value]--;
		}
		
		for(int i=0;i<a.length;i++){
			a[i]=b[i];
		}
	}
}
