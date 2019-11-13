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
			if( A.length/2<=count+m && A[m]==A[A.length-1]) {
			temp[count] = A[m];
			break;
			}
			j = m;
			for (int i = j+1; i < A.length; i++) {
				
				if (A[j] != A[i]) {
					m = i;
					temp[count] = A[m - 1];
					count++;
					break;
				}

			}
		}
		temp[count] = A[A.length - 1];
		int[] temp2 = new int[count + 1];
		for (int z = 0; z < count; z++) {
			temp2[z] = temp[z];

		}
		temp2[count] = temp[count];

		return temp2;
	}

	public static void display(int[] A) {
		for (int k = 0; k < A.length; k++) {
			System.out.print(A[k] + " ");
		}

	}

	public static void subsetSum(int[] Z, int K) {

		Z = toSet(Z);
		int i = 0;
		int j = 0;
		int[] count = new int[20];
		int n;
		int sum = 0;
		int count2 = 0;
		while (sum != K) {

			for (i = 0; i < Z.length; i++) {

				if (Z[i] == K) {
					System.out.println(Z[i]);

					count[count2] = Z[i];
					count2++;
				}

				for (j = 0; j < Z.length - 1; j++) {
					sum = Z[i];

					sum = sum + Z[j];

					if (sum == K) {

						count[count2] = Z[i];
						count2++;
						count[count2] = Z[j];
						count2++;
						System.out.println(Z[i] + " " + Z[j]);

					} else if (sum < K) {
						n = j;
						j++;
						int temp = sum;

						for (int k = j; k < Z.length - 1; k++) {
							sum = temp;

							sum = sum + Z[k];

							if (sum == K) {

								String check = "";
								System.out.println(Z[i] + " " + (sum - (Z[i] + Z[k])) + " " + Z[k]);
								count[count2] = Z[i];
								count2++;
								count[count2] = (sum - (Z[i] + Z[k]));
								count2++;
								count[count2] = Z[k];
								count2++;
							}

						}
						j = n;
					}

				}
				j++;

			}

			break;
		}
		count = (toSet(count));

	}

	public static void main(String[] args) {
		int[] A = { 6, 5, 4, 3, 2, 2, 1 };
		int[] B = {6,6,6,6,6, 5, 4,4,4, 3, 2, 2, 1};
		Multiset.display(toSet(B));

	}

}
