public class NinjaEmployee extends Employee implements NinjaInterface{

    public Ninja ninja = new Ninja();

    public static void main(String[] args) {

        NinjaEmployee ninjaEmployee = new NinjaEmployee();

        ninjaEmployee.isEmployee();
        ninjaEmployee.isNinja();
    }

    @Override
    public boolean isNinja() {
        return ninja.isNinja();
    }
}

