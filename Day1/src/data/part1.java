/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import com.sun.org.apache.xml.internal.utils.res.StringArrayWrapper;

/**
 *
 * @author PC
 */
/*
  ++, -- giam di 1 don vi 
  ! => true thanh false, chi dung cho boolean
  ~ => phu dinh bit(bitwise not) doi toan bo bit 0 thanh 1 va nguoc lai
  (type) => ep kieu(casting) vidu int 5.7 cat bo phan thap phan con lai 5.
*/

/* toan tu so hoc 
+ , - 
+ => còn dung de noi cac chuoi lai
*/

/* shift dich bit
<< dich trai nhan voi 2 mu n vi du 5x2 = 10
>> dich phai co dau, no giu nguyen bit dau ( neu ma co so am thì chen 1 vao dau, còn duong thi chen 0)
>>> dich phai khong dau 
*/

/* nhom toan tu so sanh 
Toán tử	Nghĩa	Ví dụ	Kết quả
<	Nhỏ hơn	5 < 10	true
<=	Nhỏ hơn hoặc bằng	5 <= 5	true
>	Lớn hơn	10 > 5	true
>=	Lớn hơn hoặc bằng

*/

/*
 ==, != (so sanh bang va khac)
kieu nguyen thuy thi int, char  == so sanh gia tri 
doi tuong object string == so sánh dia chi o nho khong so noi dung ben trong(so sanh noi dung dung .equals())
*/

/*  && || doan mach
A && B neu A la false java khong them tinh B nua vi ket qua là false
A || B neu A à true java cung khong them tinh b nua vi chac chan ket qua la true
*/

/* toan tu 3 ngoi
? viet tat cua cau lenh if else
=> cu phap no la (dieu kien) ? (gia tri neu dung) : (gia tri neu sai);
int max = (a > b) ? a : b;

*/
public class part1 {
//    public static void main(String[] args) {
//        int a = 5; 
//        int b = a++; // b = 5 sau do a moi len 6 (gan truoc, tang sau)
//        int c = ++a;// a = 7 truoc ròi moi gán c = 7 (tang truoc, gan sau)
//    }
    
//    public static void main(String[] args) {
//        System.out.println("Java" + 1 + 2); // in ra java12( vi no tinh tu trai qua phai, gap chuoi la noi)
//        System.out.println( 1 + 2 + "Java");// in ra "3 java" (tinh 1 + 2 = 3, roi moi noi chuoi
//    }
    
//    public static void main(String[] args) {
//        int a = 10;
//        System.out.println( a < 20);
//    }
    
//    public static void main(String[] args) {
//        String s = null;
//        //dung && an toan s != null la false -> ngat luon khong chay ve sau nua 
//        if(s !=null && s.length() > 0 ){}
//        // con dung s  no co tinh ca s.length()bi nullpointerexception
//    }
    
    public static void main(String[] args) {
        int x = -10;
        
        System.out.println("-10<<1" + (x << 1 ));
        System.out.println("-10>>1" + (x >> 1 ));
        System.out.println("-10>>>1" + (x >>> 1 ));
        System.out.println("7 & 10: " + (7 & 10 ));
        System.out.println("7 ^ 10: " + (7 ^ 1));
        System.out.println("7 | 10: " + (7 | 1));
        
        
        String S = "Hello"; 
        boolean result = S instanceof String;
        System.out.println("hello instance" + result);
        //kiem tra bien tham chieu co tro toi s cua doi tuong thuoc lop string khong
        //dung instcanceof laf de hoi truoc kiem tra truoc mot thu gi do giup an toan hon
        
        

//       \n xuong dong
//       \t tab thut dau dong
          System.out.println("MSSV\tHo Ten\tDiem");
          System.out.println("SE\tNguyen Loc\t9.0");
          
//       \" in dau ngoac kep ben trong chuoi'
         System.out.println("Tao noi la: \" tao la manh nhat\"");
    }
}
