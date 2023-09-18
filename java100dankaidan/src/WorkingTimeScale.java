import java.math.BigDecimal;
import java.math.RoundingMode;

public class WorkingTimeScale {
    private BigDecimal total_time = new BigDecimal("10.1256789");
    public void add(int num){
    }

    public void currentWorkingTime(){
        BigDecimal result = total_time.setScale(2, RoundingMode.DOWN);
        System.out.println(result);
    }
}