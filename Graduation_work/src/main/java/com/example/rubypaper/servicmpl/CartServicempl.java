package com.example.rubypaper.servicmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rubypaper.dto.Cart;
import com.example.rubypaper.mapper.CartMapper;
import com.example.rubypaper.service.CartService;

@Service
public class CartServicempl implements CartService{
	
	@Autowired
	private CartMapper cartMapper;

	@Override
	public void cartInsert(Cart cart) throws Exception {
		cartMapper.cartInsert(cart);
	}
	@Override
	public String cartCheckimgSrc(String clo_imgSrc) throws Exception {
		return cartMapper.cartCheckimgSrc(clo_imgSrc);
	}
	@Override
	public int numberOfCart() throws Exception {
		return cartMapper.numberOfCart();
	}
}
