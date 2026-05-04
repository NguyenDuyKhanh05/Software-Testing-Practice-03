package src.test.java;

import static org.junit.Assert.*;
import org.junit.Test;

import src.main.java.MathFunctions;

public class MathFunctionsTest {
    MathFunctions mf = new MathFunctions();

    @Test
    public void testChuViDienTich() {
        assertEquals(10.0, mf.tinhChuViHCN(2, 3), 0.0);
        assertEquals(-1, mf.tinhChuViHCN(-1, 3), 0.0); // Nhánh lỗi
        assertEquals(6.0, mf.tinhDienTichHCN(2, 3), 0.0);
        assertEquals(-1, mf.tinhDienTichHCN(2, 0), 0.0); // Nhánh lỗi
    }

    @Test
    public void testGiaiPTBac2() {
        assertEquals("x1 = 2.0, x2 = 1.0", mf.giaiPTBac2(1, -3, 2)); // delta > 0
        assertEquals("x = -1.0", mf.giaiPTBac2(1, 2, 1));           // delta = 0
        assertEquals("Vo nghiem", mf.giaiPTBac2(1, 1, 1));          // delta < 0
        assertEquals("x = -1.0", mf.giaiPTBac2(0, 2, 2));           // a = 0, b != 0
        assertEquals("Vo so nghiem", mf.giaiPTBac2(0, 0, 0));       // a=0, b=0, c=0
        assertEquals("Vo nghiem", mf.giaiPTBac2(0, 0, 5));          // a=0, b=0, c!=0
    }

    @Test
    public void testTinhSoNgay() {
        assertEquals(31, mf.tinhSoNgay(1, 2024));
        assertEquals(30, mf.tinhSoNgay(4, 2024));
        assertEquals(29, mf.tinhSoNgay(2, 2024)); // Năm nhuận
        assertEquals(28, mf.tinhSoNgay(2, 2023)); // Không nhuận
        assertEquals(-1, mf.tinhSoNgay(13, 2024)); // Nhánh tháng sai
    }

    @Test
    public void testPrime() {
        assertFalse(mf.isPrime(1));  // n < 2
        assertTrue(mf.isPrime(2));   // n = 2
        assertTrue(mf.isPrime(7));   // Số nguyên tố
        assertFalse(mf.isPrime(10)); // Vòng lặp tìm thấy ước
    }

    @Test
    public void testTongS1() {
        assertEquals(0, mf.tinhTongS1(0));
        assertEquals(1, mf.tinhTongS1(1));  // 1
        assertEquals(-1, mf.tinhTongS1(2)); // 1 - 2
        assertEquals(2, mf.tinhTongS1(3));  // 1 - 2 + 3
    }

    @Test
    public void testUCLN() {
        assertEquals(5, mf.findUCLN(10, 5));
        assertEquals(5, mf.findUCLN(5, 10));
        assertEquals(10, mf.findUCLN(10, 0));
        assertEquals(1, mf.findUCLN(7, 3));
    }

    @Test
    public void testTongGiaiThua() {
        assertEquals(0, mf.tinhTongGiaiThua(0));
        assertEquals(1, mf.tinhTongGiaiThua(1)); // 1!
        assertEquals(3, mf.tinhTongGiaiThua(2)); // 1! + 2!
        assertEquals(9, mf.tinhTongGiaiThua(3)); // 1! + 2! + 3!
    }
}