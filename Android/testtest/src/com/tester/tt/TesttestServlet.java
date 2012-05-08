package com.tester.tt;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class TesttestServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
