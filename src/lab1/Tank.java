package lab1;
public class Tank {

    private String cc;
    private String hp;

    public Tank(String cc) {
        this.cc = cc;
    }

    public Tank(String cc, String hp) {
        this.cc = cc;
        this.hp = hp;
    }

    public void setCC(String c1) {
    this.cc = c1;
}

    public String getCC() {
    return this.cc;
}
}