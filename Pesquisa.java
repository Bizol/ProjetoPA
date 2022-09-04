


package PA;

public class Pesquisa {
	
	private int id;
	private String instituto;
	private String data;
	private String local;
	private int mediaIdade;
	private TipoPesquisa tipo;
	private TipoPesquisa formato;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstituto() {
		return instituto;
	}
	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int getMediaIdade() {
		return mediaIdade;
	}
	public void setMediaIdade(int mediaIdade) {
		this.mediaIdade = mediaIdade;
	}
	public TipoPesquisa getTipo() {
		return tipo;
	}
	public void setTipo(TipoPesquisa tipo) {
		this.tipo = tipo;
	}
	public TipoPesquisa getFormato() {
		return formato;
	}
	public void setFormato(TipoPesquisa formato) {
		this.formato = formato;
	}
}
