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

@WebServlet("/AdminShoesInfoUpdateServlet")
public class AdminShoesInfoUpdateServlet  extends HttpServlet{
	
	Clothes shoes = new Clothes();
	String [] parts = null;
	
	@Autowired
	TotalService totalService;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
        BufferedReader reader = request.getReader();
        StringBuilder updateInfo = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
        	updateInfo.append(line);
        }
        String str = updateInfo.toString();
        System.out.println("str : "+str);
        System.out.println("str type : "+str.getClass().getName());
        
        
        parts = str.split(",");
        System.out.println("parts type : "+ parts.getClass().getName());
        int price = 0;
        price = Integer.parseInt(parts[0]); // 원래 가격
        
        int sales = 0;	
        sales = Integer.parseInt(parts[1]) ; // 할인 율 
        
        String name = null;
        name = parts[2]; // 신발 이름
        
        int final_price = 0;
        final_price = Integer.parseInt(parts[3]) ; // 최종 가격 
        
        shoes.setFinal_price(final_price);
        shoes.setSales(sales);
        shoes.setName(name);
        shoes.setPrice(price);
        
        try {
			totalService.adminPageUpdateShoesInfo(shoes);
			response.setStatus(HttpServletResponse.SC_OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        response.sendRedirect(request.getContextPath() + "/adminOrders");
	}
}
