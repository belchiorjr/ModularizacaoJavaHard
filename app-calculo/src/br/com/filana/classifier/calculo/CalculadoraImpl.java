package br.com.filana.classifier.calculo;

import br.com.filana.app.Calculadora;
import br.com.filana.app.logger.Logger;
import br.com.filana.classifier.calculo.interno.OperacoesAritmeticas;

public class CalculadoraImpl implements Calculadora {
	
	private String id = "abc";
	
	private OperacoesAritmeticas operacoesAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		
		Logger logger = new Logger();
		logger.info("Somando...");
		
		return this.operacoesAritmeticas.soma(nums);
	}
	
	public Class<Logger> getLoggerClass() {
		return Logger.class;		
	}

	public OperacoesAritmeticas getOperacoesAritmeticas() {
		return operacoesAritmeticas;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
}
