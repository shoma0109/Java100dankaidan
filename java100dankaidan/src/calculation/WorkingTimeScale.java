package calculation;
import java.math.BigDecimal;

public class WorkingTimeScale {
    private final BigDecimal time1 = new BigDecimal("10");
    private final BigDecimal time2 = new BigDecimal("0.1256789");
    BigDecimal result = time1.add(time2);
    public void add(int num1, int num2){
        System.out.println(result);
    }
}