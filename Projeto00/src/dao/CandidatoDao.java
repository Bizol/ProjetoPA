


package dao;

import java.util.ArrayList;
import java.util.List;
import PA.Candidato;

public class CandidatoDao {
	
	private static CandidatoDao instance;
	private List<Candidato> listarCandidatos = new ArrayList<>();
	
	public static CandidatoDao getInstance() {
		if(instance == null) {
			instance = new CandidatoDao();
		}return instance;
	}
	public void salvar(Candidato candidato) {
		listarCandidatos.add(candidato);
	}
	public void atualizar(Candidato candidato) {
		listarCandidatos.set(candidato.getIdCandidato(), candidato);
	}
	public void excluir(int idCandidato) {
		listarCandidatos.remove(idCandidato);
	}
	public List<Candidato> listar(){
		return listarCandidatos;
	}
}
