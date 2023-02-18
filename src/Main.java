import java.util.Scanner;

public class Main {
    public static class HCF{
        int temp;
        int highestCommonFactor(int a,int b){
            if(a!=b){
                if(a>b)
                    a-=b;
                else
                    b-=a;
                return highestCommonFactor(a,b);
            }
            return a;
        }

        public static void main(String[] arg) {
            HCF hcf = new HCF();
            int n1,n2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number:");
            n1 = sc.nextInt();
            System.out.println("Enter second number:");
            n2 = sc.nextInt();
            System.out.println("HCF of two numbers is: " + hcf.highestCommonFactor(n1,n2));
        }
    }
}
