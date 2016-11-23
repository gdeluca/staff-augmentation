package bdev.staff;

import java.util.List;

import bdev.staff.reader.ProfileReader;

public abstract class Processor {

	private List<UserProfile> filteredProfiles;
	private ProfileReader profileReader;
	
	public Processor(ProfileReader profileReader) {
		this.profileReader = profileReader;
	}

	public void execute() {
		List<UserProfile> profiles = profileReader.read();
		filteredProfiles = filter(profiles);
		show();
	}

	public void show() {
		System.out.println();
		System.out.println("recommended linkedin profiles based on search criteria");
		filteredProfiles.forEach(p -> System.out.println(p.toString()));
	}

	abstract List<UserProfile> filter(List<UserProfile> profiles);

	public List<UserProfile> getFilteredProfiles() {
		return filteredProfiles;
	}

	public void setFilteredProfiles(List<UserProfile> filteredProfiles) {
		this.filteredProfiles = filteredProfiles;
	}

}
