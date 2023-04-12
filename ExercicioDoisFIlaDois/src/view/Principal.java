package view;
import controller.OperacaoController;
import br.edu.fateczl.filaobj.Fila;
import model.cliente;
public class Principal {

	public static void main(String[] args) {
		Fila f = new Fila();
		for (int i = 0; i <20; i++) {
			cliente c =  new cliente();
			c.Nome = "Cliente" + i;
			c.QuantidadePecas = (int)((Math.random()*31)+20);
			c.ValorPecas =  (float)((Math.random()*96)+5);
			f.insert(c);
		}
		
			OperacaoController.caixa(f);
		
	}

}
