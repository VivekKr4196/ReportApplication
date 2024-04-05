package com.vivek.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vivek.entity.CitizenPlan;
import com.vivek.repo.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {
	
	@Autowired 
	CitizenPlanRepository repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		repo.deleteAll();
		
		// Cash Plan Data
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Sunny Kumar");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenifitAmount(5000.00);
		
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Anjali Arora");
		c2.setGender("Female");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Rental Income");
		
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Vishal Kumar");
		c3.setGender("Male");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(3));
		c3.setPlanEndDate(LocalDate.now().plusMonths(3));
		c3.setBenifitAmount(50000.00);
		c3.setTerminationReason("Employeed");
		c3.setTerminatedDate(LocalDate.now());
		
		//Food Plan Data
		
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Manish Malhotra");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenifitAmount(15000.00);
		
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Kritika Sinha");
		c5.setGender("Female");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Property Income");
		
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Vishal Saxena");
		c6.setGender("Male");
		c6.setPlanName("Food");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(3));
		c6.setPlanEndDate(LocalDate.now().plusMonths(3));
		c6.setBenifitAmount(5000.00);
		c6.setTerminationReason("Employeed");
		c6.setTerminatedDate(LocalDate.now());
		
		//Medical PLan Data
		
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Saloni Sinha");
		c7.setGender("Female");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now().minusMonths(2));
		c7.setPlanEndDate(LocalDate.now().plusMonths(4));
		c7.setBenifitAmount(115000.00);
		
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Tom Holland");
		c8.setGender("Male");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("Property Income");
		
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Manish Malhotra");
		c9.setGender("Male");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(1));
		c9.setPlanEndDate(LocalDate.now().plusMonths(5));
		c9.setBenifitAmount(5000.00);
		c9.setTerminationReason("Government Job");
		c9.setTerminatedDate(LocalDate.now());
		
		//Employement Plan Data
		
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Abdul Khan");
		c10.setGender("Male");
		c10.setPlanName("Employement");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now().minusMonths(2));
		c10.setPlanEndDate(LocalDate.now().plusMonths(4));
		c10.setBenifitAmount(115000.00);
		
		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Shekhar Malhotra");
		c11.setGender("Male");
		c11.setPlanName("Employement");
		c11.setPlanStatus("Denied");
		c11.setDenialReason("Property Income");
		
		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Zoya Ansari");
		c12.setGender("Female");
		c12.setPlanName("Employement");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(1));
		c12.setPlanEndDate(LocalDate.now().plusMonths(5));
		c12.setBenifitAmount(5000.00);
		c12.setTerminationReason("Government Job");
		c12.setTerminatedDate(LocalDate.now());
		
		List<CitizenPlan> list = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12);
		
		repo.saveAll(list);
		
	}
}
