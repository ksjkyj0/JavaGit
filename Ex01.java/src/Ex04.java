import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("����ġ �����ؾߵ� ������");

		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();
		switch (input) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("��û��");
			break;
		}
	}
}
