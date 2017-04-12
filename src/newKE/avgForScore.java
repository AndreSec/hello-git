package newKE;

import java.util.*;

public class avgForScore {
	    public static void main(String[] args){
	        Scanner sc =new Scanner(System.in);
	        while(sc.hasNext()){
	            int n=sc.nextInt();
	            int r=sc.nextInt();
	            int avg=sc.nextInt();
	            ArrayList<ArrayList<Integer>> array=new ArrayList<ArrayList<Integer>>();
	            int hadg=0;
	            for(int i=0;i<n;i++){
	                ArrayList<Integer> as= new ArrayList<Integer>();
	                int ai=sc.nextInt();
	                hadg+=ai;
	                as.add(ai);
	                as.add(sc.nextInt());
	                as.add(r-ai);
	                array.add(as);
	            }
	            int less=n*avg-hadg;
	            
	            Collections.sort(array,new Comparator<ArrayList<Integer>>(){
	                public int compare(ArrayList<Integer> a1,ArrayList<Integer> a2){
	                    if(a1.get(1)!=a2.get(1)){
	                        return a1.get(1)-a2.get(1);
	                    }else{
	                        return a1.get(2)-a2.get(2);
	                    }
	                }
	            });
	            int i=0;
	            int sum=0;
	            int totle=0;
	            int curc=0;
	            while(less!=0){
	            	curc=array.get(i).get(2);
	                totle=array.get(i).get(1)*curc;
	                if(less<curc){
	                    sum+=less*array.get(i).get(1);
	                    break;
	            	}
	                sum+=totle;
	                less=less-curc;
	                i++;
	            }
	            
	            System.out.println(sum);

	        }
	    }
}
