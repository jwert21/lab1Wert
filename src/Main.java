public class Main {
    public static void main(String[] args){
        Motorcycle m1 = new Motorcycle( "Red");
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