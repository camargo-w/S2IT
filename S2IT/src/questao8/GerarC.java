package questao8;
public class GerarC {

	private static final long LIMITE = 1000000;

	/**
	 * Processa as entradas de A e B para gerar o resultado C
	 * 
	 * @param a
	 * @param b
	 */
	public static void run(String a, String b) {

		// verificando se as entradas s�o v�lidas
		if (isValidEntry(a) && isValidEntry(b)) {

			// gerando valor de C
			long c = generateNumberC(a, b);

			// processando sa�da de C
			c = (c > GerarC.LIMITE) ? c : -1;

			System.out.println("Entradas: [A]=" + a + ", [B]=" + b);
			System.out.println("Sa�da: [C]=" + c);
		}

	}

	/**
	 * Verifica se o n�mero informado � v�lido
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isValidEntry(String value) {

		boolean isValid = false;

		try {
			Long.valueOf(value);
			isValid = true;
		} catch (NumberFormatException e) {
			System.out.println("O n�mero: '" + value + "' informado n�o � v�lido. Verifique por favor.");
		}

		return isValid;
	}

	/**
	 * Gera o valor de C
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static long generateNumberC(String a, String b) {

		String c = "";

		// armazenando o tamanho do maior n�mero para itera��o
		int tamanho = Math.max(a.length(), b.length());

		// aplicando regras
		for (int i = 0; i <= tamanho; i++) {

			if (i < a.length()) {
				c += a.charAt(i);
			}

			if (i < b.length()) {
				c += b.charAt(i);
			}
		}

		return Long.valueOf(c);
	}

}
