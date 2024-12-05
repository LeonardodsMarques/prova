package modelo;

public class ApartamentoTipoB extends Apartamento {
    public ApartamentoTipoB(int numero, int andar, double aluguel) {
        super(numero, andar, aluguel);
    }

    private double taxaExtra() {
        if (super.getAndar() % 2 == 0) {
            return super.getAndar() * 1.25;
        } else {
            return super.getAndar() * 1.10;
        }
    }    

    @Override
    public double getValorTotal() {
        return super.getAluguel() + taxaExtra();
    }
}
