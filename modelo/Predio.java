package modelo;

import java.util.ArrayList;
import java.util.List;

public class Predio {
    private String nome;
    private List<Apartamento> apartamentos;

    public Predio(String nome) {
        this.nome = nome;
        this.apartamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void addApartamento(Apartamento apartamento) {
        apartamentos.add(apartamento);
    }
}
