<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>店铺管理</title>

<link rel="stylesheet" href="css/font-awesome.css">
<link rel="stylesheet" href="css/style.css">


<script type="text/javascript" >

function Refresh(){
	    var url = "http://localhost:8080/wxWeb/Good.jsp";
	    sendRequest(url);
	} 
	
	var XMLHttpReq = false;
	//创建XMLHttpRequest对象       
	function createXMLHttpRequest() {
	    if(window.XMLHttpRequest) { //Mozilla 浏览器
	        XMLHttpReq = new XMLHttpRequest();
	    }
	    else if (window.ActiveXObject) { // IE浏览器
	        try {
	            XMLHttpReq = new ActiveXObject("Msxml2.XMLHTTP");
	        } catch (e) {
	            try {
	                XMLHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
	            } catch (e) {}
	        }
	    }
	}
	//发送请求函数
	function sendRequest(url) {
	    createXMLHttpRequest();
	    XMLHttpReq.open("POST", url, true);
	    XMLHttpReq.onreadystatechange = processResponse;//指定响应函数
	    XMLHttpReq.send(null);  // 发送请求
	}
	// 处理返回信息函数
	function processResponse() {
	    if (XMLHttpReq.readyState == 4) { // 判断对象状态
	        if (XMLHttpReq.status == 200) { // 信息已经成功返回，开始处理信息
	            var result = XMLHttpReq.responseText;    
	            document.getElementById("contentDiv").innerHTML = result;     
	        } else { //页面不正常
	            window.alert("您所请求的页面有异常。");
	        }
	    }
	}
	
function print(){
	alert("点击成功");
}
</script>

</head>
<body>
<nav class="menu-wrap">
	<div class="menu">
		<ul>
			<li onclick="Refresh()">
				<i class="fa fa-home fa-lg"></i>
				<span class="nav-text">商品管理</span>
			</li>
			<li>
				<a href="">
					<i class="fa fa-user fa-lg"></i>
					<span class="nav-text">订单管理</span>
				</a>
			</li>
			<li>
				<a href=" ">
					<i class="fa fa-envelope-o fa-lg"></i>
					<span class="nav-text">提货点管理</span>
				</a>
			</li>
			<li>
				<a href=" ">
					<i class="fa fa-heart-o fa-lg"></i>
					<span class="nav-text">个人管理</span>
				</a>
			</li>
		</ul>
	</div>
</nav>
<div id="contentDiv" style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">
<%-- <jsp:include page="/Good.jsp" flush="true"></jsp:include> --%>
<button id="button1"  onclick="print()">请点击</button>
</div>
</body>
</html>