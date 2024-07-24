package register.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import register.dao.UserCrud;
import register.dto.UserTable;

@WebServlet("/register")
public class UserReg extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String fn = req.getParameter("fn");
		String ln = req.getParameter("ln");
		String email = req.getParameter("e");
		String password = req.getParameter("pwd");
		String phone = req.getParameter("ph");
		String age = req.getParameter("age");
		String gender = req.getParameter("gen");

		int age1 = Integer.parseInt(age);
		long phn = Long.parseLong(phone);
		System.out.println(fn);
		System.out.println(ln);
		System.out.println(email);
		System.out.println(password);
		System.out.println(age);
		System.out.println(gender);

			try {
				UserCrud crud=new UserCrud();
				 UserTable table=new UserTable(fn, ln, email, password, phn, age1, gender);
				 crud.saveUser(table);
				RequestDispatcher dispatch=req.getRequestDispatcher("login.html");
				dispatch.forward(req, res);
				
				
				
				
				
			} catch (Exception e) {
				 RequestDispatcher dispatch=req.getRequestDispatcher("reg.html");
				 dispatch.include(req, res);
				 
			}
				 PrintWriter pw = res.getWriter();
					pw.println(fn + " registered successfully");
					pw.println(age1);
					pw.println("<html>" + "<body>" + "<h1 style=color:blue>" + "User Details" + "</h1>" + "<h2>" + "First name :"
							+ fn + "<br>" + "Last name:" + ln + "<br>" + "Email :" + email + "<br>" + "Phone number :" + phn
							+ "<br>" + "Age :" + age1 + "<br>" + "Gender :" + gender + "</h2>" + "</body>" + "</html>");
				 
			}
			

		PrintWriter pw = res.getWriter();
		pw.println(fn + " registered successfully");
		pw.println(age1);
		pw.println("<html>" + "<body>" + "<h1 style=color:blue>" + "User Details" + "</h1>" + "<h2>" + "First name :"
				+ fn + "<br>" + "Last name:" + ln + "<br>" + "Email :" + email + "<br>" + "Phone number :" + phn
				+ "<br>" + "Age :" + age1 + "<br>" + "Gender :" + gender + "</h2>" + "</body>" + "</html>");

	}
			}
}
}
