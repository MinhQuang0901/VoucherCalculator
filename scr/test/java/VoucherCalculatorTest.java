import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VoucherCalculatorTest {

    @Test
    public void testCalculateFinalPrice_BoundaryValue() {
        VoucherCalculator calculator = new VoucherCalculator();
        
        // Kịch bản: Mua 100k, ship 20k (Tổng 120k). Nhưng áp mã Voucher 150k
        double result = calculator.calculateFinalPrice(100000, 20000, 150000);
        
        // Rào chắn: Kỳ vọng số tiền phải >= 0. Nếu âm thì đánh trượt (Fail)
        assertTrue(result >= 0, "LỖI: Gia tri don hang bi am (" + result + "d)");
    }
}