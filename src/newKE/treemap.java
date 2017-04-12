package newKE;

import java.util.*;

public class treemap {
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        while(sc.hasNext()){
	        	int n= sc.nextInt();
	            ArrayList<ArrayList<Integer>> ar=new ArrayList<ArrayList<Integer>>();
	            for(int i=0;i<n;i++){
	            	ArrayList<Integer> temp=new ArrayList<Integer>();
	                temp.add(sc.nextInt());
	                temp.add(sc.nextInt());
	                temp.add(sc.nextInt());
	                ar.add(temp);
	            }
	            //Set<Map.Entry<Integer,Integer>> su = tm.entrySet();
	           /* Collections.sort(ar,new Comparator<ArrayList<Integer>>(){
	            	public int compare(ArrayList<Integer> a1,ArrayList<Integer> a2){
	            		if(a1.get(1)!=a2.get(1))
	            			return a1.get(1)-a2.get(1);
	            		else
	            			return a2.get(2)-a1.get(2);
	            	}
	            });*/
	            
	            
	            for(int p=0;p<n;p++){
	            	System.out.println(ar.get(p).get(1)+"+++"+ar.get(p).get(2));
	            }
	            
	            /*int[] is= new int[n];
	            for(int h=0;h<n;h++){
	            	is[h]= ar.get(h).get(2);
	            }
	            int[] incr=new int[n];
	            int max=1;
	            incr[0]=1;
	            for(int l=0;l<n;l++){
	             	incr[l]=1;
	                for(int j=0;j<l;j++){
	                    if(is[l]>=is[j]&&incr[j]>incr[l]-1)
	                        incr[l]=incr[j]+1;
	                }
                    if(incr[l]>max)
                    	max=incr[l];
	            }*/
	            
	            int[] incr=new int[n];
	            int[] pre = new int[n];
	            int max=1;
	            incr[0]=1;
	            int k=0;
	            for(int l=0;l<n;l++){
	             	incr[l]=1;
	                for(int j=0;j<l;j++){
	                    if(ar.get(l).get(2)>ar.get(j).get(2)&&incr[j]>incr[l]-1){
	                    	//if(ar.get(l).get(1)>ar.get(j).get(1)){
	                    		incr[l]=incr[j]+1;
	                        	pre[l]=j;
	                    	//}
	                    }/*else if(ar.get(l).get(2)==ar.get(j).get(2)&&incr[j]>incr[l]-1
	                    		&&ar.get(l).get(1)==ar.get(j).get(1)){
	                    	incr[l]=incr[j]+1;
	                    	pre[l]=j;
	                    }*/
	                }
                    if(incr[l]>max){
                    	max=incr[l];
                    	k=l;
                    }                
	            }
	            System.out.println(max);
	            for(int i=k;i!=1;i=pre[i]){//i截止条件不对
	            	System.out.println(ar.get(i).get(1)+"---"+ar.get(i).get(2));
	            	try{
	            		Thread.sleep(5);
	            	}catch(Exception e){
	            		
	            	}
	            }
	            System.out.println(max);
	        }
	    }
	    
	  /*  import java.util.Scanner;
	    
	    public class Main {
	        public static class Dis{
	            int Num;     //马戏团成员的编号
	            int high;    //身高
	            int weight;    //体重
	            int max_high;  //记录这个马戏团成员为最下面的一个人，最多可以叠多少层罗汉
	        }
	         
	        public static void main(String args[]){     
	             Scanner cin = new Scanner(System.in);             
	             while(cin.hasNext()){      
	                 int n = cin.nextInt();
	                 Dis map[] = new Dis[n];
	                 for(int i = 0;i < n;i++){
	                     map[i] = new Dis();   //每次进入的元素插入队尾
	                     map[i].Num = cin.nextInt();
	                     map[i].weight = cin.nextInt();
	                     map[i].high = cin.nextInt();
	                     for(int j = i;j > 0;j--){    //使用冒泡排序，对新插入的元素插入队列，按照体重从小到大的顺序排序  
	                         if(map[j].weight < map[j-1].weight){
	                             int Num = map[j].Num;
	                             int high = map[j].high;
	                             int weight = map[j].weight;
	                             map[j].Num = map[j-1].Num;
	                             map[j].high = map[j-1].high;
	                             map[j].weight = map[j-1].weight;
	                             map[j-1].Num = Num;
	                             map[j-1].high = high;
	                             map[j-1].weight = weight;
	                         }else if(map[j].weight == map[j-1].weight &&map[j].high > map[j-1].high){  //如果体重相同，身高矮的在后面
	                             int Num = map[j].Num;
	                             int high = map[j].high;
	                             int weight = map[j].weight;
	                             map[j].Num = map[j-1].Num;
	                             map[j].high = map[j-1].high;
	                             map[j].weight = map[j-1].weight;
	                             map[j-1].Num = Num;
	                             map[j-1].high = high;
	                             map[j-1].weight = weight;
	                         }else
	                             break;  //队列已经有序了，跳出循环
	                     }
	                 }          
	                 int max_high = getMaxHigh(map,n);
	                 System.out.println(max_high);
	             }                      
	        }
	     
	        private static int getMaxHigh(Dis[] map, int n) {
	            // TODO Auto-generated method stub
	            int max_high = 0;
	            for(int i = 0;i < n;i++){
	                map[i].max_high = 1;
	                for(int j = 0; j < i;j++){
	                    if(map[i].high >= map[j].high && map[i].max_high < map[j].max_high+1){
	                        map[i].max_high = map[j].max_high + 1;
	                    }              
	                }
	                max_high = Math.max(max_high, map[i].max_high);
	            }
	            return max_high;
	        }
	    }*/
}
