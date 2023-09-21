import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Hello hello = new Hello();
//        hello.askName();
//        hello.show();
        WorkingTimeScale workingTimeScale = new WorkingTimeScale();
//        var number = 10.1256789;
        LocalDateTime from = LocalDateTime.of(2023,9,1,0,0,0);
        LocalDateTime to = LocalDateTime.of(2023,9,1,0,30,59);
//        workingTimeScale.add(BigDecimal.valueOf(number));
//        workingTimeScale.add(BigDecimal.valueOf(number));
//        workingTimeScale.add(BigDecimal.valueOf(number));
//        System.out.println(workingTimeScale.currentWorkingTime());
        System.out.println(workingTimeScale.add(from, to));


        Scanner scanner = new Scanner(System.in);
        System.out.println("何か入力してください");
        scanner.next();
        }
    }
