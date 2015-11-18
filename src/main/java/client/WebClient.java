package client;


import mypackage.HelloWebServiceService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WebClient", urlPatterns = {"/WebClient"})
public class WebClient extends HttpServlet {

    private mypackage.HelloWebService service = new HelloWebServiceService().getHelloWebServicePort();

    protected void processRequest(HttpServletRequest request,
                                  HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

       response.sendRedirect("OrderPage.jsp");

//        out.println("<html lang=\"en\">");
//        out.println("<head>");
//        out.println("<title>Servlet HelloServlet</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<h1>Servlet HelloServlet at " +
//                request.getContextPath() + "</h1>");
//        out.println("<p>" + sayHello("Max") + "</p>");
//        out.println("</body>");
//        out.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private String sayHello(String word) {
        return service.sayHello(word);
    }
}
