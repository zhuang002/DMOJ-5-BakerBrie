/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakerbrie;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class BakerBrie {

    static Scanner sc=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=0;i<2;i++) {
            System.out.println(doOneCase());
        }
    }

    private static int doOneCase() {
        
        int f=sc.nextInt();
        int d=sc.nextInt();
        int[] dayAmount=new int[d];
        int[] franchiseAmount=new int[f];
        for (int i=0;i<d;i++) dayAmount[i]=0;
        for (int i=0;i<f;i++) franchiseAmount[i]=0;
        for (int i=0;i<d;i++) {
            for (int j=0;j<f;j++) {
                int amount=sc.nextInt();
                dayAmount[i]+=amount;
                franchiseAmount[j]+=amount;
            }
        }
        int dozens=0;
        for (int i=0;i<d;i++) {
            if (dayAmount[i]%13 == 0) {
                dozens+=dayAmount[i]/13;
            }
        }
        for (int i=0;i<f;i++) {
            if (franchiseAmount[i]%13==0)
                dozens+=franchiseAmount[i]/13;
        }
        return dozens;
    }
    
}
