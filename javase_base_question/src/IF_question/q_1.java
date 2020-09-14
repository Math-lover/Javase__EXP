package IF_question;


import java.util.Scanner;

public class q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int b = sc.nextInt();
        System.out.println("请输入一个运算符号:");
        String c = sc.next();
        int temp=0;
        if(c.equals("+")){
            temp = a + b;
        }else if(c.equals("-")){
            temp = a - b;
        }else if(c.equals("/")){
            temp = a / b;
        }else if(c.equals("*")){
            temp = a * b;
        }else{
            System.out.println("输入有误！！");
            System.exit(0);
        }
        System.out.println("result:"+temp);
    }
}
