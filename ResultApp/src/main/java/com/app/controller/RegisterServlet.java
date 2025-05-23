package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.app.bean.Student;
import com.app.dao.StudentDAO;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/servlet2")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		int prn= Integer.parseInt(request.getParameter("textPrn"));
		String name =  request.getParameter("textName");
		
		float m1= Float.parseFloat(request.getParameter("textM1"));
		float m2= Float.parseFloat(request.getParameter("textM2"));
		float m3= Float.parseFloat(request.getParameter("textM3"));
		
		Student s=new Student();
		s.setPrn(prn);
		s.setName(name);
		s.setS1(m1);
		s.setS2(m2);
		s.setS3(m3);
		
		int status=StudentDAO.registerStudent(s);
		
		if(status==1)
		{
			response.sendRedirect("details.html");
		}
		else
		{
			pw.write("Failed Register");
			request.getRequestDispatcher("details.html").include(request, response);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
