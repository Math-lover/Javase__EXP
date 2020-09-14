package IF_question;


import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //请依次输入性别、身高、年龄
        Scanner sc = new Scanner(System.in);
        String sex = sc.next();
        double height = sc.nextDouble();
        int age = sc.nextInt();
        if((sex.equals("男")&&(height>=170)&&(age>=20&&age<=26))||(sex.equals("女")&&(height>=162)&&(age>=20&&age<=22))){
            System.out.println("the condition is qualified");
        }else{
            System.out.println("reject");
        }
    }
}
