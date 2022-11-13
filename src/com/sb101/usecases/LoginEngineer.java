package com.sb101.usecases;

import java.util.Scanner;

import com.sb101.beans.Engineer;
import com.sb101.dao.EngineerDAO;
import com.sb101.dao.EngineerDAOImpl;
import com.sb101.exceptions.EngineerException;

public class LoginEngineer {

	public static void main() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter engineer email");
		String email = sc.next();
		
		System.out.println("Enter engineer password");
		String pass = sc.next();
		
		Engineer eng = new Engineer(email,pass);
		
		EngineerDAO dao = new EngineerDAOImpl();
		
		try {
			String loginStatus = dao.login(eng);
			System.out.println(loginStatus);
		} catch (EngineerException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
