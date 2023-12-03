package com.example.rubypaper.mapper;

import java.util.List;
import java.util.Map;

import com.example.rubypaper.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TotalMapper {

	public int getBoardValue();
	public List<Map<String, Object>> TopSelect(Paging paging) throws Exception;
	public List<Map<String, Object>> searchsMain(Paging paging);
	public List<Map<String, Object>> findIsLike();
	public List<Map<String, Object>> boardCheckIdFindList(@Param("user_id") String user_id);
	public int cartDeleteShoesId() throws Exception;
	
	public int adminPageUpdateShoesInfo(Clothes shoes) throws Exception;
	
	public List<Map<String, Object>> myPageUserDataSet(@Param("user_id") String user_id);
	public List<Map<String, Object>> boardIdxData(@Param("idx") int idx);
	public int numberOfCart();
	public List<Map<String, Object>> boardFindList(Paging paging);
	public List<Map<String, Object>> searchBoards(Paging paging);
	public List<Map<String, Object>> searchAdminPageShoes(Paging paging);
	public List<Map<String, Object>> searchAdminPageUser(Paging paging);
	public int boardCount() throws Exception;
	public int searchBoardCount(String boards_Name) throws Exception;
	public int shoesCount(Paging paging) throws Exception;
	public int searchClothesCount(Paging paging) throws Exception;
	public int userCount() throws Exception;
	public int searchUserCount(String name) throws Exception;
	public List<Map<String, Object>> cartFindList();
	public void FindListIsDelete() throws Exception;
	public int cartUpdateIsDelete(@Param("clo_imgSrc") String clo_imgSrc) throws Exception;
	public String cartFindShoesId(@Param("shoes_id") String shoes_id) throws Exception;
	public int noticeBoardIdxResort() throws Exception;
	public List<Map<String, Object>> adminPageSelectUserList(Paging paging) throws Exception;
	public List<Map<String, Object>> adminPageSelectShoesList(Paging paging) throws Exception;
	public void adminPageDeleteShoesInfo(String shoes_name);
	public void adminPageShoesInsert(Clothes shoes) throws Exception;
	public List<Map<String, Object>> adminPageSelectAdminAccount() throws Exception;
	public void isLikeInfoInsert(Like_tb like_tb) throws Exception;
	public Clothes shoesIdCheckLike(@Param("shoes_id") String shoes_id) throws Exception;
	public int isLikeUpdate(@Param("shoes_id") String shoes_id) throws Exception;
	public List<Map<String, Object>> linkIdSelectLike() throws Exception;
	public List<Map<String, Object>> isLikeSelect(Paging paging) throws Exception;
	public int isLikeCount() throws Exception;
	public int likeDeleteShoesId(String shoes_id) throws Exception;
	public int isDisableLikeUpdate(String shoes_id) throws Exception;
	public void reviewInfoInsert(Review review) throws Exception;
	public int reviewRatingAvgSelect(String shoes_id) throws Exception;
	public void shoesRatingStarsUpdate(Clothes shoes) throws Exception;
	public List<Map<String, Object>> selectMain() throws Exception;
	public List<Map<String, Object>> myPageNoticeBoardSelect(@Param("user_id") String user_id) throws Exception;
	public void requestPay2InfoInsert(Order_List order_List) throws Exception;
	public List<Map<String, Object>> myPageOrderListSelect(@Param("user_id") String user_id) throws Exception;
	public List<Map<String, Object>> myPageToSDetailsSetSelect(@Param("order_id") int order_id) throws Exception;

	List<Map<String, Object>> BottomSelect(Paging_bottom paging_bottom) throws Exception;

	List<Map<String, Object>> searchsMainBottom(Paging_bottom paging_bottom) throws Exception;

}
