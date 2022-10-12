public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Ali", "programmer", "Apple");
        Dancer dancer = new Dancer("JanVoinov", "dancer","Jabawokceez");
        Singer singer = new Singer("Bahtiyar", "singer", "Bis tobu");
        System.out.println(programmer);
        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.codding();
        System.out.println();
        System.out.println(dancer);
        dancer.dancing();
        dancer.eat();
        dancer.learn();
        dancer.walk();
        System.out.println();
        System.out.println(singer);
        singer.singning();
        singer.playGitar();
        singer.eat();
        singer.learn();
        singer.walk();
    }
}