package controller;

public class ThreadMatriz extends Thread {
	private int v[] = new int[5];
	private int linha;
	
	public ThreadMatriz(int v[], int linha) {
		this.v = v;
		this.linha = linha;
	}

	@Override
	public void run() {
		calcSoma();
		super.run();
	}
	
	public void calcSoma() {
		int soma = 0;
		
		for(int c = 0; c < 5; c++) {
			soma += v[c];
		}
		
		System.out.println("Linha: " + linha + "| Soma: " + soma);
	}

}
