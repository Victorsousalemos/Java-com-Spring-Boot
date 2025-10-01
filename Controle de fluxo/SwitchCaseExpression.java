public class SwitchCaseExpression {
	public static void main(String[] args) {
		
		int day = 3;

		switch (day) {    //insere a linha Switch e entre parenteses o que você quer testar, nesse caso é a variavel.


			//Case significa: caso o conteudo dessa o conteudo dessa variavel (day) for 1, execute a linha

		case 1 -> System.out.println("Segunda");

		case 2 -> System.out.println("Terca");

		case 3 -> System.out.println("Quarta");

		default -> System.out.println("Desconhecido");

		}

	
	}
}

// nesse caso o resultado é 3 pois o valor da variave é 3, se o valor não for 3 ou nenhuma que esta nas linhas, irá trazer desconhecido, conforme a linha default.