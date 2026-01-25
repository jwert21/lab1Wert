package lab1;
public class Battery {

    private String cc;
    private String hp;

    public Battery(String cc) {
        this.cc = cc;
    }

    public Battery(String cc, String hp) {
        this.cc = cc;
        this.hp = hp;
    }

    public Battery() {
        this("Single-Cylinder", "Parallel-Twin");
    }

    public void setCC(String c1) {
        this.cc = c1;
    }

    public String getCC() {
        return this.cc;
    }
}