package com.bean;

import org.springframework.web.multipart.MultipartFile;

public class JobBean {
		int jobid;
		String jobdescurl;
		String jobtitle;
		MultipartFile description;
		public int getJobid() {
			return jobid;
		}
		public void setJobid(int jobid) {
			this.jobid = jobid;
		}
		 
		public String getJobdescurl() {
			return jobdescurl;
		}
		public void setJobdescurl(String jobdescurl) {
			this.jobdescurl = jobdescurl;
		}
		public String getJobtitle() {
			return jobtitle;
		}
		public void setJobtitle(String jobtitle) {
			this.jobtitle = jobtitle;
		}
		public MultipartFile getDescription() {
			return description;
		}
		public void setDescription(MultipartFile description) {
			this.description = description;
		}
}
