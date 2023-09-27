package com.auca.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet{
	private static final String CORRECT_USERNAME = "auca.marius@auca.rw";
	private static final String CORRECT_PASSWORD = "Auca@2022";
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException{
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(CORRECT_USERNAME.equals(username) && CORRECT_PASSWORD.equals(password)) {
			// Authentication successful, redirect to a welcome page
			res.sendRedirect("WelcomeServlet");
		}else {
			res.sendRedirect("ForgetPassword.html");
		}
	}

}
