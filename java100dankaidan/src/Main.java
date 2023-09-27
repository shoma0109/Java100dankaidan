import java.io.InputStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    static String output;
    public static void main(String[] args) {
//        Hello hello = new Hello();
//        hello.askName();
//        hello.show();
//        WorkingTimeScale workingTimeScale = new WorkingTimeScale();
//        var number = 10.1256789;
//        LocalDateTime from = LocalDateTime.of(2023,9,1,0,30,0);
//        LocalDateTime to = LocalDateTime.of(2023,9,1,0,0,0);
//        workingTimeScale.add(BigDecimal.valueOf(number));
//        workingTimeScale.add(BigDecimal.valueOf(number));
//        workingTimeScale.add(BigDecimal.valueOf(number));
//        System.out.println(workingTimeScale.currentWorkingTime());
//        System.out.println(workingTimeScale.add(from, to));


        System.out.println("何か入力してください");
        Scanner scanner = new Scanner(System.in);
        output = scanner.next();
            while (output.length() >= 20) {
                System.out.println("文字入力は20文字未満で入力してください");
                Scanner scan = new Scanner(System.in);
                output = scan.next();
            }
            System.out.println(output);
        }


//        for (int i = 0; i <= 2; i++){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println(i + 1 + "回目、何か入力してください");
//            output = scanner.next();
//            user_input();
//        }
//    }
}