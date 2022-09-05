


package controler;

import PA.Candidato;
import dao.CandidatoDao;

import java.util.List;

public class CandidatoController {
	
	public void salvar(Candidato candidato) throws Exception {
		if(candidato.getNome() == null || candidato.getNome().length() < 3) {
			throw new Exception("Nome Invalido");
		}
		CandidatoDao.getInstance().salvar(candidato);
	}
	public void atualizar(Candidato candidato) throws Exception {
		if (candidato.getNome() == null || candidato.getNome().length() < 3) {
			throw new Exception("Nome inválido");
		}
		CandidatoDao.getInstance().atualizar(candidato);
	}
	
	public void excluir(int idCandidato) throws Exception {
		if (idCandidato == 0) {
			throw new Exception("Nenhum candidato selecionado");
		}
		CandidatoDao.getInstance().excluir(idCandidato);
	}
	
	public List<Candidato> listar(){
		return CandidatoDao.getInstance().listar();
	}
}
