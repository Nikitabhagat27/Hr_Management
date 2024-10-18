package com.service;

import java.util.List;

import Dto.AttendanceDetail;

import com.repository.AttendanceRepository;


public class AttendanceService {
	public int save(AttendanceDetail AttendanceDetail) {
		  AttendanceRepository pass = new AttendanceRepository();
		   return pass.save(AttendanceDetail);   
	   }
	   public List<AttendanceDetail> getAll() {
		   AttendanceRepository pass = new AttendanceRepository();
		  return pass.findAll();  
	   }
}

