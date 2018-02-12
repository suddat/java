public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
/*		Scanner sc = new Scanner(System.in);
		System.out.println("Test Data:");
		System.out.println("Input first number");
		int first = sc.nextInt();
		System.out.println("Input Second number");
		int second = sc.nextInt();
		System.out.println(first+" X "+second+" = "+first * second);
		System.out.println(first+" - "+second+" = "+(first - second));
		System.out.println(first+" + "+second+" = "+(first + second));
		System.out.println(first+" / "+second+" = "+first / second);
		System.out.println(first+" % "+second+" = "+first % second);*/
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Test Data:");
		System.out.println("Input number for table");
		int first = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(first+" X "+i+" = "+first * i);
		}*/
		Circle A = new Circle(2, "green");
		System.out.println(A);
		Circle A1 = new Circle(5, "Violet");
		System.out.println(A1);
		A.setRadius(6.0);
		System.out.println(A);
		//System.out.println(A.toString());
	}
}
