import java.util.Arrays;


public class Permuation {
	
	 public static int solution(int[]A) {
		 
		 int wynik=0;
		 Arrays.sort(A);
		 System.out.println(Arrays.toString(A));
	for(int i=0;i<=A.length;i++){

		if((A[i]+1)-(i+1)==1){
			if(i==A.length-1){
				wynik=1;
				break;
			}
			wynik=1;
		}
		if((A[i]+1)-(i+1)!=1){
			if(i==A.length-1){
				wynik=0;
				break;
				
			
			
		}
			wynik=0;
			break;
		
		}
	}
	  return wynik;
	  

		
	}

	public static void main(String[] args) {
		int [] A= {1,1,1,1};
		solution(A);
		
		
		

	}

}
