	package com.example.rubypaper.servlet;

import java.io.BufferedReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.rubypaper.dto.Clothes;
import com.example.rubypaper.service.TotalService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AdminPageShoesInsertServlet")
public class AdminPageShoesInsertServlet extends HttpServlet{
	
	@Autowired
	TotalService totalService;
	
	Clothes shoes = new Clothes();
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BufferedReader reader = request.getReader();
        StringBuilder updateInfo = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
        	updateInfo.append(line);
        }
        String str = updateInfo.toString();
        System.out.println("str"+str);
        
        String [] parts = str.split(",");
        
        
        String imgSrc = parts[0];
        String name = parts[1];
        int price = Integer.parseInt(parts[2]);
        
        shoes.setClo_imgSrc(imgSrc);
        shoes.setPrice(price);
        shoes.setName(name);
        
        int final_price = price;
        shoes.setFinal_price(final_price);
        
        try {
			totalService.adminPageShoesInsert(shoes);
			response.setStatus(HttpServletResponse.SC_OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
	}

}
