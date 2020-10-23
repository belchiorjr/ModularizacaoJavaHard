package br.com.filana.app.financeiro;

public class CalcImpl1 implements Calc{

	@Override
	public double some(double... nums) {

		double total = 0;
		
		for(int i = 0; i<nums.length; i++) {
			total+= nums[i];
		}
		
		return total;
	}
	
}
