<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			.weixin{ height: 33px; }
			.weixin a{ width: 23px; height: 23px; overflow: visible; display: inline-block;  margin:8px 4px; position: relative; }
			.weixin a.sina{ background:url(images/sina2.png) no-repeat 0 0; }
			.weixin a.sina:hover{ background:url(images/sina.png) no-repeat 0 0; }
			.weixin a.qq{ background:url(images/qq.png) no-repeat 0 0; }
			.weixin a.wx{ background:url(images/wx2.png) no-repeat 0 0; }
			.weixin a.wx:hover{background:url(images/wx.png) no-repeat 0 0; }
			.weixin .weixImg { display: none; position: absolute; top: 38px; left: -40px; z-index: 9996; background: #fff; height: 102px; width: 102px; border: 1px solid #999; box-shadow: 0 0 5px #555555; text-align: center; }
			.weixin .weixImg .tipShape { background: url(images/tipShep.png) no-repeat; display: inline-block; height: 10px; left: 40%; position: absolute; top: -9px; width: 19px; z-index: 9998; }
			.weixin .weixImg img { width: 100px; height: 100px; overflow: hidden; display: block; }
			.weixin a.wx:hover .weixImg, .weixin a.sina:hover .weixImg { display: block; }
		</style>
	</head>
	<body>
		<div class="weixin">
    		<a class="sina" href="http://weibo.com/023yujinsuo?from=myfollow"></a>
    		<a class="wx"><div class="weixImg"><span class="tipShape"></span><img src="images/wx2v.jpg"></div></a>
		</div>	
	</body>
</html>