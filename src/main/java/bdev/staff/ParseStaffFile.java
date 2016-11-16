package bdev.staff;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseStaffFile {

	private static String FILE = "torate.txt";
	public ParseStaffFile() {

	}

	public void scanFile() throws Exception{
      List<UserProfile> list = new ArrayList();
      Scanner scanner = null;
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource(FILE).getFile());
	        scanner = new Scanner(file);
	        while(scanner.hasNextLine()){
	            String line = scanner.nextLine();
	            list.add(parseUserProfile(line));
	        }     
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
	
	private UserProfile parseUserProfile(String line) throws Exception {
		String[] values = line.split("|");
		if (values.length != 10) {
			throw new Exception("invalid file format");
		}
		return new UserProfile(
				values[0],
				values[1],
				values[2],
				values[3],
				values[4],
				values[5],
				values[6],
				values[7],
				values[8],
				values[9]
		);
	}
}
