package com.inter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {

	//interface 규칙, 설계도
	public String execute(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException;
		
	
}
