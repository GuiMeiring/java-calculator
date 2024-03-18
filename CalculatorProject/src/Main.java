import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(output());
		doCalculatorLoop();
	}
	
	public static void doCalculatorLoop() {
		do {
		    Calculator cal = input();
		    calculatorResult(cal);
		    System.out.println(cal.toString());
		    System.out.println();
		} while(true);
		
	}
	
	public static String output() {
		return "OPERAÇÕES BÁSICAS:"
				+ "\n [+] Adição"
				+ "\n [-] Subtração"
				+ "\n [x] Multiplicação"
				+ "\n [/] Divisão"
				+ "\n [exit] Fecha o programa"
				+ "\n OBS: Para decimais utiliza '.' ou inves de ','. \n Sempre use um espaço entre o valor e a operação. Ex: 1 x 1"
				+"\n";
	}
	
	public static Calculator input() {
		String line = sc.nextLine();

        String[] value = line.split(" ");
        
        if(line.equals("exit")) {
        	sc.close();
        	System.exit(0);
        }

        float num1 = Float.parseFloat(value[0]);
        String symbol = value[1];
        float num2 = Float.parseFloat(value[2]);
        
        Calculator cal = new Calculator(num1, num2, Operation.findBySymbol(symbol));
        return cal;
        	
	}
	
	public static void calculatorResult (Calculator cal) {
		switch(cal.getSymbol()) {
		    case ADDITION: {
			    cal.addition();
			    break;
		    }
		    case SUBTRACTION: {
			    cal.substraction();
			    break;
		    }
		    case MULTIPLICATION:{
			    cal.multiplication();
			    break;
		    }
		    case DIVISION: {
			    cal.division();
			    break;
		    }
		    
		}
		
	}

}
