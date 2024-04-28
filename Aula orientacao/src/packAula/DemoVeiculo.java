package packAula;

import java.util.Scanner;

// Clase que instancia e utiliza objetos da classe veiculo
public class DemoVeiculo {
    public static void main(String[] args) {
        // Criação dos objetos
        Veiculo evox = new Veiculo(5, 45, 10);
        Veiculo Z900 = new Veiculo(2, 16, 20);

        // Atribuição de valores para os atributos
        //evox.numPassageiros = 5;
        //evox.capTanque = 45;
        //evox.kmL = 10;
        //Z900.numPassageiros = 2;
        //Z900.capTanque = 16;
        //Z900.kmL = 20;

        // Utilização dos métodos
        int autonomiaEvox = evox.calAutonomia();
        int autonomiaZ900 = Z900.calAutonomia();

        System.out.println("O Lancer Evolution X carrega " + evox.getNumPassageiros() + " passageiros" +
                "e possui autonomia de " + autonomiaEvox + "Km/L");
        System.out.println("A Kawasaki Z900 carrega " + Z900.getNumPassageiros() + " passageiros" +
                "e possui autonomia de " + autonomiaZ900 + "Km/L");


    }
}
