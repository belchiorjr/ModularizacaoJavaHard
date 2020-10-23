package br.com.filana.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.filana.app.Calculadora;
//import br.com.filana.classifier.calculo.CalculadoraImpl;
//import br.com.filana.classifier.calculo.interno.OperacoesAritmeticas;

public class Teste {
	public static void main(String[] args) {
		
		Calculadora calc = ServiceLoader
							.load(Calculadora.class)
							.findFirst()
							.get();
		
		System.out.println(calc.soma(1,2,3,4));
		//System.out.println(calc.getLoggerClass());
		
		/*OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.err.println(op.soma(7,8,9,4,5,6,1,2,3));
		
		
		String n = CalculadoraImpl.class.getDeclaredFields()[0].getName();
		System.out.println(n);
		System.out.println(CalculadoraImpl.class.getName());*/

		try {
			Field fieldId = calc.getClass().getDeclaredFields()[0];
			fieldId.setAccessible(true);
			fieldId.set(calc, "def");
			fieldId.setAccessible(false);
			
			System.out.println(calc.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
