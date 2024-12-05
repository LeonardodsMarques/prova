package modelo;

public class Inquilino {
    private String nome;
    private Apartamento apartamento;

    public Inquilino(String nome) {
        this.nome = nome;
    }

    public Inquilino(String nome, Apartamento apartamento){
        this.nome = nome;
        this.apartamento = apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }

    public String getNome() {
        return nome;
    }

    public Apartamento getApartamento() {
        return apartamento;
    }
}
