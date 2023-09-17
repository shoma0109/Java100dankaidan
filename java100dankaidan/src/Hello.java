import java.util.Scanner;

class Hello {
    public void show() {
        System.out.println("Hello world");
    }
    public void askName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("名前を入力してください");
    }
}