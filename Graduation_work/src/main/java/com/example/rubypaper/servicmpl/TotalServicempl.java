package com.example.rubypaper.servicmpl;

import java.util.List;
import java.util.Map;

import com.example.rubypaper.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rubypaper.mapper.TotalMapper;
import com.example.rubypaper.service.TotalService;

@Service
public class TotalServicempl implements TotalService{
	
	@Autowired
	private TotalMapper totalMapper;

	@Override
	public int numberOfCart() {
		return totalMapper.numberOfCart();
	}

	@Override
	public List<Map<String, Object>> boardIdxData(int idx) throws Exception {
		return totalMapper.boardIdxData(idx);
	}

	@Override
	public List<Map<String, Object>> myPageUserDataSet(String user_id) throws Exception {
		return totalMapper.myPageUserDataSet(user_id);
	}

	@Override
	public int cartDeleteShoesId() throws Exception {
		return totalMapper.cartDeleteShoesId();
	}

	@Override
	public List<Map<String, Object>> boardCheckIdFindList(String user_id) throws Exception {
		return totalMapper.boardCheckIdFindList(user_id);
	}

	@Override
	public List<Map<String, Object>> boardFindList(Paging paging) throws Exception {
		return totalMapper.boardFindList(paging);
	}
	
	@Override
	public int  boardCount() throws Exception{
		return totalMapper.boardCount();
	}
	
	@Override
	public int searchBoardCount(String boards_Name) throws Exception{
		return totalMapper.searchBoardCount(boards_Name);
	}
	
	@Override
	public int shoesCount(Paging paging) throws Exception{
		return totalMapper.shoesCount(paging);
	}
	
	@Override
	public int searchClothesCount(Paging paging) throws Exception{
		return totalMapper.searchClothesCount(paging);
	}
	
	@Override
	public int userCount() throws Exception{
		return totalMapper.userCount();
	}
	
	@Override
	public int searchUserCount(String name) throws Exception{
		return totalMapper.searchUserCount(name);
	}

	@Override
	public List<Map<String, Object>> cartFindList() throws Exception {
		return totalMapper.cartFindList();
	}

	@Override
	public List<Map<String, Object>> findIsLike() throws Exception {
		return totalMapper.findIsLike();
	}

	@Override
	public List<Map<String, Object>> TopSelect(Paging paging) throws Exception {
		return totalMapper.TopSelect(paging);
	}

	@Override
	public List<Map<String, Object>> BottomSelect(Paging_bottom paging_bottom) throws Exception {
		return totalMapper.BottomSelect(paging_bottom);
	}

	@Override
	public List<Map<String, Object>> searchsMain(Paging paging) throws Exception {
		return totalMapper.searchsMain(paging);
	}
	
	@Override
	public List<Map<String, Object>> searchAdminPageShoes(Paging paging) throws Exception {
		return totalMapper.searchAdminPageShoes(paging);
	}
	
	@Override
	public List<Map<String,Object>> searchAdminPageUser(Paging paging) throws Exception{
		return totalMapper.searchAdminPageUser(paging);
	}
	
	@Override
	public List<Map<String, Object>> searchBoards(Paging paging) throws Exception {
		return totalMapper.searchBoards(paging);
	}

	@Override
	public void FindListIsDelete() throws Exception {
		totalMapper.FindListIsDelete();
	}

	@Override
	public int getBoardValue() throws Exception {
		return totalMapper.getBoardValue();
	}

	@Override
	public int cartUpdateIsDelete(String clo_imgSrc) throws Exception{
		return totalMapper.cartUpdateIsDelete(clo_imgSrc);
	}

	@Override
	public String cartFindShoesId(String shoes_id) throws Exception {
		return totalMapper.cartFindShoesId(shoes_id);
	}


	@Override
	public int noticeBoardIdxResort() throws Exception {
		return totalMapper.noticeBoardIdxResort();
	}

	@Override
	public List<Map<String, Object>> adminPageSelectUserList(Paging paging) throws Exception {
		return totalMapper.adminPageSelectUserList(paging);
	}

	@Override
	public List<Map<String, Object>> adminPageSelectShoesList(Paging paging) throws Exception {
		return totalMapper.adminPageSelectShoesList(paging);
	}

	@Override
	public int adminPageUpdateShoesInfo(Clothes shoes) throws Exception {
		return totalMapper.adminPageUpdateShoesInfo(shoes);
	}

	@Override
	public void adminPageDeleteShoesInfo(String shoes_name) throws Exception {
		totalMapper.adminPageDeleteShoesInfo(shoes_name);
	}

	@Override
	public void adminPageShoesInsert(Clothes shoes) throws Exception {
		totalMapper.adminPageShoesInsert(shoes);
	}

	@Override
	public List<Map<String, Object>> adminPageSelectAdminAccount() throws Exception {
		return totalMapper.adminPageSelectAdminAccount();
	}

	@Override
	public void isLikeInfoInsert(Like_tb like_tb) throws Exception {
		totalMapper.isLikeInfoInsert(like_tb);
	}

	@Override
	public Clothes cloSrcCheckLike(String clo_imgSrc) throws Exception {
		return totalMapper.cloSrcCheckLike(clo_imgSrc);
		
	}

	@Override
	public int isLikeUpdate(String clo_imgSrc) throws Exception {
		return totalMapper.isLikeUpdate(clo_imgSrc);
		
	}

	@Override
	public List<Map<String, Object>> linkIdSelectLike() throws Exception {
		return totalMapper.linkIdSelectLike();
		
	}

	@Override
	public List<Map<String, Object>> isLikeSelect(Paging paging) throws Exception {
		return totalMapper.isLikeSelect(paging);
	}
	
	@Override
	public int isLikeCount() throws Exception{
		return totalMapper.isLikeCount();
	}

	@Override
	public int likeDeleteCloSrc(String clo_imgSrc) throws Exception {
		return totalMapper.likeDeleteCloSrc(clo_imgSrc);
	}

	@Override
	public int isDisableLikeUpdate(String clo_imgSrc) throws Exception {
		return totalMapper.isDisableLikeUpdate(clo_imgSrc);
	}

	@Override
	public void reviewInfoInsert(Review review) throws Exception {
		totalMapper.reviewInfoInsert(review);
	}

	@Override
	public int reviewRatingAvgSelect(String shoes_id) throws Exception {
		return totalMapper.reviewRatingAvgSelect(shoes_id);
	}

	@Override
	public void shoesRatingStarsUpdate(Clothes shoes) throws Exception {
		totalMapper.shoesRatingStarsUpdate(shoes);
	}

	@Override
	public List<Map<String, Object>> selectMain() throws Exception {
		return totalMapper.selectMain();
	}

	@Override
	public List<Map<String, Object>> myPageNoticeBoardSelect(String user_id) throws Exception {
		return totalMapper.myPageNoticeBoardSelect(user_id);
	}

	@Override
	public void requestPay2InfoInsert(Order_List order_List) throws Exception {
		totalMapper.requestPay2InfoInsert(order_List);
	}

	@Override
	public List<Map<String, Object>> myPageOrderListSelect(String user_id) throws Exception {
		return totalMapper.myPageOrderListSelect(user_id);
	}

	@Override
	public List<Map<String, Object>> myPageToSDetailsSetSelect(int order_id) throws Exception {
		return totalMapper.myPageToSDetailsSetSelect(order_id);
	}

	public List<Map<String, Object>> searchsMainBottom(Paging_bottom paging_bottom) throws Exception {
		return totalMapper.searchsMainBottom(paging_bottom);
	}


}
