package io.github.utkarshcmu;

import io.github.utkarshcmu.grafana.Dashboard;

public class TestDashboard {

	public static void main(String[] args) {
		
		Dashboard dash = new Dashboard();
		System.out.println(DashboardRegistry.getDashboardJSON(dash));
		
	}
	
}
