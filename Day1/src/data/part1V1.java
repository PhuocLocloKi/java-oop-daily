/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author PC
 */

/*
vong lap for each la read only chi doc khong the dung no de thay doi gia tri cua mang

*/
public class part1V1 {
//    public static void main(String[] args) {
//        System.out.println("Com dy me m");
//        
//        //tao cai mang
//        int cu[] = {10, 20, 30, 40, 50};
//        for(int i = 0; i < cu.length; i++) System.out.print(cu[i] + ",");
//        System.out.println();
//        //so nguen x nam trong mang cu hãy in x ra 
//        for(int x : cu )System.out.print(x + ",");
//        System.out.println();
//        
//        //neu ma muon tang phan tu len 1 don vi nao do thì dung 
//
//        for(int i = 0; i < cu.length; i++){
//            cu[i] += 10;
//            System.out.print(cu[i] + ",");
//
//        }
//    }
    
/*
ban chat cua string 
string name = "HELLO" Chuoi binh thuong
string s = "" day la chuoi rong(empty string)
string s = null tro vao hu vo

khac nha la chuoi rong no là
vi du: co 1 cái vi tien nhung khong dong xu nao het á
null no la ban hoan toan khong có gi ca khong co vi hay tien luon 
    
*/   
    //chuyen doi va ep kieu java

    public static void main(String[] args) {
//        int a = 130;
//        byte b = (byte) a;
//        System.out.println(b); //byte java chua tu -128 - 127 -> 130 vuot qua xa
//        
//        //ep so thuc ve s nguyen 
//        double diem = 9.0;
//        int diemLamTron = (int) diem;
//        System.out.println(diemLamTron);
        
        //pham vi hoat dong, vong doi cua bien
        int x = 10, k = 2;
        int y = 0; //khai bao bien o ngoai
        if(x < 2){
            y = 3; //ben trong chi gan lai gia tri
        }
        y = 6; //o ngoai van dung binh thuong, khong bao gio bi loi
        
        int i;
        for(i = 1; i < 3; i++) x+=i;
        k += i;
        //la 
        
        System.out.println("x =  " + x);
        System.out.println("y =  " + y);
        System.out.println("k =  " + k);
        System.out.println("i =  " + i);
        
    }
}
