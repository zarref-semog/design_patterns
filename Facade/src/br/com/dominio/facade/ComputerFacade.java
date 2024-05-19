package br.com.dominio.facade;

import br.com.dominio.computador.CPU;
import br.com.dominio.computador.HD;
import br.com.dominio.computador.Memoria;
import br.com.dominio.computador.SO;

public class ComputerFacade {
	
	private Memoria memoria;
	private CPU cpu;
	private HD hd;
	private SO so;
	
	public ComputerFacade() {
		this.memoria = new Memoria();
		this.cpu = new CPU();
		this.hd = new HD();
		this.so = new SO();
	}
	
	public void montarPC() {
		
		System.out.println("Montando Computador...");
		
		memoria.instalarMemoria();
		cpu.instalarCPU();
		hd.instalarHD();
		so.instalarSO();
		
		System.out.println("Computador Montado!");
		
	}

}
