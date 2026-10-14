/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runtime;

/**
 *
 * @author PC
 */
public class programPart1 {
    
/*
bai 1 tinh diem thi mot mang (int[] marks = {8,9,7,10,6})    
*/
    public static void main(String[] args) {
        int[] marks = {8, 9, 7, 10, 6};
        int sum = 0; 
        for(int x : marks){
            sum += x; // lay thang va cong vao
        }
        System.out.println("Tong" + sum);
    }
}
