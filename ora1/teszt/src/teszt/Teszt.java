/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teszt;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author Ritusca
 */
public class Teszt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        int sum2 = 0;
        int all = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy egész számot: ");
        String sor = sc.nextLine(); //sor beolvasása
        String sor2 = sc.nextLine();
        //int a = sc.nextInt();
        //System.out.println("A beolvasott szám: " + a);
        
        //Darabolás
        StringTokenizer st1 = new StringTokenizer(sor,","); //elválasztó
        StringTokenizer st2 = new StringTokenizer(sor2,",");
        
        int db = st1.countTokens(); // adatok (tokenek) száma
        int db2 = st2.countTokens();
        while (st1.hasMoreTokens()) {
            sum += Integer.parseInt(st1.nextToken());
        }
        while (st2.hasMoreTokens()) {
            sum2 += Integer.parseInt(st2.nextToken());
        }
        System.out.println("A beolvasott számok (" +db+ " db) összege: " + sum);
        System.out.println("A beolvasott számok (" +db2+ " db) összege: " + sum2);
        all = sum+sum2;
        System.out.println("összesen: "+all);
         
        }
        
    }
    
}
