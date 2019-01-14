package cap3;

class Exercicio5 {
	public static void main(String[] args) {
		long fact;
		for (long i = 1; i <= 40; i++) {
			fact = 1;
			for (long j = i; j >= 1; j--) {
				fact = fact * j;
			}
			System.out.println(fact);
		}

	}
}