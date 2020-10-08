package exerciciosLoop;

public class Ex3Aula3 {
	public static void main(String[] args) {
		int num;
		int y;
		for (num=1;num<=10;num++) {
			System.out.println();
			System.out.println("Tabuada do "+num);
				for ( y = 1;y<=10;y++) {
					System.out.println(num+" vezes "+y+" = "+(num*y));
			}
		}	
	}
}
