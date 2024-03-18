
public class Calculator {
	
	private float num1, num2, result;
	
	private Operation symbol;

	public Calculator(float num1, float num2, Operation symbol) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.symbol = symbol;
	}
	
	public void addition() {
	   this.result = this.num1 + this.num2;
	}
	
	public void substraction() {
	   this.result = this.num1 - this.num2;
	}
	
	public void multiplication() {
		this.result = this.num1 * this.num2;
	}
	
	public void division() {
		this.result = this.num1 / num2;
	}
	

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}

	public Operation getSymbol() {
		return symbol;
	}

	public void setSymbol(Operation symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return ""+ num1 + " " + symbol.getSymbol()+ " " + num2 +" = "+ result;
	}	
	
}
