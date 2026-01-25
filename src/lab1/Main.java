package lab1;
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
        Motorcycle m1 = new Motorcycle( "Red", 60.5, Material.GOLD);
        m1.setColor("Red");
        m1.setSize(35.0);
        System.out.println(m1.getColor());

        Motorcycle m2 = new Motorcycle( "Blue", 55.5, Material.BAMBOO);
        m2.setColor("Blue");
        System.out.println(m2.getColor());

        Motorcycle m3 = new Motorcycle("Purple", 57.5, Material.TI);
        System.out.println("Motorcycle color: " + m1.getColor());
        System.out.println("Motorcycle size: " + m1.getSize());
        System.out.println("Frame material: " + m1.getFrameMaterial());
        System.out.println("Wheel size: " + m1.getWheelSize());
        m1.start();
        m1.stop();
        System.out.println(m3.getColor());

        System.out.println("Motorcycle color: " + m2.getColor());
        System.out.println("Motorcycle size: " + m2.getSize());
        System.out.println("Frame material: " + m2.getFrameMaterial());
        System.out.println("Wheel size: " + m2.getWheelSize());
        m2.start();
        m2.stop();

        System.out.println("Bike color: " + m3.getColor());
        System.out.println("Bike size: " + m3.getSize());
        System.out.println("Frame material: " + m3.getFrameMaterial());
        System.out.println("Wheel size: " + m3.getWheelSize());
        m3.start();
        m3.stop();

        Engine myEng = new Engine( "650");
        System.out.println(myEng.getCC());
        Engine myEng2 = new Engine( "670", "400");
        System.out.println(myEng2.getCC());

        Battery myBattery= new Battery( "850");
        System.out.println(myBattery.getCC());
        Battery myBattery2 = new Battery( "470", "200");
        System.out.println(myBattery2.getCC());

        Tank myTank = new Tank( "450");
        System.out.println(myTank.getCC());
        Tank myTank2 = new Tank( "270", "600");
        System.out.println(myTank2.getCC());

    }
}