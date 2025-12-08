package pattern_program_java;

public class number_triangle2 {

	public static void main(String[] args) {
		int n=7;
		
		
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=n;col++) {
				if(row==1 && col==4) {
					System.out.print("1");
				}else if(row==2 && (col==3 || col==5)) {
					System.out.print("2");
				}else if(row==3 && (col==2 || col==4||col==6)) {
					System.out.print("3");
				}else if(row==4 && (col==1||col==3||col==5||col==7)) {
					System.out.print("4");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}

	}

}
