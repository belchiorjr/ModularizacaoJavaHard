package br.com.filana.app.financeiro;

import java.util.Arrays;

public class CalcImpl2 implements Calc {

	@Override
	public double some(double... nums) {
		return Arrays.stream(nums).reduce(0.0, (t, a) -> t+a);
	}

}
