import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    public static void main(String[] args){
        WorkingTimeScale workingTimeScale = new WorkingTimeScale();
        var number = 10.1256789;
        LocalDateTime from = LocalDateTime.of(2023,9,1,0,0,0);
        LocalDateTime to = LocalDateTime.of(2023,9,1,8,16,59);
        workingTimeScale.add(BigDecimal.valueOf(number));
        workingTimeScale.add(BigDecimal.valueOf(number));
        workingTimeScale.add(BigDecimal.valueOf(number));
        workingTimeScale.add(from,to);
    }
}