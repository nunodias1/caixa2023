package pt.nunodias.caixa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTopOrBottom(4);
		System.out.println("*    *");
		System.out.println("*    *");
		System.out.println("*    *");
		printTopOrBottom(4);
		
	}

	public static void printTopOrBottom(int size) {
		for (int i = 0; i < size; i++) {
			System.out.print("*");
		}
			System.out.println();
	}
	
}
