import java.math.BigDecimal;
import java.math.RoundingMode;

import static javax.management.Query.plus;

public class WorkingTimeScale {
    private BigDecimal total_time = new BigDecimal(0);
    public void add(BigDecimal num){
        total_time = total_time.add(num);
    }

    public BigDecimal currentWorkingTime(){
        BigDecimal result =total_time.setScale(2, RoundingMode.DOWN);
        return result;
    }
}