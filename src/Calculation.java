public class Calculation{
	double inp;
	double result;
	String opr="+";
	boolean newcalc = true;

	public void calculate(Double inp, String opr) {
		if(this.opr.equals("=") ) {			
			setRes(inp);
			setOpr(opr);
		}
		else {		
			switch(this.opr) {
			case "+": result += inp; break;
			case "-": result -= inp; break;
			case "*": result *= inp; break;
			case "/": result /= inp; break;
			}

			this.opr=opr;
		}

	}

	public void setOpr(String opr) {
		this.opr=opr;
	}
	public Double getRes() {
		return result;
	}
	public void setRes(Double result) {
		this.result = result;
	}
	public boolean isNewCalc() {
		return newcalc;
	}
	public void setNewCalc(boolean newcalc) {
		this.newcalc = newcalc;
	}


}
