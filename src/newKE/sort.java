package newKE;

public class sort {
	public static void main(String[] args){
		int[] s={3,6,4,8,7,6,1,9};
		ss(s);
		ss2(s);
	}
	public static void ss(int[] a){
		int n=a.length;
		for(int i=n-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int y=0;y<n;y++){
			System.out.println(a[y]);
		}
	}
	
	public static  void ss2(int[] a){
		int n =a.length;
		for(int i=1;i<n;i++){
			for(int j=i;j>0;j--){
				if(a[j]<a[j-1]){
					int temp =a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}
