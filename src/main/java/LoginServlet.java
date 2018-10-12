import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

//        if (request.getMethod().equalsIgnoreCase("get")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username != null && password != null) {
                if (username.equals("admin") && password.equals("password")) {
                    response.sendRedirect("/profile");
                    return;
                } else {
                    response.sendRedirect("/login");
                    return;
                }
            }
//        }

        request.getRequestDispatcher("/login.jsp").forward(request, response);

    }
}
