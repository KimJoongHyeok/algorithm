import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    String inputData = sc.nextLine();

    int row = inputData.charAt(1) - '0';
    int colm = inputData.charAt(0) - 'a' + 1;

    int [] dx = {-2,-1,1,2,2,1,-1,-2};
    int [] dy = {1,2,2,1,-1,-1,-2,-1};
    int result = 0;

    for(int i = 0;i<8;i++){
      int nextRow = row + dx[i];
      int nextColm = colm + dy[i];

      if(1 <= nextRow && nextRow <= 8 && 1 <= nextColm && nextColm <= 8){
        result++;
      }
    }
    System.out.print(result);
  }
}