package com.example.rubypaper.servlet;

import java.io.BufferedReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.rubypaper.service.TotalService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CartUpdateServlet")
public class CartUpdateServlet extends HttpServlet {
	
	@Autowired
	TotalService totalService;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("CartUpdateServlet");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
        BufferedReader reader = request.getReader();
        StringBuilder deleteInfo = new StringBuilder();
        
        String line = null;
        while ((line = reader.readLine()) != null) {
        	
        	deleteInfo.append(line);
        }
        System.out.println("deleteInfo : "+deleteInfo);
        
        String str = deleteInfo.toString();
        
        String [] parts = null;
        
        parts = str.split(",");
        
        String clo_imgSrc = null;
		clo_imgSrc = parts[0];

        System.out.println("clo_imgSrc : "+clo_imgSrc);
        
        try {
			totalService.cartUpdateIsDelete(clo_imgSrc);
			
			response.setStatus(HttpServletResponse.SC_OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
