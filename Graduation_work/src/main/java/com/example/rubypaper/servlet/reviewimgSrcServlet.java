package com.example.rubypaper.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@WebServlet("/reviewimgSrcServlet")
public class reviewimgSrcServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 클라이언트로부터의 JSON 데이터 수신
        BufferedReader reader = request.getReader();
        StringBuilder jsonBuffer = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            jsonBuffer.append(line);
        }

        String str = jsonBuffer.toString();
        String [] parts = str.split(",");

        System.out.println(parts[0].getClass().getName());

        // URL을 URI로 파싱
        URI uri = null;
        try {
            uri = new URI(parts[0]);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        // 경로 부분 얻기
        String clo_src = uri.getPath();
        System.out.println("reviewimgSrcServlet clo_src : "+clo_src);

        HttpSession session = request.getSession();
        session.removeAttribute("clo_imgSrc");
        session.setAttribute("clo_imgSrc", clo_src);
    }
}
