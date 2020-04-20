
public class Gugu {
	public static void main(String[] args) {
		int gugu = 2; 
		for(int i =0 ; i <4 ; i++) {
			for(int j = 1; j <=gugu; j++) {
				System.out.println(gugu +"X"+j+"="+(gugu*j));
			}
			gugu = gugu +2;
		}
	}
}
