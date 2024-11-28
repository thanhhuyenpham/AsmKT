import com.example.AsmKT.TinhHieu2SoNguyen;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTinhHieu2SoNguyen {
    TinhHieu2SoNguyen service = new TinhHieu2SoNguyen();
    @Test
    public void testcase1(){assertEquals(2,service.TinhHieu2SoNguyen("3","1"));}
    @Test
    public void testcase2(){assertEquals(1,service.TinhHieu2SoNguyen("3","2"));}
    @Test
    public void testcase3(){assertEquals(3,service.TinhHieu2SoNguyen("3","0"));}
    @Test
    public void testcase4(){assertEquals(-6,service.TinhHieu2SoNguyen("3","9"));}
    @Test
    public void testcase5(){assertEquals(-7,service.TinhHieu2SoNguyen("3","10"));}
    @Test
    public void testcase6(){assertEquals(-8,service.TinhHieu2SoNguyen("3","11"));}
    @Test
    public void testcase7(){assertEquals(2,service.TinhHieu2SoNguyen("3","5"));}
    @Test
    public void testcase8(){assertEquals(-12,service.TinhHieu2SoNguyen("3","15"));}
    @Test
    public void testCaseNhapVaoSoThuNhatLaSoThapPhan(){
        assertThrows(NumberFormatException.class, () -> {
            service.TinhHieu2SoNguyen("1.5", "4");
        });
    }
    @Test
    public void testCaseNhapVaoSoThuHaiLaSoThapPhan(){
        assertThrows(NumberFormatException.class, () -> {
            service.TinhHieu2SoNguyen("5", "4.8");
        });
    }
}
