package principal;

import PA.Candidato;
import controler.CandidatoController;

public class Principal {
	
	public static void main(String[] args) {
		
		Candidato c1 = new Candidato();
		c1.setIdCandidato(1);
		c1.setNome("lULA");
		c1.setPartido("PT");
		
		
		Candidato c2 = new Candidato();
		c1.setIdCandidato(2);
		c1.setNome("Jair");
		c1.setPartido("PL");
		
		
		CandidatoController controller = new CandidatoController();
		try {
			controller.salvar(c1);
			controller.salvar(c2);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for (Candidato c : controller.listar()) {
			System.out.println(c.toString());
		}
	
	}

}
