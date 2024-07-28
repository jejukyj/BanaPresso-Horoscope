<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/css/upform.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>운세 수정하기</title>
</head>
<body>
	<img class="bana-pic" src="/resources/img/bana-img-logo-symbol2.png" alt="BanaPresso" onclick="location.href='/board/list'" />
	<div class="box">
	<div class="title">오늘의 운세는?</div>
		<form method="post">
		<input type="hidden" name="id" value="${board.id }">
			<div class="upform-container">
			<span>작성자</span><br>
				<input class="upform-box" type="text" name="boardWriter" value="${board.boardWriter }"><br>
				<span>운세</span><br>
				<input class="luck-box" type="text" name="boardContents" value="${board.boardContents }"><br>
				<span>비밀번호</span><br>
				<input class="upform-box" type="text" name="boardPass" value="${board.boardPass }"><br>
			</div>
			<div class="btn-box">
				<button class="btn-upform" type="submit">수정</button>
				<button class="btn-delete" type="button" onclick="location.href='delete?id=${board.id}'">삭제</button>
			</div>
		</form>
	</div>
</body>
</html>