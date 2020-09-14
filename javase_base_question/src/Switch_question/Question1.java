package Switch_question;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入学员的考试成绩:");
        double score = sc.nextDouble();
        int temp=(int)score/10;
        String degree = "0";
        if(temp<6){
            System.out.println("成绩不合格");
        }else if (temp==100){
            System.out.println("A级");
            System.exit(0);
        }
        switch(temp){
            case 6:
                degree = "D";
                break;
            case 7:
                degree = "C";
                break;
            case 8:
                degree = "B";
                break;
            case 9:
                degree = "A";
                break;
            default:
                System.out.println("输入错误");
                System.exit(0);
        }
        System.out.println(degree+"级");
        System.exit(0);
    }
}
