import com.example.AsmKT.TinhTong2SoNguyen;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTinhTong2SoNguyen {

    TinhTong2SoNguyen service = new TinhTong2SoNguyen();

    @Test
    public void testcase1(){assertEquals(5,service.TinhTong2SoNguyen("1", "4"));}
    @Test
    public void testcase2(){assertEquals(6,service.TinhTong2SoNguyen("2", "4"));}
    @Test
    public void testcase3(){assertEquals(11,service.TinhTong2SoNguyen("1", "10"));}
    @Test
    public void testcase4(){assertEquals(14,service.TinhTong2SoNguyen("10", "4"));}
    @Test
    public void testcase5(){assertEquals(10,service.TinhTong2SoNguyen("1", "9"));}
    @Test
    public void testcase6(){assertEquals(12,service.TinhTong2SoNguyen("1", "11"));}
    @Test
    public void testcase7(){assertEquals(7,service.TinhTong2SoNguyen("3", "4"));}
    @Test
    public void testcase8(){assertEquals(9,service.TinhTong2SoNguyen("5", "4"));}
    @Test
    public void testCaseNhapVaoSoThuNhatLaSoThapPhan(){
        assertThrows(NumberFormatException.class, () -> {
            service.TinhTong2SoNguyen("1.5", "4");
        });
    }
    @Test
    public void testCaseNhapVaoSoThuHaiLaSoThapPhan(){
        assertThrows(NumberFormatException.class, () -> {
            service.TinhTong2SoNguyen("5", "4.8");
        });
    }
}
