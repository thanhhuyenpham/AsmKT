import com.example.AsmKT.SinhVienPoly;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSinhVienPoly {
    SinhVienPoly service = new SinhVienPoly();

    //Test thêm 1 đối tượng
    @Test
    public void testcase1ID() {
        int soLuongPhanTu = service.getListSinhVien().size();
        service.add("ID", "Hương", "ML123", "Java", "PH017");
        assertEquals(soLuongPhanTu, service.getListSinhVien().size());
    }
    @Test
    public void testcase2ID() {
        int soLuongPhanTu = service.getListSinhVien().size();
        service.add("ID0", "Hương", "ML123", "Java", "PH017");
        assertEquals(soLuongPhanTu + 1, service.getListSinhVien().size());
    }
    @Test
    public void testcase3ID() {
        int soLuongPhanTu = service.getListSinhVien().size();
        service.add("ID03", "Hương", "ML123", "Java", "PH017");
        assertEquals(soLuongPhanTu + 1, service.getListSinhVien().size());
    }
    @Test
    public void testcase4HoTen() {
        int soLuongPhanTu = service.getListSinhVien().size();
        service.add("ID03", "Hư", "ML123", "Java", "PH017");
        assertEquals(soLuongPhanTu, service.getListSinhVien().size());
    }
    @Test
    public void testcase5HoTen() {
        int soLuongPhanTu = service.getListSinhVien().size();
        service.add("ID03", "Hươ", "ML123", "Java", "PH017");
        assertEquals(soLuongPhanTu + 1, service.getListSinhVien().size());
    }
    @Test
    public void testcase6HoTen() {
        int soLuongPhanTu = service.getListSinhVien().size();
        service.add("ID03", "Hươn", "ML123", "Java", "PH017");
        assertEquals(soLuongPhanTu + 1, service.getListSinhVien().size());
    }
    @Test
    public void testcase7MaLop() {
        int soLuongPhanTu = service.getListSinhVien().size();
        service.add("ID03", "Hương", "ML", "Java", "PH017");
        assertEquals(soLuongPhanTu, service.getListSinhVien().size());
    }
    @Test
    public void testcase8MaLop() {
        int soLuongPhanTu = service.getListSinhVien().size();
        service.add("ID03", "Hương", "ML1", "Java", "PH017");
        assertEquals(soLuongPhanTu + 1, service.getListSinhVien().size());
    }
    @Test
    public void testcase9MaLop() {
        int soLuongPhanTu = service.getListSinhVien().size();
        service.add("ID03", "Hương", "ML12", "Java", "PH017");
        assertEquals(soLuongPhanTu + 1, service.getListSinhVien().size());
    }
    @Test
    public void testcase10TenLop() {
        int soLuongPhanTu = service.getListSinhVien().size();
        service.add("ID03", "Hương", "ML123", "Ja", "PH017");
        assertEquals(soLuongPhanTu, service.getListSinhVien().size());
    }
    @Test
    public void testcase11TenLop() {
        int soLuongPhanTu = service.getListSinhVien().size();
        service.add("ID03", "Hương", "ML123", "Jav", "PH017");
        assertEquals(soLuongPhanTu + 1, service.getListSinhVien().size());
    }

    //Test tenlop không chứa ký tự đặc biệt
    @Test
    public void testcaseTenLopKhongChuaKyTuDacBiet() {
        int soLuongPhanTu = service.getListSinhVien().size();
        service.add("ID03", "Hương", "ML123", "Java!", "PH017");
        assertEquals(soLuongPhanTu, service.getListSinhVien().size());
    }

    //Test tìm kiếm theo mã sinh viên
    @Test
    public void testcase1() {
        assertEquals(false, service.searchMaSV("I"));
    }
    @Test
    public void testcase2() {
        assertEquals(false, service.searchMaSV("ID1234"));
    }
    @Test
    public void testcase3() {
        assertEquals(false, service.searchMaSV("ID012333333"));
    }
    @Test
    public void testcaseNhapDungMasv() {
        assertEquals(true, service.searchMaSV("PH123"));
    }
    @Test
    public void testcase6NhapSaiMasv() {
        assertEquals(false, service.searchMaSV("PH111"));
    }
}
