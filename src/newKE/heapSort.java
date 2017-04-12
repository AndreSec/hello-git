package newKE;

public class heapSort {
	public static void main(String[] args){
		int[] a ={5,6,8,4,1,7};
		createHeap(a,6);
		for(int i=0;i<6;i++){
			System.out.println(a[i]);
		}
		//sort(a,6);
		delete(a,6);
		for(int i=0;i<6;i++){
			System.out.println(a[i]);
		}
		
	}
	
	public static void fixheapdown(int[] a,int s,int n){
		int temp=a[s];
		int j= s*2+1;
		
		while(j<n){//这里j<n就限制了最后一个数取不到。
			if(j+1<n&&a[j+1]>a[j])
				j++;
			
			if(a[j]<=temp)
				break;
			a[s]=a[j];
			s=j;
			j=s*2+1;
		}
		a[s]=temp;
	}
	
	public static void fixheapup(int[] a,int i){
		int temp= a[i];
		
		int j=(i-1)/2;
		while(j>=0&&i!=0){
			if(a[j]>=temp)
				break;
			
			a[i]=a[j];
			i=j;
			j=(i-1)/2;
		}
		a[i]=temp;
	}
	
	public static void insertheap(int[] a,int i,int num){
		a[i]=num;
		fixheapup(a,i);
	}
	
	public static int delete(int[] a,int n){//删除只能从堆顶
		int temp=a[n-1];
		a[n-1]=a[0];
		a[0]=temp;
		fixheapdown(a,0,n-1);
		return a[n-1];
	}
	
	public static void createHeap(int[] a,int n){
		for(int i=n/2-1;i>=0;i--)//d完全二叉树中最下非叶子结点在数组中的下标n/2-1
			fixheapdown(a,i,n);
	}
	
	public static void sort(int[] a,int n){
		for(int i=n-1;i>=1;i--){
			int temp = a[0];
			a[0]=a[i];
			a[i]=temp;
			fixheapdown(a,0,i);
		}
	}
	
}
