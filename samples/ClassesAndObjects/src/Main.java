import model.Car;
import model.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        Car fusca = new Car();
        Car monza = new Car();

        fusca.chassi = "123-ABC";
        fusca.modelo = "Fusca 2013";
        fusca.cor = "Azul";

        monza.chassi = "124-BCD";
        monza.modelo = "Monze 1993";
        monza.cor = "azul";

        fusca.ligar();

        System.out.println(fusca.modelo);
        System.out.println(fusca.cor);
        System.out.println(fusca.chassi);

        ContaBancaria c1 = new ContaBancaria();

        c1.depositar(200);
        c1.depositar(100);

        System.out.println(c1.saldo);
    }
}