package Java.prueba;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AFD342", new Account("Liza Cerinza", "124324"));
        car.printDataCar();

        Car car1 = new Car("AFD342", new Account("Ligia Salazar", "1657564"));
        car1.printDataCar();

    }
}
