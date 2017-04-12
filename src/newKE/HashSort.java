package newKE;

public class HashSort {
	public static void main(String[] args){
		int[] array={4,3,6,2,8,1,9};
		shellS2(array);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	
	public static void shellS(int[] a){
		int len= a.length;
		for(int gap=len/2;gap>0;gap/=2){
			for(int i=gap;i<len;i++){
				for(int j=i-gap;j>=0&&a[j]>a[j+gap];j=j-gap){//�ӵ͵������ģ�����ѭ����ֹ����û����ײ���Ѿ�������Ҫ�ƶ��ˣ��ײ����Ǹ�ð�ݣ�
					int temp=a[j];
					a[j]=a[j+gap];
					a[j+gap]=temp;
				}
			}
		}
	}
	
	public static void shellS2(int[] a){
		int len =a.length;
		for(int gap=len/2;gap>0;gap/=2){
			for(int i=0;i<gap;i++){
				for(int j=i+gap;j<len;j=j+gap){//��׼�Ĳ�������
					if(a[j]<a[j-gap]){
						int temp=a[j];
						int k=j-gap;
						while(k>=0&&temp<a[k]){
							a[k+gap]=a[k];
							k-=gap;
						}
						a[k+gap]=temp;
					}
				}
			}
		}
	}
}
