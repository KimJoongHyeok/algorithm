import java.util.*;

class Main {
  public static void main(String[] args) {
  
  ArrayList<Integer> list = new ArrayList<Integer>();
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  for(int i=0;i<n;i++){
    list.add(sc.nextInt());
  }

  Collections.sort(list);

  int cnt = 0;
  int result = 0;

  for(int i = 0;i<n;i++){
    cnt++;
    if(list.get(i) <= cnt){
      result++;
      cnt=0;
    }
  }
  System.out.println(result);
  }
}