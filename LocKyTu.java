package fs.apidef.identifyservice.java.class_9;

import java.util.Scanner;

public class LocKyTu {
    void locKyTu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String a = sc.nextLine();
        System.out.println(unique(a));
    }

    String unique(String s) {
        String str = new String();
        for (int i = 0; i < s.length(); i++) {
            if (str.indexOf(s.charAt(i)) < 0) {
                str += s.charAt(i);
            }
        }
        return str;
    }
}
