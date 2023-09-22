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

    public BigDecimal add(LocalDateTime from, LocalDateTime to) {
        final Duration duration = Duration.between(from, to);
        final var hourminutes = duration.toMinutes();
        final var minute = BigDecimal.valueOf(hourminutes);
        final var total_hourminutes =  minute.setScale(2,RoundingMode.DOWN).divide(b2,RoundingMode.DOWN);
        if(total_hourminutes.compareTo (BigDecimal.valueOf (0)) > 0) {
            total_time = currentWorkingTime().add(total_hourminutes);
            System.out.println("経過時間" + total_hourminutes);
            return total_time;
        } else {
            System.out.println("経過時間" + total_hourminutes);
            System.out.println("経過時間の差がマイナスの場合は合計時間に計上されません。");
            return currentWorkingTime();
        }
    }
}