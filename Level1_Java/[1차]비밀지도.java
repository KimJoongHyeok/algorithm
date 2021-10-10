class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
		String[] answer = new String[n];
		String[] str_arr1 = new String[n];
		String[] str_arr2 = new String[n];

		String[] str_arr1_1 = new String[n];
		String[] str_arr2_1 = new String[n];

		for (int i = 0; i < arr1.length; i++) {
			str_arr1[i] = Integer.toBinaryString(arr1[i]);
			str_arr2[i] = Integer.toBinaryString(arr2[i]);
			str_arr1_1[i] = "";
			str_arr2_1[i] = "";
			if (str_arr1[i].length() < arr1.length) {
				for (int j = 0; j < arr1.length - str_arr1[i].length(); j++) {
					str_arr1_1[i] += "0";
				}
			}	
			if (str_arr2[i].length() < arr1.length) {
				for (int j = 0; j < arr2.length - str_arr2[i].length(); j++) {
					str_arr2_1[i] += "0";
				}
			}	
			str_arr1_1[i] += str_arr1[i];
			str_arr2_1[i] += str_arr2[i];
			answer[i] = "";
			for(int t = 0;t<n;t++) {
				if(str_arr1_1[i].charAt(t) == '1' || str_arr2_1[i].charAt(t) == '1') {
					answer[i] += "#";
				}else {
					answer[i] += " ";
				}
			}
		}
        return answer;
    }
}