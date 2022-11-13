package com.sb101.usecases;

import java.util.Scanner;

import com.sb101.dao.HodDAO;
import com.sb101.dao.HodDAOImpl;
import com.sb101.exceptions.HODException;

public class LoginHOD {
	
	public static void main() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter hod username:");
		String user = sc.next();
		
		System.out.print("Enter hod password:");
		String pass = sc.next();
		
		HodDAO dao = new HodDAOImpl();
		
		try {
			String loginStatus = dao.loginHOD(user,pass);
			System.out.println(loginStatus);
		} catch (HODException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
