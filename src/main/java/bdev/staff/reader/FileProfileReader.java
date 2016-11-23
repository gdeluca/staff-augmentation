package bdev.staff.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import bdev.staff.UserProfile;

@Component
@Qualifier("fileProfile")
@Profile("default")
public class FileProfileReader implements ProfileReader {

	@Override
	public List<UserProfile> read() {
		List<UserProfile> list = new ArrayList<UserProfile>();
		Scanner scanner = null;
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource("torate.txt").getFile());
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				list.add(parseUserProfile(line));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		return list;

	}

	private UserProfile parseUserProfile(String line) {
		String[] values = line.split("\\|");
		if (values.length != 10) {
			System.out.print("ignoring invalid format on soruce file for profile " + values[0]);
			System.out.println("-- Current size " + values.length + " exceded the expected 10");
		}
		return new UserProfile(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7],
				values[8], values[9]);
	}

	
}
