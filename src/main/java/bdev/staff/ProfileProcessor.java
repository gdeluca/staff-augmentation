package bdev.staff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import bdev.staff.reader.ProfileReader;

@Component
public class ProfileProcessor extends Processor {
	
	public ProfileProcessor(ProfileReader profileReader) {
		super(profileReader);
	}
	
	// keep the matching references in lowercase
	private String[] roleWordsFilterStrings = { "human resource", "rrhh", "staff", "work force", "personeel",
			"recursos humanos" };
	// keep the matching references in lowercase
	private String[] countryFilterStrings = { "argentina" };
	
	@Override
	List<UserProfile> filter(List<UserProfile> profiles) {
		return profiles.stream()
				.filter(profile -> (containsAny(roleWordsFilterStrings, profile.getTitle().toLowerCase().trim())
						|| containsAny(roleWordsFilterStrings, profile.getCurrentRole().toLowerCase().trim()))
						&& doesNotContainsAny(countryFilterStrings, profile.getCountry().toLowerCase().trim())

				// add more filtering criteria here

				).collect(Collectors.toList());
	}

	private boolean containsAny(String[] matchStrings, String role) {
		return Arrays.stream(matchStrings).anyMatch(val -> role.contains(val));
	}

	private boolean doesNotContainsAny(String[] matchStrings, String role) {
		return Arrays.stream(matchStrings).noneMatch(val -> role.contains(val));
	}
	
}
