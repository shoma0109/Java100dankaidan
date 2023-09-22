import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import static org.junit.Assert.assertEquals;

class 時刻の差が割り切れる値のテスト {
    BigDecimal Expected_value = new BigDecimal("1.50");
    WorkingTimeScale workingTimeScale = new WorkingTimeScale();
    LocalDateTime from = LocalDateTime.of(2023,9,1,0,0,0);
    LocalDateTime to = LocalDateTime.of(2023,9,1,1,30,0);

    @Test
    void divisible(){
        assertEquals("値が期待値と異なります。", Expected_value, workingTimeScale.add(from, to));
    }
}

class 時刻の差が割り切れず小数二桁で表示される値のテスト {
    BigDecimal Expected_value = new BigDecimal("0.03");
    WorkingTimeScale workingTimeScale = new WorkingTimeScale();
    LocalDateTime from = LocalDateTime.of(2023,9,1,0,0,0);
    LocalDateTime to = LocalDateTime.of(2023,9,1,0,2,0);

    @Test
    void Indivisible(){
        assertEquals("値が期待値と異なります。", Expected_value, workingTimeScale.add(from, to));
    }
}

class 入力された秒数は計上されないことを確認するテスト {
    BigDecimal Expected_value = new BigDecimal("0.01");
    WorkingTimeScale workingTimeScale = new WorkingTimeScale();
    LocalDateTime from = LocalDateTime.of(2023,9,1,0,0,0);
    LocalDateTime to = LocalDateTime.of(2023,9,1,0,1,59);

    @Test
    void Ignore_seconds(){
        assertEquals("miss", Expected_value, workingTimeScale.add(from, to));
    }
}

class 時刻の差がマイナスかつ割り切れる値のテスト {
    BigDecimal Expected_value = new BigDecimal("-1.50");
    WorkingTimeScale workingTimeScale = new WorkingTimeScale();
    LocalDateTime from = LocalDateTime.of(2023,9,1,1,30,0);
    LocalDateTime to = LocalDateTime.of(2023,9,1,0,0,0);

    @Test
    void minus_divisible(){
        assertEquals("値が期待値と異なります。", Expected_value, workingTimeScale.add(from, to));
    }
}

class 時刻の差がマイナスかつ割り切れず小数二桁で表示される値のテスト {
    BigDecimal Expected_value = new BigDecimal("-0.03");
    WorkingTimeScale workingTimeScale = new WorkingTimeScale();
    LocalDateTime from = LocalDateTime.of(2023,9,1,0,2,0);
    LocalDateTime to = LocalDateTime.of(2023,9,1,0,0,0);

    @Test
    void minus_Indivisible(){
        assertEquals("値が期待値と異なります。", Expected_value, workingTimeScale.add(from, to));
    }
}

class 時刻の差がマイナスかつ入力された秒数は計上されないことを確認するテスト {
    BigDecimal Expected_value = new BigDecimal("-0.01");
    WorkingTimeScale workingTimeScale = new WorkingTimeScale();
    LocalDateTime from = LocalDateTime.of(2023,9,1,0,1,59);
    LocalDateTime to = LocalDateTime.of(2023,9,1,0,0,0);

    @Test
    void minus_Ignore_seconds(){
        assertEquals("miss", Expected_value, workingTimeScale.add(from, to));
    }
}