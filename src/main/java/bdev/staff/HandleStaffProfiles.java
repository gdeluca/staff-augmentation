package bdev.staff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HandleStaffProfiles {

	List<UserProfile> userPrifleList = new ArrayList<UserProfile>();
	
	// keep the matching references in lowercase 
	String[] roleWordsFilterStrings = {
			"human resource", 
			"rrhh", 
			"staff", 
			"work force", 
			"personeel",
			"recursos humanos"
			};   
	// keep the matching references in lowercase 
	String[] countryFilterStrings = {"argentina"};
	
	public HandleStaffProfiles() {
		List<UserProfile> loadedProfiles = getFilteredProfiles();
		System.out.println();
		System.out.println("recommended linkedin profiles based on search criteria");
		for (UserProfile userProfile : loadedProfiles) {
			System.out.println(userProfile.toString());
		}
	}
	
	public static boolean containsAny(String[] matchStrings, String role) {
	      return Arrays.stream(matchStrings).anyMatch(val -> role.contains(val));
	}

	private List<UserProfile> getFilteredProfiles() {
		List<UserProfile> loadedProfiles = new ParseStaffFile().scanFile();
		
		userPrifleList = loadedProfiles.stream()
			.filter(profile -> 
				(containsAny(roleWordsFilterStrings, profile.getTitle().toLowerCase().trim())
				|| containsAny(roleWordsFilterStrings, profile.getCurrentRole().toLowerCase().trim()))
				&& containsAny(countryFilterStrings, profile.getCountry().toLowerCase().trim())
				
				// add more filtering criteria here
			
		).collect(Collectors.toList());
		
		return userPrifleList;
	}


	public static void main(String[] args) {
		new HandleStaffProfiles();
	}
}
