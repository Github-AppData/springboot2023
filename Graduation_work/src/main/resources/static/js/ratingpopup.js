// 후기작성을 버튼을 누르면 실행
function pop(elements)
{
	var xhr10 = new XMLHttpRequest();

	var btn = elements.getAttribute("data-link-id");
	var idReal = "img" + btn;
	var imgSrc = document.getElementById(idReal).src;

	xhr10.open("POST", "/reviewimgSrcServlet", true);
	xhr10.send(imgSrc);



	var leftPosition = (window.screen.width / 2) - (400 / 2);
	var topPosition = (window.screen.height / 2) - (500 / 2);
	var windowFeatures = 'width=520,height=280,history=no,resizable=no,status=no,scrollbars=yes,menubar=no,left=' + leftPosition + ',top=' + topPosition;
	window.open("ratingPopUp", "pop", windowFeatures);


}

