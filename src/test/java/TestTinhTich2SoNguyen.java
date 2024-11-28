import com.example.AsmKT.TinhTich2SoNguyen;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTinhTich2SoNguyen {
    TinhTich2SoNguyen service = new TinhTich2SoNguyen();
    @Test
    public void testcase1() {assertEquals(2,service.TinhTich2SoNguyen("1","2"));}
    @Test
    public void testcase2() {assertEquals(4,service.TinhTich2SoNguyen("2","2"));}
    @Test
    public void testcase3() {assertEquals(0,service.TinhTich2SoNguyen("0","2"));}
    @Test
    public void testcase4() {assertEquals(18,service.TinhTich2SoNguyen("9","2"));}
    @Test
    public void testcase5() {assertEquals(20,service.TinhTich2SoNguyen("10","2"));}
    @Test
    public void testcase6() {assertEquals(22,service.TinhTich2SoNguyen("11","2"));}
    @Test
    public void testcase7() {assertEquals(29,service.TinhTich2SoNguyen("1","29"));}
    @Test
    public void testcase8() {assertEquals(-22,service.TinhTich2SoNguyen("1","-22"));}
    @Test
    public void testCaseNhapVaoSoThuNhatLaSoThapPhan(){
        assertThrows(NumberFormatException.class, () -> {
            service.TinhTich2SoNguyen("1.5", "4");
        });
    }
    @Test
    public void testCaseNhapVaoSoThuHaiLaSoThapPhan(){
        assertThrows(NumberFormatException.class, () -> {
            service.TinhTich2SoNguyen("5", "4.8");
        });
    }
}
