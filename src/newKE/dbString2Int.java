package newKE;

import java.util.*;

public class dbString2Int {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		String sn = sc.nextLine();
		int n=Integer.parseInt(sn);
		for(int i=0;i<n;i++){
			String s= sc.nextLine();
			String[] ss=s.split(",");
			int[] nums = new int[ss.length];
			for(int j=0;j<ss.length;j++){
				nums[j]=Integer.parseInt(ss[j]);
			}
			for(int o=0;o<ss.length;o++){
				System.out.println(nums[o]);
			}
		}
	}
}
