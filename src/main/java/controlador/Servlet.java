package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");

        String metodoHttp = req.getMethod();
        String requestURI = req.getRequestURI();
        String requestURL = req.getRequestURL().toString();
        String contextPath = req.getContextPath();
        String servletPath = req.getServletPath();
        String ip = req.getLocalAddr();
        int port = req.getServerPort();
        String scheme = req.getScheme();
        String host = req.getHeader("host");
        String url = scheme + "://" + host + contextPath + servletPath;

        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<title>Información de Clientes</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Información del Servlet</h1>");
        out.println("<ul>");
        out.println("<li>Método HTTP: " + metodoHttp + "</li>");
        out.println("<li>URI: " + requestURI + "</li>");
        out.println("<li>URL: " + requestURL + "</li>");
        out.println("<li>Context Path: " + contextPath + "</li>");
        out.println("<li>IP: " + ip + "</li>");
        out.println("<li>Puerto: " + port + "</li>");
        out.println("<li>Esquema: " + scheme + "</li>");
        out.println("<li>Host: " + host + "</li>");
        out.println("<li>URL Completa: " + url + "</li>");
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
    }
}
