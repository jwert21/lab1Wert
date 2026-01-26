/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Jonah Wert
 * Date Developed: 1/20/2026
 * Last Date Changed: 1/25/2026
 * Rev: 1/25/2026

 */

package lab1;
public class Engine {

    private String cc;
    private String hp;

    public Engine(String cc) {
        this.cc = cc;
    }

    public Engine(String cc, String hp) {
        this.cc = cc;
        this.hp = hp;
    }

    public Engine() {
        this("Regular", "Diesel");
    }

    public void setCC(String c1) {
        this.cc = c1;
    }

    public String getCC() {
        return this.cc;
    }
}

