package telas;

import modelo.*;

public class Tela {
    public static void main(String[] args) {
        Predio predio = new Predio("Edifício Central");

        ApartamentoTipoA apartamentoA = new ApartamentoTipoA(101, 2, 1200);
        ApartamentoTipoB apartamentoB = new ApartamentoTipoB(201, 3, 1500);

        apartamentoA.setPredio(predio);
        apartamentoB.setPredio(predio);

        Inquilino inquilinoA = new Inquilino("João");
        Inquilino inquilinoB = new Inquilino("Maria");

        apartamentoA.setInquilino(inquilinoA);
        apartamentoB.setInquilino(inquilinoB);

        System.out.println("Prédio: " + predio.getNome());
        for (Apartamento apto : predio.getApartamentos()) {
            System.out.println("Apartamento Número: " + apto.getNumero());
            System.out.println("Andar: " + apto.getAndar());
            System.out.println("Inquilino: " + (apto.getInquilino() != null ? apto.getInquilino().getNome() : "Nenhum"));
            System.out.println("Valor Total: R$ " + apto.getValorTotal());
            System.out.println();
        }
    }
}
