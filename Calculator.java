import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to calculator");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a= input.nextInt();
        System.out.println("Enter second number:");
        int b= input.nextInt();

        System.out.println("choose the action ");
        System.out.println("1-plus\n2-minus\n3-Multiply\n4-Divided by");
        int c= input.nextInt();

        switch (c){
            case 1:
                double total=a+b;
                System.out.println(a+"+"+b+":"+total);
                break;

            case 2:
                total=a-b;
                System.out.println(a+"+"+b+":"+total);
                break;

            case 3:
                total=a*b;
                System.out.println(a+"+"+b+":"+total);
                break;

            case 4:
                if(b != 0){
                total=a/b;
                System.out.println(a+"+"+b+":"+total);}
                else {
                    System.out.println("Second number can not zero");
                }
                break;
        }

    }
}
