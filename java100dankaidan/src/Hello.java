import java.util.Scanner;

class Hello {
    String lastName;
    String firstName;
    public void show() {
        System.out.println("Hello " + firstName + " " + lastName + " さん！");
    }
    public void askName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("名前を入力してください");
        lastName = scanner.next();
        System.out.println("苗字を入力してください");
        firstName = scanner.next();
    }
}