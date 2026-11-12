package com.csc584.profile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Receives the profile form (HTTP POST), cleans the values,
 * and forwards them to profile.jsp for display.
 */
@WebServlet(name = "ProfileServlet", urlPatterns = {"/ProfileServlet"})
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        // Parameter names must match the "name" attributes in index.html
        request.setAttribute("name", clean(request.getParameter("name")));
        request.setAttribute("studentId", clean(request.getParameter("studentId")));
        request.setAttribute("programme", clean(request.getParameter("programme")));
        request.setAttribute("email", clean(request.getParameter("email")));
        request.setAttribute("hobbies", clean(request.getParameter("hobbies")));
        request.setAttribute("intro", clean(request.getParameter("intro")));

        request.getRequestDispatcher("/profile.jsp").forward(request, response);
    }

    // Opening /ProfileServlet directly in the browser (GET) goes back to the form
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/index.html");
    }

    /** Trim, default empty values, and escape HTML so the JSP output is safe. */
    private String clean(String value) {
        if (value == null || value.trim().isEmpty()) {
            return "-";
        }
        return value.trim()
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }
}
