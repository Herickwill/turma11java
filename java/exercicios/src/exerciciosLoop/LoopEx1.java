package exerciciosLoop;

public class LoopEx1 {
	public static void main(String[] args) {
		
		for (int num=1000;num<=1999;num++) {
			if ((num%11) == 5) {
				System.out.println(num);
			}
		}
	}
}
