public class Grafana {

	private String url;
	private String key;
	
	Grafana(String url, String key) {
		this.url = url;
		this.key = key;
	}
	
	public boolean testConnection() {
		return false;
	}
	
}
