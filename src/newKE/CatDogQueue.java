package newKE;

import java.util.*;

public class CatDogQueue {
	public static void main(String[] args){
		int[][] ope={{1,-5},{1,-1},{1,9},{1,9},{2,0},{2,1},{1,-8},{2,1},{1,-71},{1,-92},{1,18},{1,91},{1,61},{2,-1},{1,-35},{1,95},{1,-49},{1,9},{1,78},{2,0},{1,91}};
		ArrayList al=asylum(ope);
		for(int j=0;j<al.size();j++){
			System.out.println(al.get(j));
		}
	}
	
    public static ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        LinkedList<Integer> queueAll=new LinkedList<Integer>();
        LinkedList<Integer> queueCat=new LinkedList<Integer>();
        LinkedList<Integer> queueDog=new LinkedList<Integer>();
        ArrayList<Integer> array=new ArrayList<Integer>();
        int rows=ope.length;
        int columns=2;
        for(int i=0;i<rows;i++){
            if(ope[i][0]==1){
                queueAll.add(ope[i][1]);
                if(ope[i][1]>0)
                    queueDog.add(ope[i][1]);
                else if(ope[i][1]<0)
                    queueCat.add(ope[i][1]);
                
            }else if(ope[i][0]==2){
                if(ope[i][1]==0){
                    int k=queueAll.poll();
                    if(k<-1)
                        queueCat.poll();
                    else
                        queueDog.poll();
                    array.add(k);
                }else if(ope[i][1]<0){
                    if(queueCat.size()==0)
                        continue;
                    array.add(queueCat.poll());
                    for(int j=0;j<queueAll.size();j++){
                        if(queueAll.get(j)<0){
                            queueAll.remove(j);
                        	break;
                        }
                    }
                    
                }else if(ope[i][1]==1){
                    if(queueDog.size()==0)
                        continue;
                    array.add(queueDog.poll());
                    for(int j=0;j<queueAll.size();j++){
                        if(queueAll.get(j)>0){
                            queueAll.remove(j);
                        	break;
                        }
                    }
                }
                    
            }
        }
        return array;
    }
}
