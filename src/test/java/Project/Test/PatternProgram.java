package Project.Test;

import java.util.Iterator;

import org.testng.annotations.Test;

public class PatternProgram {

	int totalRows = 5;

	@Test(priority = 1)
	public void NumberProgram_1() {
		System.out.println("\nNumber program 1: ");
		int number = 1;

		for(int i = 1; i <= totalRows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}

	@Test(priority = 2)
	public void NumberProgram_2() {
		System.out.println("\nNumber program 2: ");
		int number = 1;

		for(int i = 1; i <= totalRows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}

	@Test(priority = 3)
	public void NumberProgram_3() {
		System.out.println("\nNumber program 3: ");
		int number = 1;

		for(int i = 1; i <= totalRows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(number + " ");
			}
			number++;
			System.out.println();
		}
	}

	@Test(priority = 4)
	public void NumberProgram_4() {
		System.out.println("\nNumber program 4: ");

		for(int i = 1; i <= totalRows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	@Test(priority = 5)
	public void NumberProgram_5() {
		System.out.println("\nNumber program 5: ");

		for(int i = totalRows; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	@Test(priority = 6)
	public void NumberProgram_6() {
		System.out.println("\nNumber program 6: ");

		for(int i = 1; i <= totalRows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i = totalRows; i >= 1; i--) {
			for(int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	@Test(priority = 7)
	public void NumberProgram_7() {
		System.out.println("\nNumber program 7: ");

		for(int i = totalRows; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i = 1; i <= totalRows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	@Test(priority = 8)
	public void NumberProgram_8() {
		System.out.println("\nNumber program 8: ");
		int number = totalRows;

		for(int i = totalRows; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(number + " ");
				number--;
			}
			number = totalRows;
			System.out.println();
		}
	}

	@Test(priority = 9)
	public void NumberProgram_9() {
		System.out.println("\nNumber program 9: ");
		int number = totalRows;

		for(int i = 1; i <= totalRows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number--;
			}
			number = totalRows;
			System.out.println();
		}
	}

	@Test(priority = 10)
	public void NumberProgram_10() {
		System.out.println("\nNumber program 10: ");
		int number = 1;

		for(int i = 1; i <= totalRows; i++) {
			for(int j = i; j < totalRows; j++) {
				System.out.print(" ");
			}

			for (int k = i; k >= 1; k--) {
				System.out.print(number + " ");
			}

			System.out.println();
		}
	}
	
	@Test(priority = 11)
	public void NumberProgram_11() {
		System.out.println("\nNumber program 11: ");
		int number = 1;

		for(int i = 1; i <= totalRows; i++) {
			for(int j = i; j < totalRows; j++) {
				System.out.print("  ");
			}

			for (int k = i; k >= 1; k--) {
				System.out.print(number + " ");
			}

			System.out.println();
		}
	}
	
	@Test(priority = 12)
	public void NumberProgram_12() {
		System.out.println("\nNumber program 12: ");
		int number = 1;

		for(int i = 1; i <= totalRows; i++) {
			for (int j = 1; j <= totalRows; j++) {
				System.out.print(number);
			}
			number++;
			System.out.println();
		}
	}
	
	@Test(priority = 13)
	public void NumberProgram_13() {
		System.out.println("\nNumber program 13: ");

		for(int i = 1; i <= totalRows; i++) {
			int number = i;
			for (int j = 1; j <= totalRows; j++) {
				System.out.print(number + " ");
				number ++;
				if(number > totalRows) {
					number = 1;
				}
			}
			System.out.println();
		}
	}
	
	@Test(priority = 14)
	public void NumberProgram_14() {
		System.out.println("\nNumber program 14: ");

		for(int i = totalRows; i >= 1; i--) {
			int number = i;
			for (int j = 1; j <= totalRows; j++) {
				System.out.print(number + " ");
				number--;
				if(number == 0) {
					number = 5;
				}
			}
			System.out.println();
		}
	}
	
	@Test(priority = 15)
	public void NumberProgram_15() {
		System.out.println("\nNumber program 15: ");
		
		for(int i = 1; i <= totalRows; i++) {
			int number = i;
			for (int j = 1; j <= totalRows; j++) {
				if(i == j) {
					System.out.print(j + " ");
				}else {
					number = 0;
					System.out.print(number + " ");
				}
			}
			System.out.println();
		}
	}
	
	@Test(priority = 16)
	public void NumberProgram_16() {
		System.out.println("\nNumber program 16: Floyd's Triangle");
		
		int number = 1;
		for (int i = 1; i <= totalRows; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}
	
	@Test(priority = 17)
	public void NumberProgram_17() {
		System.out.println("\nNumber program 17: ");

		for(int i = 1; i <= totalRows; i++) {
			for(int j = i; j < totalRows; j++) {
				System.out.print(" ");
			}

			int number = 1;
			for (int k = 1; k <= i; k++) {
				System.out.print(number + " ");
				number = number * (i-k)/(k);
			}
			System.out.println();
		}
	}
}






