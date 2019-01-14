package cap3;

class Exercicio4 {
	public static void main(String[] args) {
		int fact;
		for (int i = 1; i <= 10; i++) {
			fact = 1;
			for (int j = i; j >= 1; j--) {
				fact = fact * j;
			}
			System.out.println(fact);
		}

	}
}