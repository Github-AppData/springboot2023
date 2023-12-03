package com.example.rubypaper.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.rubypaper.dto.Cart;


@Mapper
public interface CartMapper {
	
	public void cartInsert(Cart cart);
	public String cartCheckimgSrc(@Param("clo_imgSrc") String clo_imgSrc);
	public int numberOfCart();
}
