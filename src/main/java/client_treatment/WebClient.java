package client_treatment;


import service_class_data.TicketServiceService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WebServlet", urlPatterns = {"/WebClient"})
public class WebClient extends HttpServlet {

//    private service_class_data.TicketService service = new TicketServiceService().getTicketServicePort();


    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        response.sendRedirect("OrderPage.jsp");

//        Process process = new Process(request);

//        process.treatment(out);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

}
