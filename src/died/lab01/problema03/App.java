package died.lab01.problema03;

import died.lab01.problema02.Escala;
import died.lab01.problema02.Temperatura;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Registro registro1 = new Registro("DENVER");
        Registro registro2 = new Registro("NAIROBI");

        Random generadorAleatorio = new Random();

        for (int i = 0; i < 10; i++) {
            registro1.agregar(new Temperatura(generadorAleatorio.nextDouble() * 50, Escala.CELCIUS));
        }

        for (int i = 0; i < 10; i++) {
            registro2.agregar(new Temperatura(generadorAleatorio.nextDouble() * 105, Escala.FAHRENHEIT));
        }

        registro1.imprimir();
        System.out.println("Promedio en " + registro1.getCiudad() + " :" + registro1.mediaAsCelcius() + " C°");
        System.out.println("Maximo en " + registro1.getCiudad() + ":" + registro1.getMaximaTemperatura().asCelcius() + " C°");

        registro2.imprimir();
        System.out.println("Promedio en " + registro2.getCiudad() + " :" + registro2.mediaAsFahrenheit() + " F°");
        System.out.println("Maximo en " + registro2.getCiudad() + ":" + registro2.getMaximaTemperatura().asFarenheit() + "F°");
    }
}

