
public class NumberofNlessK {
	//https://www.interviewbit.com/problems/numbers-of-length-n-and-value-less-than-k/
	public int solve(int[] A, int B, int C) {
		char[] maxVal=(""+C).toCharArray();
		if(maxVal.length<B) return 0;
		if(maxVal.length>B) {
			int nonZero=0;
			for(int i=0;i<A.length;i++) {
				if(A[i]!=0) {
					nonZero++;
				}
			}
			return (int)Math.pow(A.length, B-1) * nonZero;
		}
		int [] countLessThanNotEqZero= new int [10];
		for(int i=0;i<A.length;i++) {
			for(int j=A[i];j<countLessThanNotEqZero.length && j!=0;j++) {
					countLessThanNotEqZero[j]++;
			}
		}

		int [] countLessThanEqZero= new int [10];
		for(int i=0;i<A.length;i++) {
			for(int j=A[i];j<countLessThanEqZero.length ;j++) {
				countLessThanEqZero[j]++;
			}
		}


		int sum=0;
		for(int i=0;i<B;i++) {
			int num=Character.getNumericValue(maxVal[i]);
			if(B==1 && num==0) {
				sum=sum+1;
			}

			if (num!=0 && i==0) {
				sum=sum+(countLessThanNotEqZero[num-1] * (int) Math.pow(A.length, B-1-i)) ;
			}
			if(num!=0 && i==0 && i==B-1) {
				sum=sum+(countLessThanEqZero[num-1] * (int) Math.pow(A.length, B-1-i)) ;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int ans= new NumberofNlessK().solve(new int[] {  0, 1, 2, 5}, 2,21);
		System.out.println(ans);
	}

}
