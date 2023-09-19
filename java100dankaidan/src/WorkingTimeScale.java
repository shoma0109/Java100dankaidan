import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalDateTime;

public class WorkingTimeScale {
    private BigDecimal total_time = new BigDecimal(0);
    BigDecimal b2 = new BigDecimal(60);
    public void add(BigDecimal num){
        total_time = total_time.add(num);
    }

    public BigDecimal currentWorkingTime(){
        BigDecimal result =total_time.setScale(2, RoundingMode.DOWN);
        return result;
    }

    public void add(LocalDateTime from, LocalDateTime to) {
        final Duration duration = Duration.between(from, to);
        final var hourminutes = duration.toMinutes();
        final var minute = BigDecimal.valueOf(hourminutes);
        final var total_hourminutes =  minute.setScale(2,RoundingMode.HALF_UP).divide(b2,RoundingMode.HALF_UP);
        total_time = currentWorkingTime().add(total_hourminutes);
        System.out.println(total_hourminutes);
        System.out.println(total_time);
    }
}