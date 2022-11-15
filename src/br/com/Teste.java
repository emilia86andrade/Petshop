package br.com;

public class Teste {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Av Brasil","487","19013-470","Vila Industrial","SP");
        Dono dono1 = new Dono("Emilia", endereco1);
        dono1.setCpf("123.456.789.-58");
        dono1.setEmail("emilia86andade@gmail.com");
        Cachorro cachorro1 = new Cachorro("Shelby","vira-lata", 5, dono1, false);


        Endereco endereco2 = new Endereco("Antonio Bongiovani", "1060", "19050-250", "Bongiovani", "SP");
        Dono dono2 = new Dono("Marcio", endereco2);
        Cachorro cachorro2 = new Cachorro(dono2);
        cachorro2.setNome("Brutus");
        cachorro2.setRaca("Pastor Alemão");
        cachorro2.setIdade(12);
        cachorro2.setEstaDoente(false);

        Endereco endereco3 = new Endereco("Av Dahma", "100", "19061-030", "Dahma", "SP");
        Dono dono3 = new Dono("Helio",endereco3);
        Cachorro cachorro3 = new Cachorro(dono3);
        cachorro3.setNome("Amora");
        cachorro3.setRaca("Vira-lata");
        cachorro3.setIdade(4);
        cachorro3.setEstaDoente(false);


       //imprimindo da ClasseRepositry
        CachorroRepository cachorroRepository = new CachorroRepository();
        cachorroRepository.cadastra(cachorro1);
        cachorroRepository.cadastra(cachorro2);
        cachorroRepository.cadastra(cachorro3);
        cachorroRepository.imprimeCachorrosCadastrados();
    }

}

