package br.com;

import java.util.Objects;

public class CachorroRepository {

    private int count = 0;

    private Cachorro[] cachorrosCadastrados = new Cachorro[10];

    private static int sequence = 1;

    public void cadastra(Cachorro cachorro) {
        setId(cachorro);

        if (Objects.nonNull(cachorro) && Objects.nonNull(cachorro.getDono())) {
            cachorrosCadastrados[count] = cachorro;
            count++;
        } else {
            System.out.println("Cachorro null ou sem Dono");
        }
    }

    private static void setId(Cachorro cachorro) {
        cachorro.setId(sequence);
        cachorro.getDono().setId(sequence);
        cachorro.getDono().getEndereco().setId(sequence);
        sequence ++;
    }

    public void imprimeCachorrosCadastrados(){
        System.out.println("-----------Dogs Cadastrados na Classe Cachorro Repository-----------");
        boolean existeCachorroCadastrado = false;
        for (Cachorro cachorro: cachorrosCadastrados){
            if (Objects.nonNull(cachorro)){
                existeCachorroCadastrado = true;
                System.out.println(cachorro);
            }
        }
    }
}






