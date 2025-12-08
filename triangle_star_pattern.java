package pattern_program_java;

public class triangle_star_pattern {

	public static void main(String[] args) {
		int n=9;
		
		
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=n;col++) {
				if(row==1 && col==5) {
					System.out.print("*");
				}else if(row==2 && (col==4 || col==6)) {
					System.out.print("*");
				}else if(row==3 && (col==3 || col==5||col==7)) {
					System.out.print("*");
				}else if(row==4 && (col==2||col==4||col==6||col==8)) {
					System.out.print("*");
				}else if(row==5 && (col==1||col==3||col==5||col==7||col==9)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}

	}

}
