import java.util.Arrays;
 
public class Budget {
    public int solution(int[] d, int budget) {
        int sum = 0;
        int count =0 ;
        Arrays.sort(d);
        
        for(int i = 0; i  d.length; i++) {
            if(sum + d[i]  budget) {
                break;
            }
            
            sum += d[i];
            count++;
        }
        return count;
    }
