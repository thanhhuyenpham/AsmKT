import com.example.AsmKT.TruyXuat1PhanTu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTruyXuat1PhanTu {
    TruyXuat1PhanTu service = new TruyXuat1PhanTu();
    @Test
    public void testcaseIndexKHopLe() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            service.TruyXuat1PhanTu(mang, 123);
        });

    }
    @Test
    public void testcaseIndexKHopLe2() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            service.TruyXuat1PhanTu(mang, -6);
        });
    }
    @Test
    public void testcase3() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(1, service.TruyXuat1PhanTu(mang, 0));
    }
    @Test
    public void testcase4() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(2, service.TruyXuat1PhanTu(mang, 1));
    }
    @Test
    public void testcase5() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(4, service.TruyXuat1PhanTu(mang, 3));
    }
    @Test
    public void testcase6() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(5, service.TruyXuat1PhanTu(mang, 4));
    }
    @Test
    public void testcase7() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(6, service.TruyXuat1PhanTu(mang, 5));
    }
    @Test
    public void testcase8() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(7, service.TruyXuat1PhanTu(mang, 6));
    }
    @Test
    public void testcase9() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(8, service.TruyXuat1PhanTu(mang, 7));
    }
    @Test
    public void testcase10() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            service.TruyXuat1PhanTu(mang, 8);
        });
    }
}
