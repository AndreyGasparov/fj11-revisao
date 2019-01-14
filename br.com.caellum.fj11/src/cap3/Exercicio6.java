package cap3;

class Exercicio6 {
	public static void main(String[] args) {
		int fibAnt = 1;
		int fibCurr = 1;
		int temp;
		for (int i = 1; i <= 100; i++) {
			if (fibCurr > 100)
				break;
			System.out.println(fibCurr);
			temp = fibCurr;
			fibCurr = fibCurr + fibAnt;
			fibAnt = temp;
		}

	}
}