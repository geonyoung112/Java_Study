package com.test.ch11;

public enum Ex04Country {
	KOREA(82, 1.1f),
	USA(1, 1.2f),
	UK(44, 1.3f),
	ETC(0, 1.5f);

	private final int code; //고정된 값이 바뀌면 안되기 때문에 final로 생성
	private final float tax;  //고정된 값이 바뀌면 안되기 때문에 final로 생성
	
	Ex04Country(int code, float tax) {
		this.code = code; 
		this.tax = tax;
	}
	
	public float getRefundTax() {
		float refundTax = tax;
		
		if(code != 0) 
			refundTax = tax - 0.1f;
			
			return refundTax;
		}
		
		public float getTax() {
			return tax;
		}
}
