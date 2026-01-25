package lab1;
/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Joe Oakes
 * Date Developed: 1/22/2026
 * Last Date Changed: 1/23/2026
 * Rev: 1/23/2026

 */


// Motorcycle class
public class Motorcycle{
    /**
     * The color of the motorcycle
     */

    private String colorA;
    /**
     * The size of the motorcycle
     */
    private double size;
    private Frame frame;
    private Wheel[] wheels;
    private Engine engine;
    private Battery battery;
    private Tank tank;

    /**
     * Adds two numbers and returns the result.
     *
     * @param colorA This is the color of the bike frame.
     * @param size This is the size of the bike frame.
     */

    public Motorcycle(String color, double size, Material material) {
        this(color, size, material, 26.0);
    }

    public Motorcycle(String color1, double size, Material frameMaterial, double wheelSize, Engine engine, Battery battery, Tank tank) {
        this.colorA = color1;
        this.size = size;
        this.frame = new Frame(frameMaterial);
        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(wheelSize);
        this.wheels[1] = new Wheel(wheelSize);
        this.engine = engine;
        this.battery = battery;
        this.tank = tank;
        this.engine = new Engine();
        this.battery = new Battery();
        this.tank = new Tank();
    }

    public String getColor(){
        return this.colorA;
    }

    public void setColor(String color){
        this.colorA = color;
    }

    public double getSize(){
        return size;
    }

    public void setSize(double size){
        this.size = size;
    }

    public Material getFrameMaterial(){
        return frame.getMaterial();
    }

    public double getWheelSize(){
        return wheels[0].getSize();
    }

    public void start() {
        System.out.println("Motorcycle started!");
    }
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}
