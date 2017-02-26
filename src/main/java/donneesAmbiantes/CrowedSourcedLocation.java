package donneesAmbiantes;

public class CrowedSourcedLocation {

	public double latitude;
	public double longitude;
	public int CLASS_VERSION;
	public String id;

	public CrowedSourcedLocation() {

		this.latitude = 0.0;
		this.longitude = 0.0;
		this.CLASS_VERSION = 0;
		this.id = "";
	}

	public CrowedSourcedLocation(double latitude, double longitude, int CLASS_VERSION, String id) {

		this.latitude = latitude;
		this.longitude = longitude;
		this.CLASS_VERSION = CLASS_VERSION;
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getCLASS_VERSION() {
		return CLASS_VERSION;
	}

	public void setCLASS_VERSION(int cLASS_VERSION) {
		CLASS_VERSION = cLASS_VERSION;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CrowedSourcedLocation [latitude=" + latitude + ", longitude=" + longitude + ", CLASS_VERSION="
				+ CLASS_VERSION + ", id=" + id + "]";
	}

}
