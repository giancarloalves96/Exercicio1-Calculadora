import java.lang.Math;

public class CalculatorEngine {
	private int value;
	private int keep;
	private char toDo;
	
	void binaryOperation(char op){
		keep = value;
		value = 0;
		toDo = op;
	}
	
	void unaryOperation(char op){
		keep = 0;
		toDo = op;
	}
	
	void add(){
		binaryOperation('+');
	}
	
	void subtract(){
		binaryOperation('-');
	}
	
	void multiply(){
		binaryOperation('*');
	}
	
	void divide(){
		binaryOperation('/');
	}
	
	void power(){
		binaryOperation('P');
	}
	
	void sroot(){
		unaryOperation('s');
	}
	
	void compute(){
		if(toDo=='+')
			value = keep+value;
		else if(toDo=='-')
			value = keep-value;
		else if(toDo=='*')
			value = keep*value;
		else if(toDo=='/')
			value = keep/value;
		else if(toDo=='P'){
			double i = 1.0;
			value = (int)Math.pow(i*keep, i*value);
		}
		else if(toDo=='s'){
			double i = 1.0;
			value = (int)Math.sqrt(i*value);
		}
		keep = 0;
	}
	
	void clear(){
		value=0;
		keep=0;
	}
	
	void digit(int x){
		value = value*10+x;
	}
	
	int display(){
		return(value);
	}
}
