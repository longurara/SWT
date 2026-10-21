package com.phucdp.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {

        //REFACTORING, REFACTOR: TỐI ƯU, TINH CHỈNH SOURCES CODE
        //CODE MỚI KHI ĐC ĐƯA LÊN SERVER, PHẢI ĐC CHECK LẠI NGAY Ở NHÁNH DEV, HOẶC KHI ĐƯA VÀO NHÁNH
        //MAIN THÌ CX PHẢI ĐƯỢC CHECK ĐỂ ĐẢM BẢO NÓ MÀU XANH, PASSED CÁC TEST CASE
        //LÝ DO: HÀM NÀY THÌ PHẢI CHẠY ĐÚNG!!!!!!!!!!
        //NẾU PROJECT CÓ SẴN TDD, UNIT TEST, THÌ QUÁ TRÌNH KIỂM THỬ LẠI CODE VỪA SỬA DIỄN RA RẤT
        //NHANH, RẤT TIỆN DO UNIT TEST KHI PHỐI HỢP VỚI CI SCRIPT (.YAML) SẼ TỰ ĐỘNG DC RUN VÀ TỰ BÁO
        //MÀU XANH ĐỎ VÀ GỬI MAIL KHI CÓ MÀU ĐỎ!!!


        //TEST LẠI THỨ ĐÃ TỪNG TEST ĐỂ CHẮC CHẮN NÓ VẪN CÒN ỔN SAU KHI ĐC SỬA
        // GỌI LÀ KIỂM THỬ HỒI QUY - REGRESSION TESTING

        //TA CHỈNH CODE DÙNG ĐỆ QUY - RECURSION


//        //thuat toan tinh n! = 1.2.3...n
//
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("invalid param, n>0 and n<21");

        }

        if ( n == 0 || n == 1){
            return 1; //n=0 hay 1 return ngay, điểm dừng của đệ quy
        }

        //Đệ quy nè, recursion nè, gọi lại chính mình ở quy mô nhỏ hơn nè
        return n* getFactorial(n-1);
        //n! = n * ( n - 1 )!

//        //sure n tu 1..20
//        long result = 1; // init giai thua bang 1, nhan don
//                            // code co tinh tao bug giai thua duoc nhan them 10
//
//        for (int i = 1; i <= n; i++) {
//            result *=i;
//        }
//        return result;
    }
}
