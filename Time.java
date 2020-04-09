package Futebol;

public class Time {
	private String nome;
	private int vitorias;
	private int derrotas;
	private int empates;
	private int pontos;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public void listar() {
		System.out.println("Nome: " 					+getNome());
		System.out.println("Quantidade de Vitórias: "	+getVitorias());
		System.out.println("Quantidade de Derrotas: " 	+getDerrotas());		
		System.out.println("Quantidade de Empates: " 	+getEmpates());
		System.out.println("Quantidade de Pontos: " 	+getPontos());
		System.out.println("----------------------------");
	}
	
}
