import java.io.InputStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    static String output;
    public static void main(String[] args){
//        Hello hello = new Hello();
//        hello.askName();
//        hello.show();
//        WorkingTimeScale workingTimeScale = new WorkingTimeScale();
//        var number = 10.1256789;
//        LocalDateTime from = LocalDateTime.of(2023,9,1,0,0,0);
//        LocalDateTime to = LocalDateTime.of(2023,9,1,0,30,59);
//        workingTimeScale.add(BigDecimal.valueOf(number));
//        workingTimeScale.add(BigDecimal.valueOf(number));
//        workingTimeScale.add(BigDecimal.valueOf(number));
//        System.out.println(workingTimeScale.currentWorkingTime());
//        System.out.println(workingTimeScale.add(from, to));

        Scanner scanner = new Scanner(System.in);
        System.out.println("一回目、何か入力してください");
        output = scanner.next();
        user_input();
        System.out.println("二回目、何か入力してください");
        output = scanner.next();
        user_input();
        System.out.println("三回目、何か入力してください");
        output = scanner.next();
        user_input();
    }

    public static void user_input(){
        System.out.println(output);
    }
}
