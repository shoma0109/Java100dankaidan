package calculation;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class WorkingTimeScale {
    private final BigDecimal time1 = new BigDecimal("10");
    private final BigDecimal time2 = new BigDecimal("0.1256789");
    BigDecimal result = time1.add(time2);
    public void add(int x, int y){
        System.out.println(result);
    }
    public void currentWorkingTime(){
        result = result.setScale(2, RoundingMode.DOWN);
        System.out.println(result);
    }
}