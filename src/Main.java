import petshop.Cachorro;
import petshop.Gato;
import petshop.Peixe;

public class Main {

    // PETSHOP

    public static void main(String[] args) {


//        instanciar -> criar o new...
//        petshop.Animal animal = new petshop.Animal(); Não podemos instanciar uma classe abstrata: se coloca abstract nao pode mais fazer isso, ou cria gato ou cria cachorro ou cria peixe
//        animal.setEspecie("Qualquer");
//        animal.setCor("Azul");

        Cachorro cachorro = new Cachorro();
        cachorro.setCor("Marrom");
        cachorro.setEspecie("Outras");
        cachorro.fazerBarulho();

        Gato gato = new Gato();
        gato.fazerBarulho();

        Peixe peixe = new Peixe();
        peixe.fazerBarulho();

    }
}
