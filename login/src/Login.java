import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String rightUsername = "zhangsan";
        String rightpassword = "123456";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("id:");
            String username = sc.next();
            System.out.println("password:");
            String password = sc.next();

            if(username.equals(rightUsername) && password.equals(rightpassword)){
                System.out.println("success!");
                break;
            } else{
                if (i==2) {
                    System.out.println("id:"+username+"is clocked");
                } else {
                    System.out.printf("error!Remain %s chances",2-i);
                    System.out.println();
                }
            }
        }
    }
}
