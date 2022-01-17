class Solution {
    public String solution(String s) {
        int cnt = 0;
        String answer = "";
		char arr[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (cnt % 2 == 0) {
				answer += String.valueOf(s.charAt(i)).toUpperCase();
			} else {
				answer += String.valueOf(s.charAt(i)).toLowerCase();
			}
            cnt++;
			if(s.charAt(i)==' ') {
				cnt = 0;
			}
		}
       return answer;
    }
}