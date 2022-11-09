package br.com.petshop;

import java.time.LocalDate;
import java.time.LocalTime;

public class PetShop {
    public static void main(String[] args) {

        Animal cao = new Animal(
                "vira-lata",
                "Shelby",
                "Marcio",
                LocalDate.now(),
                LocalTime.now());

        Animal gato = new Animal(
                "siamês",
                "Nica",
                "Florice",
                LocalDate.now(),
                LocalTime.now());


        System.out.println(cao);
        System.out.println(gato);

        Agendamento agendamento = new Agendamento(
                "Tuca",
                LocalDate.now(),
                LocalTime.now());

        System.out.println(agendamento);
    }
}
