import java.math.BigDecimal;
import java.math.RoundingMode;

public class WorkingTimeScale {
    private BigDecimal total_time = new BigDecimal(0);
    public void add(BigDecimal num){
        System.out.println(num);
    }

    public BigDecimal currentWorkingTime(BigDecimal number){
        BigDecimal result =number.setScale(2, RoundingMode.DOWN);
        System.out.println(result);
        return result;
    }
}