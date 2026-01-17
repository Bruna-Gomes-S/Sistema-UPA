package centro;

import java.sql.Date;

	public class Paciente {
	    private String cpf;
	    private String nome;
	    private Date dataNascimento;
	    private String nivelEscolaridade;
	    private String endereco;
	    private String cidadeZonaNorte;

	    public Paciente(String cpf, String nome, Date dataNascimento, String nivelEscolaridade, String endereco, String cidadeZonaNorte) {
	        this.cpf = cpf;
	        this.nome = nome;
	        this.dataNascimento = dataNascimento;
	        this.nivelEscolaridade = nivelEscolaridade;
	        this.endereco = endereco;
	        this.cidadeZonaNorte = cidadeZonaNorte;
	    }
	    public String getCpf() { return cpf; }
	    public String getNome() { return nome; }
	    public Date getDataNascimento() { return dataNascimento; }
	    public String getNivelEscolaridade() { return nivelEscolaridade; }
	    public String getEndereco() { return endereco; }
	    public String getCidadeZonaNorte() { return cidadeZonaNorte; }
	}


