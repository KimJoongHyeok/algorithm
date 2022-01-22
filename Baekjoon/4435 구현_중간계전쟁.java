import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int battleCnt = sc.nextInt();
    int [] gandalphScore = {1,2,3,3,4,10};
    int [] souronScore = {1,2,2,2,3,5,10}; 

    int [] gandalph = new int[6];
    int [] souron = new int[7];

    for(int i = 0;i<battleCnt;i++){
  
      int ganSum = 0;
      int sourSum = 0; 

      for(int g = 0;g<6;g++){
        gandalph[g] = sc.nextInt();
        ganSum += (gandalph[g] * gandalphScore[g]);
      }for(int s = 0;s<7;s++){
        souron[s] = sc.nextInt();
        sourSum += (souron[s] * souronScore[s]);
      }

      if(ganSum > sourSum){
        System.out.println("Battle " + (i+1) + ": Good triumphs over Evil");
      }else if(ganSum == sourSum){
        System.out.println("Battle " + (i+1) + ": No victor on this battle field");
      }else{
        System.out.println("Battle " + (i+1) +": Evil eradicates all trace of Good ");
      }
    }

  }
}