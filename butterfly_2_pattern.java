package pattern_program_java;

public class butterfly_2_pattern {

	public static void main(String[] args) {
		int n=1;
		//first line
		for(int i=7;i>=n;i--) {
			String result=(i==1||i==7)?" *  ":"    ";
			System.out.print(result);
		}System.out.println();
		
		//second line
		for(int i=7;i>=n;i--) {
			String result=(i==2||i==6)?" *  ":"    ";
			System.out.print(result);
		}System.out.println();
		
		//third line
		for(int i=7;i>=n;i--) {
			String result=(i==1||i==3||i==5||i==7)?" *  ":"    ";
			System.out.print(result);
		}System.out.println();
		
		//line four
		for(int i=7;i>=n;i--) {
			String result=(i==2||i==4||i==6)?" *  ":"    ";
			System.out.print(result);
		}System.out.println();
		
		//line five
		for(int i=7;i>=n;i--) {
			String result=(i==1||i==3||i==5||i==7)?" *  ":"    ";
			System.out.print(result);
		}System.out.println();
		
		//line six
		for(int i=7;i>=n;i--) {
			String result=(i==2||i==6)?" *  ":"    ";
			System.out.print(result);
		}System.out.println();
		
		//line seven
		for(int i=7;i>=n;i--) {
			String result=(i==1||i==7)?" *  ":"    ";
			System.out.print(result);
		}System.out.println();
		
		

	}

}
