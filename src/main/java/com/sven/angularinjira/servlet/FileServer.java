package com.sven.angularinjira.servlet;

import java.io.BufferedReader;
import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;

public class FileServer extends HttpServlet{
    private static final Logger log = LoggerFactory.getLogger(FileServer.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //System.out.println(req.getServletPath());
        //System.out.println(req.getContextPath());
       System.out.println(req.getPathInfo());
       String path = req.getPathInfo();
        try {
            URL url = new URL("http://localhost:8095"+path);
            URLConnection connection = url.openConnection();
            String contentType = connection.getContentType();
            String content = IOUtils.toString(connection.getInputStream(), "UTF-8");
            
            resp.setContentType(contentType);
            resp.getWriter().write(content);  
            
        //resp.getWriter().write(file);
        }catch(Exception e) {
            System.err.println(e.getMessage());
        resp.getWriter().write(e.getMessage());    
        }
    }

}