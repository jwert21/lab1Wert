/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Jonah Wert
 * Date Developed: 1/20/2026
 * Last Date Changed: 1/22/2026
 * Rev: 1/22/2026

 */

public class Main {
    public static void main(String[] args){
        Motorcycle m1 = new Motorcycle( "Red", 60.5, Material.);
        System.out.println(m1.getColor());

        Motorcycle m2 = new Motorcycle( "Blue");
        System.out.println(m2.getColor());

        Motorcycle m3 = new Motorcycle("Purple");
        System.out.println(m3.getColor());

        Engine myEng = new Engine( "650");
        System.out.println(myEng.getCC());
        Engine myEng2 = new Engine( "670", "400");
        System.out.println(myEng2.getCC());
    }
}