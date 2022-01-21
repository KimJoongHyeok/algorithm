import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    String inputData = sc.nextLine();
    int sum = 0;
    ArrayList<Character>list = new ArrayList<Character>();
    for(int i = 0;i<inputData.length();i++){
      if(Character.isLetter(inputData.charAt(i))){
        list.add(inputData.charAt(i));
      }else{
        sum += inputData.charAt(i) - '0';
      }
    }

    StringBuilder result = new StringBuilder();
    Collections.sort(list);

    for(int i = 0;i<list.size();i++){
      result.append(list.get(i));
    }
    if(sum!=0){
      result.append(String.valueOf(sum));
    }
    System.out.print(result);

  }
}