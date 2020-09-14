package IF_question;

import java.util.Scanner;

public class q_2 {
    public static void main(String[] args) {
        System.out.println("请输入哪天订票：");
        Scanner sc;
        sc = new Scanner(System.in);
        double day = sc.nextDouble();
        System.out.println("请输入票价:");
        double t_price = sc.nextDouble();
        if((day>=1.01&&day<=1.03)||(day>=5.01&&day<=5.03)||(day>=10.01&&day<=10.07)){
            System.out.println("you should pay:" + t_price);
        }else{
            System.out.println("you should pay:" + t_price*0.8);
        }
    }
}
