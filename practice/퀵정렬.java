import java.util.*;

class Main {
  public static void quick(int []arr,int start,int end){
    if(start >= end) return; // 원소가 0인 경우
    int pivot = start;
    int left = start +1;
    int right = end;

    while(left <= right){
      //pivot 보다 큰수를 찾기 전까지 left++
      while(left <= end && arr[pivot] >= arr[left]){
        left++;
      }
      //pivot 보다 작은수를 찾기 전까지 right--;
      while(right > start && arr[pivot] <= arr[right]){
        right--;
      }
      //엇갈렸을 경우
      if(left > right){
        int temp = arr[pivot];
        arr[pivot] = arr[right];
        arr[right] = temp;
      }
      else{
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
      }
    }
    quick(arr,start,right-1);
    quick(arr,right+1,end);
  }

  public static void main(String[] args) {
    int n = 10;
    int []arr = {7,5,9,0,3,1,6,2,4,8};

    quick(arr,0,n-1);

    for(int i = 0;i<n;i++){
      System.out.print(arr[i] + " ");
    }
    
  }
}
