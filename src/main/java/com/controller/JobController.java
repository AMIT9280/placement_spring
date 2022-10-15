package com.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.JobBean;
import com.bean.StudentBean;
import com.dao.JobDao;

@Controller
public class JobController {
		
	private String parent;
	@Autowired
	JobDao jobdao;
	
	@GetMapping("/newjob")
	public String NewJob() {
		
		return "NewJob";
	}
	@PostMapping("/savejob")
	public String saveJob(JobBean job) {
		System.out.println(job);
		System.out.println(job.getJobtitle());
		System.out.println(job.getDescription().getOriginalFilename());
		System.out.println(job.getDescription().getSize());
		
	 try {
		Date d = new Date();
		long ts = d.getTime();
	 
		File f = new File("D:\\AMIT\\Royal\\Tejas sir\\Ad Java\\placment\\src\\main\\resources\\jd\\",
				ts+"_"+job.getDescription().getOriginalFilename());
		
		byte b[] = job.getDescription().getBytes();
		
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(b);
		fos.close();
		
		job.setJdurl("resources\\jd\\" + ts+"_"+job.getDescription().getOriginalFilename());
		jobdao.insertJob(job);
	 } catch (Exception e) {
		e.printStackTrace();   
	}
		return "redirect:/home";
	}
 @GetMapping("/listjob")
 public String listJob(Model model) {
	 List<JobBean> jobs = jobdao.getAllJobs();	 
	 model.addAttribute("Jobs", jobs);	
	 return "ListJobs";
 }
}
