


package PA;

public class Principal {
	
	public static void main(String[] args) {
		
		Candidato nome = new Candidato();
		nome.setNome("Jair");
		Candidato partido = new Candidato();
		partido.setPartido("PL");
		
		System.out.println(nome.getNome());
		System.out.println(partido.getPartido());
		
		Pesquisa local = new Pesquisa();
		local.setLocal("Brasilia");
		
		TipoPesquisa tipo = new TipoPesquisa();
		tipo.setTipo("De campo");
		
		System.out.println(local.getLocal());
		System.out.println(tipo.getTipo());
		
		CandidatoPesquisa votos = new CandidatoPesquisa();
		votos.setVotos(10000);
		
		System.out.println(votos.getVotos());	
	}
}
