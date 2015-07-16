package vjezbe;

import java.util.Arrays;

public class School {

	public static void main(String[] args) {
		String[][] matrix = new String[22][14];

		// Inputing names into the grand matrix
		TextIO.readFile("src/ba/BITCamp/ajla/s04d04/vjezbe/names.in");
		int z = 1;
		while (!TextIO.eof()) {
			matrix[z][0] = TextIO.getln();
			z++;
		}

		// Inputing courses into the grand matrix
		TextIO.readFile("src/ba/BITCamp/ajla/s04d04/vjezbe/courses.in");
		int y = 1;
		while (!TextIO.eof()) {
			matrix[0][y] = TextIO.getln();
			y++;
		}
		
		double sum = 0;
		double average = 0;
		
		
		// Inputing grades into the grand matrix
		TextIO.readFile("src/ba/BITCamp/ajla/s04d04/vjezbe/grades.in");
		for (int k = 1; k < matrix.length; k++) {
			boolean isFailed = true; 
			for (int l = 1; l <  matrix[k].length; l++) {
				if (l == 12) {
					average = sum / 11;
					matrix[k][12] = String.valueOf(average);
					break;
				}
				matrix[k][l] = String.valueOf(TextIO.getInt());
								
				if (matrix[k][l].equals("1")) {
					isFailed = false;
				} 
				
				matrix[k][13] = (!isFailed) ? "Ne" : "Da";
				
				sum += Double.parseDouble(matrix[k][l]);
			}
			sum = 0;
			
		}
		TextIO.readStandardInput();
		ArraysHelper.print2DArray(matrix);
		
		// --------------------------------------
		// Inputing grades into the array
		int[] grades = new int[11];
		for(int j = 0; j < grades.length; j++) {
			grades[j] = Integer.parseInt(matrix[1][j+1]);
		}
		System.out.println(Arrays.toString(grades));

		// Inputing courses into the array
		String[] courses = new String[11];
		for(int j = 0; j < courses.length; j++) {
			courses[j] = matrix[0][j+1];
		}
		System.out.println(Arrays.toString(courses));
		
		String[][] file = new String[17][2];

		// Collecting grades and courses into one matrix
		for(int i = 3; i < file.length - 3; i++) {
			file[0][0] = "Ucenik:";
			file[1][0] = "Prosao:";
			file[1][1] = matrix[1][13];
			file[2][0] = "";
			file[2][1] = "";
			file[0][1] = matrix[1][0];
			file[i][0] = String.valueOf("(" + grades[i-3] + ")");
			file[i][1] = courses[i-3];
			file[14][0] = "";
			file[14][1] = "";
			file[15][0] = "Prosjek:";
			file[16][0] = "Zakljucno:";
			file[15][1] = matrix[1][12];
			/*if (matrix[1][13].equals("Da")) {
				file[16][1] = String.valueOf(Integer.parseInt(matrix[1][12]));
			} else {
				file[16][1] = "1";
			}*/
			
			
		}
		

		
		TextIO.writeFile("src/ba/BITCamp/ajla/s04d04/vjezbe/student1.in");
		
		for (int i = 0; i < file.length; i++) {
			for (int j = 0; j < file[i].length; j++) {
				TextIO.put(" " + file[i][j]);
			}
			TextIO.putln();
		}
	}
}
