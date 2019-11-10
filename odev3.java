package odev3;

public class Multiset {

	private static int[] siralama(int[] A) {

		int uzunluk = A.length;
		for (int i = 0; i < uzunluk - 1; i++) {
			for (int j = 0; j < uzunluk - i - 1; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;

				}

			}

		}
		return A;
	}

	public static int[] union(int[] A, int[] B) {
		int[] C = new int[A.length + B.length];
		int i = 0;
		int j = 0;

		while (i < A.length) {
			C[i] = A[i];
			i++;

		}
		while (j < B.length) {
			C[i] = B[j];
			System.out.println("cnin uzunlugu kanka   " + C.length);
			i++;

			j++;
		}

		C = siralama(C);
		return C;
	}

	public static int[] intersection(int[] A, int[] B) {

		// int [] C=new int[Math.min(A.length,B.length)];

		A = siralama(A);
		B = siralama(B);

		int i = 0, j = 0;
		int count = 0;
		int[] temp = new int[Math.min(A.length, B.length)];
		while (i < A.length && j < B.length)

		{
			if (A[i] < B[j])
				i++;
			else if (A[j] < B[i])
				j++;
			else if (A[i] > B[i]) {
				j++;
				i++;

			} else {

				// System.out.print(B[j]+" ");
				temp[count] = B[j];
				j++;

				count++;

				i++;
			}

		}
		int[] C = new int[count];
		for (int k = 0; k < count; k++) {

			C[k] = temp[k];
		}
		if (count == 0) {
			System.out.println("Ortak eleman yok");

		}
		return C;
	}

	public static int[] toSet(int[] A) {
		// int i = 0;
		int j = 0;
		int m = 0;
		int[] temp = new int[A.length];
		int count = 0;
		A = siralama(A);

		for (j = 0; j < A.length - 1; j++) {
			if (A[j] == A[j + 1]) {

				count++;

			}
			if (count >= 1 && count < 2) {
				temp[m] = A[j];
				// count=0;
				m++;
			}
			if (A[j] != A[j + 1]) {
				temp[m] = A[j + 1];
				m++;
			}

		}

		if (temp[0] == temp[1])
			m = m - 1;
		int[] C = new int[m];
		for (int k = 0; k < m; k++) {
			if (temp[0] == temp[1]) {
				C[k] = temp[k + 1];
			} else
				C[k] = temp[k];

		}

		return C;
	}

	public static void display(int[] A) {
		for (int k = 0; k < A.length; k++) {
			System.out.print(A[k] + " ");
		}

	}

	public static void subsetSum(int[] A, int K) {
		A=toSet(siralama(A));
		int i=0;
		int j=0;
		while (j<A.length) {
			if (A[i]+A[i+1]==K) {
				System.out.println(A[i]+" "+A[i+1]);
				
			}else if (A[i]+A[i+1]<K) {
				if (A[i]+A[i+1]+A[i+2]==K) {
					
					
					
				}
			}
			
			
		}
}
	
	public static void main(String[] args) {
		int[] A = { 6, 5, 4, 3, 2, 2, 1 };
		int[] B = { 15,14,15,12,2,2,1,1 };
		Multiset.display(Multiset.toSet(B));
		;
	}

}