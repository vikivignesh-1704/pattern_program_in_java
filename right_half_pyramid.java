package pattern_program_java;

public class right_half_pyramid {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=0;i<=n;i++) {
			
			for(int s=1;s<=i;s++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=n-i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
