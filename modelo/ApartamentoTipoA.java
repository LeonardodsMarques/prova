package modelo;

public class ApartamentoTipoA extends Apartamento {
    public ApartamentoTipoA(int numero, int andar, double aluguel) {
        super(numero, andar, aluguel);
    }

    private double taxaExtra(){
        if (super.getAndar() > 1){
            return 50.51;
        }
        return 0.0;
    };

    @Override
    public double getValorTotal() {
        return super.getAluguel() + taxaExtra();
    }
}