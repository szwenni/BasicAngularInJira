package com.sven.angularinjira.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet{
    private static final Logger log = LoggerFactory.getLogger(MyServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        System.out.println("myservlet"+req.getPathInfo());
        resp.setContentType("text/html");
        resp.getWriter().write("<!DOCTYPE html><html lang=\"en\"><head>\n" +
"  <meta charset=\"utf-8\">\n" +
"  <title>Angularinijra</title>\n" +
"  <base href=\"./\">\n" +
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"  <link rel=\"icon\" type=\"image/x-icon\" href=\"favicon.ico\">\n" +
"<link rel=\"stylesheet\" href=\"IT/dist/styles.31d6cfe0d16ae931b73c.css\"></head>\n" +
"<body>\n" +
"  <app-root></app-root>\n" +
"<script src=\"dist/runtime.390aab13b7712f45f0fb.js\" defer></script><script src=\"dist/polyfills.cc932241d86690005081.js\" defer></script><script src=\"dist/main.2e2057ac607369954096.js\" defer></script>\n" +
"\n" +
"</body></html>");
    }

}