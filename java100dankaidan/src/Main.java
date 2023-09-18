import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
//        Hello hello = new Hello();
//        hello.askName();
//        hello.show();
        WorkingTimeScale workingTimeScale = new WorkingTimeScale();
        var number = 10.1256789;
        LocalDateTime ldt1 = LocalDateTime.of(2023,9,1,0,0,0,0);
        LocalDateTime ldt2 = LocalDateTime.of(2023,9,1,1,0,0,0);
        workingTimeScale.add(BigDecimal.valueOf(number));
        workingTimeScale.add(BigDecimal.valueOf(number));
        workingTimeScale.add(BigDecimal.valueOf(number));
        System.out.println(workingTimeScale.currentWorkingTime());
        workingTimeScale.add(ldt1,ldt2);
    }
}