package dao;

import java.util.List;

import PA.Candidato;
import PA.Pesquisa;

public class PesquisaDao {
	
	private static PesquisaDao instance;
	private List<Pesquisa> listaPesquisa = ArrayList<>();

	
    public static PesquisaDao getInstance(); {
    	if(instance == null) {
    		instance = new PesquisaDao();
	}
    return instance;
		
	}
	public void salvar(Pesquisa pesquisa) {
		listaPesquisa.add(pesquisa);
		
	}
	public void atualizar(Pesquisa pesquisa) {
		listaPesquisa.set(pesquisa.getId(), pesquisa);
		
	}
	public void excluir(int Instituto) {
		listaPesquisa.remove(Instituto);
	
	}
	public List<Pesquisa> listar(){
		return listaPesquisa;
	}
}
