


package PA;

public class CandidatoPesquisa {
	
	private int idCandidatoPesquisa;
	private Candidato Candidato;
	private Pesquisa Pesquisa;
	private int votos;
	
	public int getIdCandidatoPesquisa() {
		return idCandidatoPesquisa;
	}
	public void setIdCandidatoPesquisa(int idCandidatoPesquisa) {
		this.idCandidatoPesquisa = idCandidatoPesquisa;
	}
	public Candidato getCandidato() {
		return Candidato;
	}
	public void setCandidato(Candidato candidato) {
		Candidato = candidato;
	}
	public Pesquisa getPesquisa() {
		return Pesquisa;
	}
	public void setPesquisa(Pesquisa pesquisa) {
		Pesquisa = pesquisa;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	
}
