import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[]arr = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
    int sum = 0;
    for(int i = 0;i<s.length();i++){
      for(int j = 0;j<arr.length;j++){
        String cont = Character.toString(s.charAt(i));
        if(arr[j].contains(cont)){
          sum += (j+2);
        }
      }
    }
    System.out.print(sum+s.length());
    
	}
}