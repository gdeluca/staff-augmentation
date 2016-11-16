package bdev.staff;

public class UserProfile {

	public UserProfile() {
	}

	public UserProfile(String publicProfileURL, String name, String lastName, String title, String geographicArea,
			String numberOfRecommendations, String numberOfConnections, String currentRole, String industry,
			String country) {
		super();
		this.publicProfileURL = publicProfileURL;
		this.name = name;
		this.lastName = lastName;
		this.title = title;
		this.geographicArea = geographicArea;
		this.numberOfRecommendations = numberOfRecommendations;
		this.numberOfConnections = numberOfConnections;
		this.currentRole = currentRole;
		this.industry = industry;
		this.country = country;
	}


	private String publicProfileURL;
	private String name;
	private String lastName;
	private String title;
	private String geographicArea;
	private String numberOfRecommendations;
	private String numberOfConnections;
	private String currentRole;
	private String industry;
	private String country;

	public String getPublicProfileURL() {
		return publicProfileURL;
	}

	public void setPublicProfileURL(String publicProfileURL) {
		this.publicProfileURL = publicProfileURL;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGeographicArea() {
		return geographicArea;
	}

	public void setGeographicArea(String geographicArea) {
		this.geographicArea = geographicArea;
	}

	public String getNumberOfRecommendations() {
		return numberOfRecommendations;
	}

	public void setNumberOfRecommendations(String numberOfRecommendations) {
		this.numberOfRecommendations = numberOfRecommendations;
	}

	public String getNumberOfConnections() {
		return numberOfConnections;
	}

	public void setNumberOfConnections(String numberOfConnections) {
		this.numberOfConnections = numberOfConnections;
	}

	public String getCurrentRole() {
		return currentRole;
	}

	public void setCurrentRole(String currentRole) {
		this.currentRole = currentRole;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
