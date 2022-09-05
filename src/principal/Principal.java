package principal;

import controller.CandidatoController;
import PA.Candidato;

public class Principal {
	
	public static void main(String[] args) {
		
		Candidato c1 = new Candidato();
		c1.setIdCandidato(1);
		c1.setNome("lULA");
		c1.setPartido("PT");
		c1.setVotos(1000);
		
		Candidato c2 = new Candidato();
		c1.setIdCandidato(2);
		c1.setNome("Jair");
		c1.setPartido("PL");
		c1.setVotos(1000);
		
		controler.CandidatoController controller = new CandidatoController();
		try {
			controller.salvar(c1);
			controller.salvar(c2);
			
		} cath (Exeption e) {
			System.out.println(e.getMessage());
		}
		for (Candidato c : controller.listar()) {
			System.out.println(c.toString());
		}
		
		
		
	}

}
