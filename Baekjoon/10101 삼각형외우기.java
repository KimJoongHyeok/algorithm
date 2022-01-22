import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String result = search(a,b,c);
        System.out.println(result);
    }
    static String search(int a,int b,int c){
        if(a+b+c == 180){
            if(a != b && a != c && b != c){
                return "Scalene";
            }
            else if(a == 60 && b == 60 && c == 60){
                return "Equilateral";
            }
            return "Isosceles";
        }
        return "Error";
    }
}
