import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    int num = 1;
    int bunsuSum = 0;
    int i = 1;
    while(true){
      if(x <= num){
        bunsuSum = i+1;
        break;
      }else{
        i++;
        num += i;
      }
    }
    int prevBunsuSum = 0;
    for(int j = 1;j<bunsuSum-1;j++){
      prevBunsuSum += j;
    }
    int loc = x - prevBunsuSum;

    if(bunsuSum % 2 == 0){ 
      System.out.println((bunsuSum-loc) +"/"+ loc);
    }else{
      System.out.println(loc + "/" + (bunsuSum-loc));
    }

    // System.out.println(loc);
    // System.out.println(prevBunsuSum);
    // System.out.print(bunsuSum);
	}
}