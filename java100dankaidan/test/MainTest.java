import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import static org.junit.Assert.assertEquals;

class MainTest {
    BigDecimal Expected_value = new BigDecimal("0.25");
    WorkingTimeScale workingTimeScale = new WorkingTimeScale();
    LocalDateTime from = LocalDateTime.of(2023,9,1,0,0,0);
    LocalDateTime to = LocalDateTime.of(2023,9,1,0,15,0);
    @Test
    void add(){
        assertEquals("miss", Expected_value, workingTimeScale.add(from, to));
    }
}