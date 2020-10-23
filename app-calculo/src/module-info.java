
module app.calculo {
	requires transitive app.logging;
	exports br.com.filana.classifier.calculo;
	
	/*exports br.com.filana.classifier.calculo.interno
	to app.financeiro;*/
	
	opens br.com.filana.classifier.calculo to app.logging, app.financeiro;
	
	requires app.api;
	
	provides br.com.filana.app.Calculadora 
		with br.com.filana.classifier.calculo.CalculadoraImpl;
}