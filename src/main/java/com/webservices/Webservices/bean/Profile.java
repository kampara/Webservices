package com.webservices.Webservices.bean;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	
	
	private String pid;
	private String pname;
	private Date created_date;
	
	public Profile() {
		// TODO Auto-generated constructor stub
	}
	
	public Profile(String id,String name)
	{
		this.pid=id;
		this.pname=name;
		this.created_date= new Date();
		
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	
	

}
