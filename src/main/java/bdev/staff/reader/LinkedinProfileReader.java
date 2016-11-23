package bdev.staff.reader;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import bdev.staff.UserProfile;

@Component
@Qualifier("linkedinProfile")
@Profile("linkedin")
public class LinkedinProfileReader implements ProfileReader {

	@Override
	public List<UserProfile> read() {
		// TODO Auto-generated method stub
		return null;
	}

}
