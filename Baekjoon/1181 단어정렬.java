import java.util.Scanner;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String[]arr = new String[a];
    sc.nextLine();
    for(int i = 0;i<a;i++){
      String s = sc.nextLine();
      arr[i] = s;
    }

    Arrays.sort(arr, new Comparator<String>(){
      @Override
      public int compare(String o1,String o2){
        //길이가 같다면 사전순서대로
        if(o1.length() == o2.length()){
          return o1.compareTo(o2);
        //길이가 다르면 짧은 순서대로
        }else{
          return o1.length() - o2.length();
        }
      }
    });
    System.out.println(arr[0]);
    for(int i = 1;i<arr.length;i++){
      if(!arr[i].equals(arr[i-1])){
        System.out.println(arr[i]);
      }
    }
	}
}