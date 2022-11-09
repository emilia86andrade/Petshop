package br.com;

public class Cachorro {

    private int id;
    private String nome;
    private String raca;
    private Integer idade;

    private Dono dono;

    private boolean estaDoente;


    public Cachorro(String nome, String raca, Integer idade, Dono dono, boolean estaDoente) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.dono = dono;
        this.estaDoente = estaDoente;
    }

    public Cachorro(Dono dono){
        this.dono = dono;
    }

    public boolean isEstaDoente() {
        return estaDoente;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "\nCachorro: " +
                " id = " + id +
                ", nome = " + nome +
                ", raca = " + raca +
                ", idade = " + idade +
                ", estaDoente = " + estaDoente +
                ", \ndono = " + dono +
                "\n----------------------------------";
    }
}

