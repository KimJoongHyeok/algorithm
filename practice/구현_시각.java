import java.util.*;

class Main {
  public static void main(String[] args) {
    //03 : 35 : 25
    int cnt = 0;
    for(int h = 0;h<3;h++){
      for(int m = 0;m<60;m++){
        for(int s = 0;s<60;s++){
          if(h%10 == 3 || m / 10 == 3 || m%10==3 || s/10==3 || s%10==3){
            cnt++;
          }
        }
      }
    }
    System.out.print(cnt);
  }
}