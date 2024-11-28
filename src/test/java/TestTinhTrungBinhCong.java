import com.example.AsmKT.TinhTrungBinhCong;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTinhTrungBinhCong {
    TinhTrungBinhCong service = new TinhTrungBinhCong();
    @Test
    public void testcaseMangRong() {
        double[] mang = {};
        assertThrows(IllegalArgumentException.class, () -> {
            service.TinhTrungBinhCong(mang);
        });
    }
    @Test
    public void testcaseMangNull() {
        double[] mang = null;
        assertThrows(IllegalArgumentException.class, () -> {
            service.TinhTrungBinhCong(mang);
        });
    }
    @Test
    public void testcase3() {
        double[] mang = {2.5,3};
        assertEquals(2.75,service.TinhTrungBinhCong(mang));
    }
    @Test
    public void testcase4() {
        double[] mang = {1,2,3,4};
        assertEquals(2.5,service.TinhTrungBinhCong(mang));
    }
    @Test
    public void testcase5() {
        double[] mang = {1,2,3,5,6};
        assertEquals(3.4,service.TinhTrungBinhCong(mang));
    }
    @Test
    public void testcase6() {
        double[] mang = {1,2,3};
        assertEquals(2,service.TinhTrungBinhCong(mang));
    }
    @Test
    public void testcase7() {
        double[] mang = {1,2};
        assertEquals(1.5,service.TinhTrungBinhCong(mang));
    }
    @Test
    public void testcase8() {
        double[] mang = {1,2,3,8};
        assertEquals(2,service.TinhTrungBinhCong(mang));
    }
    @Test
    public void testcase9() {
        double[] mang = {2,3,4};
        assertEquals(3,service.TinhTrungBinhCong(mang));
    }
    @Test
    public void testcase10() {
        double[] mang = {3,5,7};
        assertEquals(5,service.TinhTrungBinhCong(mang));
    }
}