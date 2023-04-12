package controller;
import model.cliente;
import br.edu.fateczl.filaobj.Fila;

public class OperacaoController {

	public static void caixa (Fila f) {
		
		while (!f.isEmpty()) {
			
			cliente ac = new cliente();
			
			try {
				ac = (cliente)f.remove();
				double valorFinal = ac.QuantidadePecas*ac.ValorPecas;
				System.out.println("Nome: "+ ac.Nome + " Valor da compra: " + valorFinal);
			}catch (Exception e ) {
				e.printStackTrace();
			}
			
			
		}
	}

}
