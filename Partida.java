package Futebol;

import java.util.Random;
import java.util.Date;

public class Partida {
	private Time visitante;
	private Time local;
	private int scoreVisitante;
	private int scoreLocal;
	private Date dataPartida;
	
	public Time getVisitante() {
		return visitante;
	}
	public void setVisitante(Time visitante) {
		this.visitante = visitante;
	}
	public Time getLocal() {
		return local;
	}
	public void setLocal(Time local) {
		this.local = local;
	}
	public int getScoreVisitante() {
		return scoreVisitante;
	}
	public void setScoreVisitante(int scoreVisitante) {
		this.scoreVisitante = scoreVisitante;
	}
	public int getScoreLocal() {
		return scoreLocal;
	}
	public void setScoreLocal(int scoreLocal) {
		this.scoreLocal = scoreLocal;
	}
	public date getDataPartida() {
		return dataPartida;
	}
	
	public void setDataPartida(date dataPartida) {
		this.dataPartida = dataPartida;
	}
	
	Random random = new Random();
	
	public void iniciarPartida() {
		int sL = random.nextInt(10);
		int sV = random.nextInt(10);
		
		this.scoreLocal = sL;
		this.scoreVisitante = sV;
	}
	public void mostrarResultado() {
		System.out.println(
				local.getNome() +" "
				+getScoreLocal() 
				+" X "
				+getScoreVisitante() +" "
				+visitante.getNome());
		System.out.println("----------------------------");
	}
	public void finalizarPartida() {
		if (scoreLocal>scoreVisitante) {
			local.setVitorias(local.getVitorias() +1);
			local.setPontos(local.getPontos() +3);
			visitante.setDerrotas(visitante.getDerrotas() +1);
		}
		if (scoreVisitante>scoreLocal) {
			visitante.setVitorias(visitante.getVitorias() +1);
			visitante.setPontos(visitante.getPontos() +3);
			local.setDerrotas(local.getDerrotas() +1);
		}
		if(scoreVisitante==scoreLocal) {
			local.setEmpates(local.getEmpates() +1);
			visitante.setEmpates(visitante.getEmpates() +1);
			local.setPontos(local.getPontos() +1);
			visitante.setPontos(visitante.getPontos() +1);
		}
	}
}
