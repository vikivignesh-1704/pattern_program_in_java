package pattern_program_java;

public class zero_one_triangle {

	public static void main(String[] args) {
		int n=4;
		
		for(int i=0;i<=n;i++) {
			
			int start=(i%2==1)?1:0;
			
			for(int j=1;j<=i;j++) {
				System.out.print(start+" ");
				start=1-start;
				
			}System.out.println();
		}

	}

}
