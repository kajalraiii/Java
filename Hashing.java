import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashing {

	 static HashMap<Character, Integer> countVariable(String s1){
				HashMap<Character,Integer> map=new HashMap<Character,Integer>();
				char[] arr=s1.toCharArray();
				for(int i=0;i<arr.length;i++){
				    if(map.containsKey(arr[i])){
				        map.put(arr[i],map.get(arr[i])+1);
				    }
				    else{
				        map.put(arr[i],1);
				    }
				}
				/*for (Map.Entry entry : map.entrySet()) {
		            System.out.println(entry.getKey() + " " + entry.getValue());
		        }*/
				return map;
			}
        public static void main(String[] args) {
	             Scanner sc=new Scanner(System.in);
	             String s1=sc.nextLine();
                 countVariable(s1);
                
	}
}


