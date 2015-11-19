package client_treatment;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;
import java.io.IOException;
import java.util.Enumeration;

public class Process {

    Enumeration parameterNames;

    public boolean treatment(HttpServletRequest request) {
        parameterNames = request.getParameterNames();
        return parameterNames.hasMoreElements();
//        out.print(parameterNames);
    }

    public String checkFields(JspWriter out, HttpServletRequest request) throws IOException {
        String field = null;
        while (parameterNames.hasMoreElements()) {
            field = (String) parameterNames.nextElement();
            out.println(request.getParameter(field));
        }
        return field;

    }
}
