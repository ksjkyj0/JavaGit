import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ��Է��ϼ���");
		int a = scan.nextInt();
		
		System.out.println("���ڸ��Է��ϼ���");
		int b = scan.nextInt();
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		if(a > b ) {
			System.out.println("a��Ů�ϴ�");
			
		}
		else if(a<b) {
			System.out.println("b�� Ů�ϴ�");
		}
		else {
			System.out.println("a�� b�� �����ϴ�");
		}
	}
}
