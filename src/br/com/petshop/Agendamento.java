package br.com.petshop;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {
    public String nomeAnimal;
    public LocalDate data;
    public LocalTime hora;

    public Agendamento(
            String nomeAnimal,
            LocalDate data,
            LocalTime hora
    ){
        this.nomeAnimal = nomeAnimal;
        this.data = data;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Agendamento" +
                "\nNome do Animal = " + nomeAnimal +
                "\nData = " + data +
                "\nHora = " + hora;
    }
}
