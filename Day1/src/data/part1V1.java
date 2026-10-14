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
    public static void main(String[] args) {
        System.out.println("Com dy me m");
        
        //tao cai mang
        int cu[] = {10, 20, 30, 40, 50};
        for(int i = 0; i < cu.length; i++) System.out.print(cu[i] + ",");
        System.out.println();
        //so nguen x nam trong mang cu hãy in x ra 
        for(int x : cu )System.out.print(x + ",");
        System.out.println();
        
        //neu ma muon tang phan tu len 1 don vi nao do thì dung 

        for(int i = 0; i < cu.length; i++){
            cu[i] += 10;
            System.out.print(cu[i] + ",");

        }
    }
    
}
