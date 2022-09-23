


package dao;

import java.util.ArrayList;
import java.util.List;
import PA.CandidatoPesquisa;

public class CandidatoPesquisaDao {
	
	private static CandidatoPesquisaDao instance;
	private List<CandidatoPesquisa> listaCandidatoPesquisa = new ArrayList<>();
	
	public static CandidatoPesquisaDao getInstance() {
		if(instance == null) {
			instance = new CandidatoPesquisaDao();
		}return instance;
	}
	public void registrarCandidatoPesquisa(CandidatoPesquisa candidatoPesquisa) {
		listaCandidatoPesquisa.add(candidatoPesquisa);
	}

}
