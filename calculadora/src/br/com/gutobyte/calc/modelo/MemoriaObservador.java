package br.com.gutobyte.calc.modelo;


@FunctionalInterface
public interface MemoriaObservador {
	
	public void valorAlterado(String novoValor);

}
