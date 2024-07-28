<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="/css/password.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>비밀번호</title>

</head>
<body>
	<img class="bana-pic" src="/resources/img/bana-img-logo-symbol2.png" alt="BanaPresso" onclick="location.href='/board/list'" />
	<div class="box">
		<div class="title">비밀번호를 입력해주세요</div>
		<form method="post" action="/board/password">
			<div class="pw-container">
				<input type="hidden" name="id" value="${ board.id }">
				<input type="password" name="boardPass"><br>
			</div>
			<div class="btn-box">
				<button type="submit">입력</button>
			</div>
		</form>
		
		<c:if test="${ !empty check }">
			<c:if test="${ !check }">
				<script type="text/javascript">alert("비밀번호가 틀렸습니다.")</script>
			</c:if>
		</c:if>
	</div>
</body>
</html>