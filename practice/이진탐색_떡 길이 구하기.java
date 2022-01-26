import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); //떡의 개수
    int m = sc.nextInt(); // 손님이 가져가야하는 떡의 길이
    int[]arr = new int[n];

    //각각 떡의 길이 입력받기
    for(int i = 0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);

    //int h = binarySearch(arr,0,arr[n-1],n,m);

    // 이진 탐색을 위한 시작점과 끝점 설정
    int start = 0;
    int end = (int) 1e9;
    // 이진 탐색 수행 (반복적)
    int result = 0; 
    while (start <= end) {
        long total = 0;
        int mid = (start + end) / 2;
        for (int i = 0; i < n; i++) {
            // 잘랐을 때의 떡의 양 계산
            if (arr[i] > mid) total += arr[i] - mid; 
        }
        if (total < m) { // 떡의 양이 부족한 경우 더 많이 자르기(왼쪽 부분 탐색)
            end = mid - 1;
        }
        else { // 떡의 양이 충분한 경우 덜 자르기(오른쪽 부분 탐색)
            result = mid; // 최대한 덜 잘랐을 때가 정답이므로, 여기에서 result에 기록 
            start = mid + 1;
        }
    }

    System.out.println(result);

    System.out.println(h);
    
  }

  public static int binarySearch(int []arr,int start,int end,int n,int m){
    int mid = (start + end) / 2;
    if(mid == start) return mid;
    int sum = 0;
    for(int i = 0;i<n;i++){
      if(arr[i] > mid){
        sum += arr[i] - mid;
      }
    }
    if(sum >= m){
      return binarySearch(arr, mid+1, end, n, m);
    }else{
      return binarySearch(arr, start, mid, n, m);
    }
  }
}
