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

@WebServlet("/AdminclothesInfoUpdateServlet")
public class AdminclothesInfoUpdateServlet  extends HttpServlet{
	
	Clothes clothes = new Clothes();
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
        
        clothes.setFinal_price(final_price);
        clothes.setSales(sales);
        clothes.setName(name);
        clothes.setPrice(price);
        System.out.println("AdminclothesInfoUpdateServlet clothes : "+clothes);
        try {
			totalService.adminPageUpdateClothesInfo(clothes);
			response.setStatus(HttpServletResponse.SC_OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        response.sendRedirect(request.getContextPath() + "/adminOrders");
	}
}
