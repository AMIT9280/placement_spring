package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bean.JobBean;
import com.bean.StudentBean;

public class JobDao {

	@Autowired
	JdbcTemplate stmt;
	
	public void insertJob(JobBean job) {
			stmt.update("insert into jobs (jobtitle,jobdescurl) values (?,?)",job.getJobtitle(),job.getJdurl());
	}

	public List<JobBean> getAllJobs() {
		 List<JobBean> jobs = stmt.query("select * from jobs", new BeanPropertyRowMapper<JobBean>(JobBean.class));
		return jobs;
	}
	
	 
}



