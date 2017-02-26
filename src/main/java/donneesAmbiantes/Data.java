package donneesAmbiantes;

public class Data implements Comparable<Data> {

	public String client_timestamp;
	public int client_tz;
	public CrowedSourcedLocation crowdSourcedLocation;
	public CrowedSourcedValue crowdSourcedValue;
	public String deviceId;
	public String deviceMaker;
	public String deviceModel;
	public String deviceOS;
	public String timestamp;
	public int tz;
	public double uid;

	public Data() {

		this.client_timestamp = "";
		this.client_tz = 0;
		this.crowdSourcedLocation = new CrowedSourcedLocation();
		this.crowdSourcedValue = new CrowedSourcedValue();
		this.deviceId = "";
		this.deviceMaker = "";
		this.deviceModel = "";
		this.deviceOS = "";
		this.timestamp = "";
		this.tz = 0;
		this.uid = 0;
	}

	public Data(String client_timestamp, int client_tz, CrowedSourcedLocation crowdSourcedLocation,
			CrowedSourcedValue crowdSourcedValue, String deviceId, String deviceMaker, String deviceModel,
			String deviceOS, String timestamp, int tz, double uid) {

		this.client_timestamp = client_timestamp;
		this.client_tz = client_tz;
		this.crowdSourcedLocation = crowdSourcedLocation;
		this.crowdSourcedValue = crowdSourcedValue;
		this.deviceId = deviceId;
		this.deviceMaker = deviceMaker;
		this.deviceModel = deviceModel;
		this.deviceOS = deviceOS;
		this.timestamp = timestamp;
		this.tz = tz;
		this.uid = uid;
	}

	public String getClient_timestamp() {
		return client_timestamp;
	}

	public void setClient_timestamp(String client_timestamp) {
		this.client_timestamp = client_timestamp;
	}

	public int getClient_tz() {
		return client_tz;
	}

	public void setClient_tz(int client_tz) {
		this.client_tz = client_tz;
	}

	public CrowedSourcedLocation getCrowdSourcedLocation() {
		return crowdSourcedLocation;
	}

	public void setCrowdSourcedLocation(CrowedSourcedLocation crowdSourcedLocation) {
		this.crowdSourcedLocation = crowdSourcedLocation;
	}

	public CrowedSourcedValue getCrowdSourcedValue() {
		return crowdSourcedValue;
	}

	public void setCrowdSourcedValue(CrowedSourcedValue crowdSourcedValue) {
		this.crowdSourcedValue = crowdSourcedValue;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceMaker() {
		return deviceMaker;
	}

	public void setDeviceMaker(String deviceMaker) {
		this.deviceMaker = deviceMaker;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getDeviceOS() {
		return deviceOS;
	}

	public void setDeviceOS(String deviceOS) {
		this.deviceOS = deviceOS;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getTz() {
		return tz;
	}

	public void setTz(int tz) {
		this.tz = tz;
	}

	public double getUid() {
		return uid;
	}

	public void setUid(double uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "Data [client_timestamp=" + client_timestamp + ", client_tz=" + client_tz + ", crowdSourcedLocation="
				+ crowdSourcedLocation + ", crowdSourcedValue=" + crowdSourcedValue + ", deviceId=" + deviceId
				+ ", deviceMaker=" + deviceMaker + ", deviceModel=" + deviceModel + ", deviceOS=" + deviceOS
				+ ", timestamp=" + timestamp + ", tz=" + tz + ", uid=" + uid + "]";
	}

	public int compareTo(Data arg0) {

		return ((Integer) this.crowdSourcedValue.getInterest()).compareTo(arg0.getCrowdSourcedValue().getInterest());
	}

}
