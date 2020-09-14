package For_question;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //产生随机数
        int i = (int)(Math.random()*10+1);
        Scanner sc = new Scanner(System.in);
        int flag=7;
        System.out.println("Start guess number");
        while(flag>0){
            int temp = sc.nextInt();
            if(temp == i){
                System.out.println("恭喜你猜对了！");
            }else if(temp < i){
                System.out.println("太小了，再大一点！");
            }else if (temp > i){
                System.out.println("太大了，再小一点！");
            }
            flag--;
        }
        if(flag==0){
            System.out.println("你太笨了，下次再来吧");
        }
        //System.out.println("正确答案:"+i);
    }
}
