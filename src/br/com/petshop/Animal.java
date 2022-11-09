package br.com.petshop;

import java.time.LocalDate;
import java.time.LocalTime;

public class Animal {
    public String especie;
    public String nomeDoAnimal;
    public String nomeDoDono;
    public LocalDate data;
    public LocalTime hora;


    public Animal(
            String especie,
            String nomeDoAnimal,
            String nomeDoDono,
            LocalDate data,
            LocalTime hora
    ){
        this.especie = especie;
        this.nomeDoAnimal = nomeDoAnimal;
        this.nomeDoDono = nomeDoDono;
        this.data = data;
        this.hora = hora;
    }
    //o @ chama anotacao, override significa sobrescrever o endereço de memoria
    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", nomeDoAnimal='" + nomeDoAnimal + '\'' +
                ", nomeDoDono='" + nomeDoDono + '\'' +
                ", data=" + data +
                ", hora=" + hora +
                '}';
    }
}
