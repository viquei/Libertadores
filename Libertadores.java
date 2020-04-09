package Futebol;

import java.util.Scanner;

public class Libertadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();
		Time t2 = new Time();
		
		Partida p1 = new Partida();
		Partida p2 = new Partida();
		Partida p3 = new Partida();
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Digite o nome do Time Local.");
		String time1 = input1.next();		
		t1.setNome(time1);
		t1.setVitorias(0);
		t1.setDerrotas(0);
		t1.setEmpates(0);
		t1.setPontos(0);
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Digite o nome do Time Visitante.");
		String time2 = input2.next();
		t2.setNome(time2);
		t2.setVitorias(0);
		t2.setDerrotas(0);
		t2.setEmpates(0);
		t2.setPontos(0);
		
		p1.setLocal(t1);
		p1.setVisitante(t2);
		
		p2.setLocal(t1);
		p2.setVisitante(t2);
		
		p3.setLocal(t1);
		p3.setVisitante(t2);
		
		System.out.println("Iniciando partida 1");
		
		p1.iniciarPartida();
		p1.mostrarResultado();
		p1.finalizarPartida();
		
		System.out.println("Iniciando partida 2");
		
		p2.iniciarPartida();
		p2.mostrarResultado();
		p2.finalizarPartida();
		
		System.out.println("Iniciando partida 3");
		
		p3.iniciarPartida();
		p3.mostrarResultado();
		p3.finalizarPartida();
		
		System.out.println("Resultado final");
		System.out.println("----------------------------");
		
		t1.listar();
		t2.listar();
		
		System.out.println("Integrante do grupo: Vitória Queiroz");
		System.out.println("----------------------------");
		
	}

}
