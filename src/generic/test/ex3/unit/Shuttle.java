package generic.test.ex3.unit;

public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in(T t) {
        unit = t;
    }

    public T out() {
        return unit;
    }


    public void showInfo() {
        System.out.println("unit.get = " + unit.getName());
        System.out.println("unit.getHp() = " + unit.getHp());
    }
}
