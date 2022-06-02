
public class Main {

	public static void main(String[] args) {
		
		int[] A = new int[] {2,1,2,3,3,9,9};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		for(int i=0;i<A.length;i++) {
			for(int j=i+1;j<A.length;j++) {
				if(A[i]==A[j]) {
					A[i]=0;
					A[j]=0;
				}
			}
		}
			for(int j=0;j<A.length;j++) {
				if(A[j]!=0) {
					return A[j];
			}
				
		}
			return 0;
	}
}
