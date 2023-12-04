package com.example.rubypaper.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.rubypaper.dto.Review;
import com.example.rubypaper.dto.Clothes;
import com.example.rubypaper.service.TotalService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ReviewInsertServlet")
public class ReviewInsertServlet extends HttpServlet{
	
	Review review = new Review();
	Clothes clothes = new Clothes();
	int cnt = 0;
	
	@Autowired
	TotalService totalService;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rating = request.getParameter("rating"); // 별점 값
		String reviewText = request.getParameter("reviewText"); // 리뷰 내용

		System.out.println("ReviewInsertServlet");
		System.out.println("rating : "+rating);

		try {
		    // JSON 파싱

		    // review table의 리뷰 넣기 - review id, shoes_id, rating 
		    // shoes 테이블의 별점 평균을 넣는데
		    // shoes_id로 review 테이블의 리뷰 갯수(count)와 rating star를 다 더한 값(sum)과 나눈다. 
		    // - 평균 = 리뷰 갯수 / rating star를 다 더한 값
		    // 그래서 평균을 shoes 테이블의 review_stars 컬럼에 insert를 한다.

			// 선택한 clo_imgSrc 세션의 데이터를 가지고 온다.
			HttpSession session = request.getSession();
			String clo_imgSrc2 = (String) session.getAttribute("clo_imgSrc");


			// 첫 번째 문자 제거₩
			// 첫 번째 문자 제거
			String clo_imgSrc = clo_imgSrc2.substring(1);
			System.out.println("clo_imgSrc : "+clo_imgSrc);

		    // review_id 값에 들어갈 랜덤 문자열
		    String generatedString = RandomStringUtils.randomAlphanumeric(10);
		    String review_id = "review" + generatedString;

		    // review의 기본 정보를 review 테이블의 set 하는 코드
		    review.setReview_id(review_id);
		    review.setClo_imgSrc(clo_imgSrc);
		    review.setRating(Integer.parseInt(rating));
		    review.setReviewText(reviewText);

		    totalService.reviewInfoInsert(review);

		    // review 테이블에서 해당 신발의 rating 평균을 구해서 review_stars 에다가 집어넣는다.
		    int review_stars = totalService.reviewRatingAvgSelect(clo_imgSrc);
			System.out.println("review_stars : "+review_stars);

		    // 계산한 평균 값을 shoes 테이블에 업데이트 하는 코드
			clothes.setReview_stars(review_stars);
			clothes.setClo_imgSrc(clo_imgSrc);

		    totalService.clothesRatingStarsUpdate(clothes);

		} catch (Exception e) {
		    e.printStackTrace();
		} 
		
		// 클라이언트에게 응답을 전송합니다.
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write("<html><body><h3>작업 완료</h3><br><p>창을 닫아주세요.</p></body></html>");
		
	}

}
