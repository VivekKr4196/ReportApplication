package com.vivek.service;

import java.util.List;

import com.vivek.entity.CitizenPlan;
import com.vivek.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanNames();
	
	public List<String> getPlanStatus();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPDF();
}
