package generic.test.ex3.unit;

public class ShuttleTest {

    public static void main(String[] args) {
        Shuttle<Marine> Shuttle1 =  new Shuttle<>();
        Shuttle1.in(new Marine("마린", 40));
        Shuttle1.showInfo();

        Shuttle<Zergling> Shuttle2 =  new Shuttle<>();
        Shuttle2.in(new Zergling("저글링", 35));
        Shuttle2.showInfo();

        Shuttle<Zealot> Shuttle3 =  new Shuttle<>();
        Shuttle3.in(new Zealot("질럿", 100));
        Shuttle3.showInfo();
    }
}
