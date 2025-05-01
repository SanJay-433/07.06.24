package com.cts.entity;
import jakarta.persistence.*;

@Entity
public class Admin {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long adminId;
     private String name;
     private String role;
     private String permission;
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
     
     
}
