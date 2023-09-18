import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        Hello hello = new Hello();
        hello.askName();
        hello.show();
        WorkingTimeScale workingTimeScale = new WorkingTimeScale();
        var number = 10.1256789;
        workingTimeScale.add(BigDecimal.valueOf(number));
        workingTimeScale.currentWorkingTime(BigDecimal.valueOf(number));;
    }
}