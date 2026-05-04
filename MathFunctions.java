package src.main.java;

public class MathFunctions {

    // 1. Tính chu vi hình chữ nhật
    public double tinhChuViHCN(double dai, double rong) {
        if (dai <= 0 || rong <= 0) return -1;
        return (dai + rong) * 2;
    }

    // 2. Tính diện tích hình chữ nhật
    public double tinhDienTichHCN(double dai, double rong) {
        if (dai <= 0 || rong <= 0) return -1;
        return dai * rong;
    }

    // 3. Giải phương trình bậc 2: ax^2 + bx + c = 0
    public String giaiPTBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) return (c == 0) ? "Vo so nghiem" : "Vo nghiem";
            return "x = " + (-c / b);
        }
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "x1 = " + x1 + ", x2 = " + x2;
        } else if (delta == 0) {
            return "x = " + (-b / (2 * a));
        } else {
            return "Vo nghiem";
        }
    }

    // 4. Tính số ngày của một tháng
    public int tinhSoNgay(int thang, int nam) {
        if (thang < 1 || thang > 12 || nam < 1) return -1;
        switch (thang) {
            case 4: case 6: case 9: case 11: return 30;
            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) return 29;
                return 28;
            default: return 31;
        }
    }

    // 5. Kiểm tra số nguyên tố
    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 6. Tính tổng S = 1 - 2 + 3 - 4 + ... + n
    public int tinhTongS1(int n) {
        if (n <= 0) return 0;
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) tong += i;
            else tong -= i;
        }
        return tong;
    }

    // 7. Tìm UCLN của a và b
    public int findUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) return a + b;
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }

    // 8. Tính tổng S = 1! + 2! + ... + n!
    public long tinhGiaiThua(int n) {
        long gt = 1;
        for (int i = 1; i <= n; i++) gt *= i;
        return gt;
    }

    public long tinhTongGiaiThua(int n) {
        if (n <= 0) return 0;
        long tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += tinhGiaiThua(i);
        }
        return tong;
    }
}