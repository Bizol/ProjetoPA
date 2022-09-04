


package PA;

public class CandidatoPesquisa {
	
	private int idcandidato;
	private Candidato candidato;
	private Pesquisa pesquisa;
	private int votos;
	
	public int getIdcandidato() {
		return idcandidato;
	}
	public void setIdcandidato(int idcandidato) {
		this.idcandidato = idcandidato;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	public Pesquisa getPesquisa() {
		return pesquisa;
	}
	public void setPesquisa(Pesquisa pesquisa) {
		this.pesquisa = pesquisa;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
}
