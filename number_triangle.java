package pattern_program_java;

public class number_triangle {

	public static void main(String[] args) {
		int n=7;
		
		for(int i=1;i<=n;i++) {
			
			if(i==4) {
				System.out.print("1");
			}else {
				System.out.print(" ");
			}
		}System.out.println();
		
		for(int i=1;i<=n;i++) {
			if(i==3||i==5) {
				System.out.print("2");
			}else {
				System.out.print(" ");
			}
		}System.out.println();
		
		for(int i=1;i<=n;i++) {
			if(i==2||i==4||i==6) {
				System.out.print("3");
			}else {
				System.out.print(" ");
			}
		}System.out.println();
		
		for(int i=1;i<=n;i++) {
			if(i==1||i==3||i==5||i==7) {
				System.out.print("4");
			}else {
				System.out.print(" ");
			}
		}System.out.println();

	}

}
