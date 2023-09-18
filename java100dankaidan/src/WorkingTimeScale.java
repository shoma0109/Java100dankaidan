import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

public class WorkingTimeScale {
    private BigDecimal total_time = new BigDecimal(0);
    public void add(BigDecimal num){
        total_time = total_time.add(num);
    }

    public BigDecimal currentWorkingTime(){
        BigDecimal result =total_time.setScale(2, RoundingMode.DOWN);
        return result;
    }

    public void add(LocalDateTime ldt1, LocalDateTime ldt2) {
        System.out.println(ldt1);
        System.out.println(ldt2);
//      Duration.main(ldt1, ldt2);
    }
}