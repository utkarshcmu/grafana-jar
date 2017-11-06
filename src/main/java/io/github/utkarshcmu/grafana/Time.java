package io.github.utkarshcmu.grafana;

public class Time {
	
	private String from;
	private String to;
	
	Time() {
		this.from = "now-6h";
		this.to = "now";
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
}
