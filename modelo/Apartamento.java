package modelo;

public class Apartamento {
    private int numero;
    private int andar;
    private double aluguel;
    private Predio predio;
    private Inquilino inquilino;

    public Apartamento(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    public Apartamento(int numero, int andar, double aluguel) {
        this.numero = numero;
        this.andar = andar;
        this.aluguel = aluguel;
    }

    public Apartamento(int numero, int andar, double aluguel, Predio predio, Inquilino inquilino) {
        this.numero = numero;
        this.andar = andar;
        this.aluguel = aluguel;
        this.setPredio(predio);
        this.setInquilino(inquilino);
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }

    public double getValorTotal() {
        return aluguel;
    }

    public int getNumero() {
        return numero;
    }

    public int getAndar() {
        return andar;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public Predio getPredio() {
        return predio;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
        inquilino.setApartamento(this);
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
        predio.addApartamento(this);
    }
}
