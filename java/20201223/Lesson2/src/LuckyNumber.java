

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LuckyNumber")
public class LuckyNumber extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Random rand=new Random();
		String lis="";
		int count=0;
		while(true) {
			int no=rand.nextInt(900)+100;
			lis+="<p>"+no+"</p>";
			count++;
			if(no==777) {
				break;
			}
		}
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<title>LuckyNumber</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(lis);
		out.println(count+"回目に出ました!");
		out.println("</body>");
		out.println("<html>");
	}
}
