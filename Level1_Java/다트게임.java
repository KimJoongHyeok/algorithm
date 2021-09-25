class Solution {
	public int solution(String dartResult) {
		int answer = 0;
		int[] num = new int[3];
		int cnt = 0;
		String x = "";
		int a = 0;
		char[] arr = dartResult.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if ('0' <= arr[i] && arr[i] <= '9') {
				x += String.valueOf(arr[i]);
				a = Integer.parseInt(x);
			} else if (arr[i] == 'S' || arr[i] == 'D' || arr[i] == 'T') {
				if (arr[i] == 'S') {
					num[cnt] = a;
				} else if (arr[i] == 'D') {
					num[cnt] = a * a;
				} else if (arr[i] == 'T') {
					num[cnt] = a * a * a;
				}
				cnt++;
				x = "";
			} else if (arr[i] == '#') {
				num[cnt-1] *= -1;
			} else if (arr[i] == '*'){
				num[cnt-1] *= 2;
				if (cnt - 2 >= 0) {
					num[cnt - 2] *= 2;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			answer += num[i];
		}

		return answer;
	}
}