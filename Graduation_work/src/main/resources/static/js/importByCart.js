
    const userCode = "imp62443371";
    IMP.init(userCode);
    function requestPay(){
                  var name = document.getElementById("name").textContent;
                  var price = parseInt(document.getElementById("total_cost").textContent);
                  console.log("name : ", name);
                    console.log("price : ", price);
                  console.log(name);
                    //결제시 전달되는 정보
                  IMP.request_pay({
                              pg : 'html5_inicis', 
                              pay_method : 'card',
                              merchant_uid : 'merchant_' + new Date().getTime(),
                              name : "asdads"/*상품명*/,
                              amount : price/*상품 가격*/,
                              buyer_email : 'dlfheks@naver.com'/*구매자 이메일*/,
                              buyer_name : '테스터',
                              buyer_tel : '010-3061-3357'/*구매자 연락처*/,
                              buyer_addr : '서울특별시 강남구 삼성동'/*구매자 주소*/,
                              buyer_postcode : '123-456'/*구매자 우편번호*/
                          }, function(rsp) {
                              var result = '';
                              var msg ='';
                              if ( rsp.success ) {
                                  msg = '결제가 완료되었습니다.\n';
                                  msg += '고유ID : ' + rsp.imp_uid+'\n';
                                  msg += '상점 거래ID : ' + rsp.merchant_uid+'\n';
                                  msg += '결제 금액 : ' + rsp.paid_amount;
             
                                  //result ='0';
                              } else {
                                  msg += '에러내용 : ' + rsp.error_msg;
                                 // result ='1';
                              }
                              alert(msg);
                          });
                      }
    
    function requestPay2() {
		
		var xhr_pay2 = new XMLHttpRequest();
        
        xhr_pay2.onreadystatechange = function()
        {
			if(xhr_pay2.readyState === 4)
			{
				if(xhr_pay2.status === 200)
				{
					// 결제완료시 
					alert("결제완료.");
				}
			}
		}
		
		
		
		const dataWithKeywords = {};
		for(var i = 0; i < objLength; i++)
		{
			var quan = document.getElementById("quantity" + i).value;
			var size2 = object[i].size;
			var name2 = object[i].name;
			var final_price2 = object[i].final_price;
			
			var real_price = final_price2 * quan;
			
			 var newObject2 = {
		        name: name2,
		        quantity: quan,
		        size: size2,
		        final_price: real_price,
		        way: "KaKao"
		    };
		    dataWithKeywords["shoes" + i] = newObject2;
		}
		
		console.log("dataWithKeywords : ", dataWithKeywords);
		var jsonData = JSON.stringify(dataWithKeywords);
		console.log("jsonData : ", jsonData);
		
		var shoesPriceElement = document.getElementById("total_cost");
        var shoesPrice = parseFloat(shoesPriceElement.textContent.replace("원", "").replace(",", ""));

        IMP.request_pay({

            pg: "kakaopay",
            pay_method: "card",
            merchant_uid: 'merchant_' + new Date().getTime(),
            name : '주문명:결제테스트'/*상품명*/,
            name: "테스트",
            amount: shoesPrice,
            buyer_name : '테스터',
            buyer_tel: "010-3061-3357",

        }, function(rsp) {
                      var result = '';
                      var msg ='';
                      if ( rsp.success ) {
                          msg = '결제가 완료되었습니다.\n';
                          msg += '고유ID : ' + rsp.imp_uid+'\n';
                          msg += '상점 거래ID : ' + rsp.merchant_uid+'\n';
                          msg += '결제 금액 : ' + rsp.paid_amount;
                          xhr_pay2.open("POST", "/PayCartServlet", true);
     					  xhr_pay2.send(jsonData);
     
                      } else {
                          msg += '에러내용 : ' + rsp.error_msg;
                      }
                      alert(msg);
                  });
                 
    }