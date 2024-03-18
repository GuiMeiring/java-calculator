
public enum Operation {
	ADDITION("+"),
	SUBTRACTION("-"),
	MULTIPLICATION("x"),
	DIVISION("/");
	
	private String symbol;

	Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
    
    public static Operation findBySymbol(String symbol) {
        for (Operation operation : Operation.values()) {
            if (operation.symbol.equals(symbol)) {
                return operation;
            }
        }
        throw new IllegalArgumentException("Nenhuma operação encontrado com o símbolo: " + symbol);
    }

}
