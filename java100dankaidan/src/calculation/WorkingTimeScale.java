package calculation;
import java.math.BigDecimal;

public class WorkingTimeScale {
    private final BigDecimal time1 = new BigDecimal("");
    private final BigDecimal time2 = new BigDecimal("");
    BigDecimal result = time1.add(time2);
    public void add(int x, int y){
        System.out.println(result);
    }
}