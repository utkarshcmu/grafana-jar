package io.github.utkarshcmu;

import io.github.utkarshcmu.grafana.Dashboard;

import com.fasterxml.jackson.core.JsonProcessingException;

public class TestDashboard {

	public static void main(String[] args) throws JsonProcessingException {
		Dashboard dash = new Dashboard("micku-test1");
		System.out.println(dash.getDashboardJSON());
		Dashboard dash2 = new Dashboard("micku-test2");
		System.out.println(dash2.getDashboardJSON());
	}
	
}
