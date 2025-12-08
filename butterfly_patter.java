package pattern_program_java;

public class butterfly_patter {

	public static void main(String[] args) {
		int n=1;
		//first line
		for(int i=7;i>=n;i--) {
			if(i==1||i==7) {
				System.out.print(" *  ");
			}else {
				System.out.print("    ");
			}
		}System.out.println();
		
		//second line
		for(int i=7;i>=n;i--) {
			if(i==2||i==6) {
				System.out.print(" *  ");
			}else {
				System.out.print("    ");
			}
		}System.out.println();
		
		//third line
		for(int i=7;i>=n;i--) {
			if(i==1||i==3||i==5||i==7) {
				System.out.print(" *  ");
			}else {
				System.out.print("    ");
			}
		}System.out.println();
		
		//line four
		for(int i=7;i>=n;i--) {
			if(i==2||i==4||i==6) {
				System.out.print(" *  ");
			}else {
				System.out.print("    ");
			}
		}System.out.println();
		
		//line five
		for(int i=7;i>=n;i--) {
			if(i==1||i==3||i==5||i==7) {
				System.out.print(" *  ");
			}else {
				System.out.print("    ");
			}
		}System.out.println();
		
		//line six
		for(int i=7;i>=n;i--) {
			if(i==2||i==6) {
				System.out.print(" *  ");
			}else {
				System.out.print("    ");
			}
		}System.out.println();
		
		//line seven
		for(int i=7;i>=n;i--) {
			if(i==1||i==7) {
				System.out.print(" *  ");
			}else {
				System.out.print("    ");
			}
		}System.out.println();
		
		

	}

}
