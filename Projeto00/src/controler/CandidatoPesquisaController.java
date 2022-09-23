


package controler;

import PA.CandidatoPesquisa;
import dao.CandidatoPesquisaDao;

public class CandidatoPesquisaController {
	
	public void registrarCandidatoPesquisa(CandidatoPesquisa candidatoPesquisa) throws Exception{
		if(candidatoPesquisa.getCandidato() == null) {
			throw new Exception("Candidato invalido");
		}
		if(candidatoPesquisa.getPesquisa() == null) {
			throw new Exception("Pesquisa invalida");
		}
		CandidatoPesquisaDao.getInstance().registrarCandidatoPesquisa(candidatoPesquisa);
	}
		
}
