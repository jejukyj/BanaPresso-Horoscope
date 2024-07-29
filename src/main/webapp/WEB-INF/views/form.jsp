<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/css/form.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>운세 등록</title>
</head>
<body>
	<img class="bana-pic" src="/resources/img/bana-img-logo-symbol2.png" alt="BanaPresso" onclick="location.href='/board/list'" />
	<div class="box">
		<h3>오늘의 운세는?</h3>
		<form method="post" action="form">
			<div class="form-container">
				<span>작성자</span><br>
				<input placeholder="이름을 입력해주세요" class="form-box" type="text" name="boardWriter"><br>
				<span>운세</span><br>
				<input placeholder="운세를 입력해주세요" class="luck-box" type="text" name="boardContents"><br>
				<span>비밀번호</span><br>
				<input placeholder="비밀번호를 입력해주세요" class="form-box" type="text" name="boardPass"><br>
				</div>
			<div class="btn-box">
				<button type="submit">등록</button>
			</div>
		</form>
	</div>
	
</body>
</html>