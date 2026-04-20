import math

class BlackBoxExercises:
    # 1. Tính chu vi hình chữ nhật
    def tinh_chu_vi_hcn(self, a, b):
        if a <= 0 or b <= 0: return "Dữ liệu không hợp lệ"
        return 2 * (a + b)

    # 2. Tính diện tích hình chữ nhật
    def tinh_dien_tich_hcn(self, a, b):
        if a <= 0 or b <= 0: return "Dữ liệu không hợp lệ"
        return a * b

    # 3. Giải phương trình bậc 2: ax^2 + bx + c = 0
    def giai_pt_bac_2(self, a, b, c):
        if a == 0:
            if b == 0: return "Vô nghiệm" if c != 0 else "Vô số nghiệm"
            return -c / b
        delta = b**2 - 4*a*c
        if delta < 0: return "Vô nghiệm"
        elif delta == 0: return -b / (2*a)
        else:
            x1 = (-b + math.sqrt(delta)) / (2*a)
            x2 = (-b - math.sqrt(delta)) / (2*a)
            return (x1, x2)

    # 4. Tính số ngày của một tháng (giả sử năm hiện tại 2024 - năm nhuận)
    def tinh_so_ngay(self, thang, nam=2024):
        if not (1 <= thang <= 12): return "Tháng không hợp lệ"
        if thang in [1, 3, 5, 7, 8, 10, 12]: return 31
        if thang in [4, 6, 9, 11]: return 30
        if thang == 2:
            return 29 if (nam % 4 == 0 and nam % 100 != 0) or (nam % 400 == 0) else 28

    # 5. Kiểm tra số nguyên tố
    def la_so_nguyen_to(self, n):
        if not isinstance(n, int) or n < 2: return False
        for i in range(2, int(math.sqrt(n)) + 1):
            if n % i == 0: return False
        return True

    # 6. Tính tổng S = 1 - 2 + 3 - 4 + ... + n
    def tinh_tong_S6(self, n):
        if n <= 0: return "Dữ liệu không hợp lệ"
        # Công thức nhanh: nếu n chẵn S = -n/2, nếu n lẻ S = (n+1)/2
        s = 0
        for i in range(1, n + 1):
            s += i if i % 2 != 0 else -i
        return s

    # 7. Tìm UCLN của a và b
    def tim_ucln(self, a, b):
        if a == 0 or b == 0: return abs(a + b)
        a, b = abs(a), abs(b)
        return math.gcd(a, b)

    # 8. Tính tổng S = 1! + 2! + ... + n!
    def tinh_tong_giai_thua(self, n):
        if n < 0: return "Dữ liệu không hợp lệ"
        if n == 0: return 1
        tong, gt = 0, 1
        for i in range(1, n + 1):
            gt *= i
            tong += gt
        return tong