package io.github.utkarshcmu.grafana;

public class TimePicker {

	private String[] refresh_intervals;
	private String[] time_options;
	
	public TimePicker() {
		String[] intervals = {"5s", "10s", "30s", "1m", "5m", "15m", "30m", "1h", "2h", "1d"};
		this.refresh_intervals = intervals;
		String[] time_options = {"5m", "15m", "1h", "6h", "12h", "24h", "2d", "7d", "30d"};
		this.time_options = time_options;
	}

	public String[] getRefresh_intervals() {
		return refresh_intervals;
	}

	public void setRefresh_intervals(String[] refresh_intervals) {
		this.refresh_intervals = refresh_intervals;
	}

	public String[] getTime_options() {
		return time_options;
	}

	public void setTime_options(String[] time_options) {
		this.time_options = time_options;
	}
	
}
