import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of d: ");
        int d = sc.nextInt();
        if(m==3 && d==20){
            System.out.println("True");
        }else if(m==4 && d==20){
            System.out.println("True");
        }else if(m==5 && d==20){
            System.out.println("True");
        }else if(m==6 && d==20){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
