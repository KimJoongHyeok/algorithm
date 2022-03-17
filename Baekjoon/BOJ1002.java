package com.Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int sqrt_d = (int) ((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
            int minus_r = r2 - r1;
            int plus_r = r2 + r1;

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                sb.append(-1).append("\n");
            } else if (sqrt_d > Math.pow(r1 + r2, 2)) {
                sb.append(0).append("\n");
            } else if (sqrt_d < Math.pow(r2 - r1, 2)) {
                sb.append(0).append("\n");
            } else if (sqrt_d == Math.pow(r2 - r1, 2)) {
                sb.append(1).append("\n");
            } else if (sqrt_d == Math.pow(r1 + r2, 2)) {
                sb.append(1).append("\n");
            } else {
                sb.append(2).append("\n");
            }

//            int d = (int) Math.sqrt(sqrt_d);
//
//            //System.out.println("d = " + d + " minus_r = " + minus_r + " plus_r = " + plus_r);
//
//            if (plus_r == d || minus_r == d) { //내접 또는 외접
//                sb.append(1).append("\n");
//            } else if (plus_r < d || d < minus_r) { //만나지 않음(외부에 있는경우, 내부에 있는 경우)
//                sb.append(0).append("\n");
//            } else if (x1 == x2 && y1 == y2 && r1 == r2) { //동심원
//                sb.append(-1).append("\n");
//            } else { //두점에서 만남
//                sb.append(2).append("\n");
//            }
        }
        System.out.println(sb);
    }
}
