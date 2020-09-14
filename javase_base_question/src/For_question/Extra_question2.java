package For_question;

public class Extra_question2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=0;j<i*2-1;j++){
                char temp =(char)(i+64);
                System.out.print(temp);
            }
            System.out.println("");
        }
    }
}
