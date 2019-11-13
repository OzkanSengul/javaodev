package TOBB;

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
		int[] Z = new int[A.length];
		Z = toSet(siralama(A));
		int i = 0;
		int j = 0;
		int [] count=new int [20];
		int n;
		int sum = 0;
		int count2=0;
		
			
		for (int z = 0; z < 2; z++) {
			
			count2=0;
			if (z==1) {
				i=1;
				
				if (count[i] == K) {
					System.out.println(count[i]);
					
					count[count2]=count[i];
					count2++;
				}

				for (j = 0; j < count.length - 1; j++) {
					sum = count[i];

					sum = sum + count[j];

					if (sum == K) {
						
						count[count2]=count[i];
						count2++;
						count[count2]=count[j];
						count2++;
						System.out.println(count[i] + " " + count[j]);

					} else if (sum < K && count[i] != count[j] && count[i] != count[j + 1]) {
						n = j;
						j++;
						int temp = sum;

						for (int k = j; k < count.length - 1; k++) {
							sum = temp;

							sum = sum + count[k];

							if (sum == K && count[i] != count[k]) {
								
								String check = "";
								System.out.println(count[i] + " " + (sum - (count[i] + count[k])) + " " + count[k]);
								count[count2]=count[i];
								count2++;
								count[count2]=(sum - (count[i] + count[k]));
								count2++;
								count[count2]=count[k];
								count2++;
							}

						}
						j = n;
					}

				}
				j++;

			
				 
				
			}
		
			for (i = 0; i < Z.length-1; i++) {
				
				if (Z[i] == K) {
					System.out.println(Z[i]);
					
					count[count2]=Z[i];
					count2++;
				}

				for (j = 0; j < Z.length - 1; j++) {
					sum = Z[j];

					

					if (sum == K) {
						
						count[count2]=Z[i];
						count2++;
						count[count2]=Z[j];
						count2++;
						System.out.println(Z[i] + " " + Z[j]);

					} else if (sum < K ) {
						n = j;
						j++;
						int temp = sum;

						for (int k = j; k < Z.length - 1; k++) {
							sum = temp;

							sum = sum + Z[k];

							if (sum == K ) {
								
								String check = "";
								System.out.println(temp + " "  + Z[k]);
								count[count2]=temp;
								count2++;
								count[count2]=Z[k];
								count2++;
								count[count2]=Z[k];
								count2++;
								
							}

						}
						j = n;
					}

				}
				j++;
				
				}
			
			
			
		} 
		count=(toSet(count));
		
	
		for (int h = 0; h < count.length; h++) {
			System.out.print(count[h]);
			
		}
	}

	public static void main(String[] args) {
		int[] A = { 6, 5, 4, 3, 2, 2, 1 };
		int[] B = { 17, 15, 14, 15, 12, 2, 2, 1, 1 };
		Multiset.subsetSum(B, 17);

	}

}
