
public class Test {
	public static void main(String[] args) {
		int a =1;
		int total = 0;
		
		while(true) {
			total +=a;
			a = a+2;
			if(total > 1000)
				break;
		}
		System.out.println("total = " +total);
		System.out.println("a = "+a );
	}
}
