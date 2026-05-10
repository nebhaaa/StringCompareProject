import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import org.apache.commons.lang3.StringUtils;

@WebServlet("/compare")
public class CompareServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String str1 = request.getParameter("str1");
        String str2 = request.getParameter("str2");

        boolean result = StringUtils.equalsIgnoreCase(str1, str2);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Result:</h2>");
        if (result) {
            out.println("<p>Strings are equal</p>");
        } else {
            out.println("<p>Strings are NOT equal</p>");
        }
    }
}