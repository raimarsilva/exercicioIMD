package templates;


public enum Orgao {
	TRIBUNAL_PLENO("Tribunal Pleno"),
	ORGAO_ESPECIAL("òrgão Especial"),
	SEDC("Seção Especializada em Dissídios Coletivos"),
	SIEDI ("Subeção I Especializada em Dissídios Individuais"),
	SIIEDI("Subeção II Especializada em Dissídios Individuais"),
	PRIMEIRA_TURMA("Primeira Turma"),
	SEGUNDA_TURMA("Segunda Turma"),
	TERCEIRA_TURMA("Terceira Turma"),
	QUARTA_TURMA("Quarta Turma"),
	QUINTA_TURMA("Quinta Turma"),
	SEXTA_TURMA("Sexta Turma"),
	SETIMA_TURMA("Sétia Turma"),
	OITAVA_TURMA("Oitava Turma");
	
	private String nome;
	
	Orgao(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
