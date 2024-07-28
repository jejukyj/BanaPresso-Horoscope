<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="/css/list.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<meta charset="UTF-8">
<title>오늘의 운세</title>
</head>
<body>
	<img class="bana-pic" src="/resources/img/bana-img-logo-symbol2.png" alt="BanaPresso"/>
	<div class="box">
	
	<c:if test="${ !empty list }">
		<div class="cover">
		<span class="h">오늘의 운세를 공유해보세요</span>
		<span class="material-icons" onclick="location.href='form'">add</span>
		</div>
		<c:forEach items="${list }" var = "board">
			<div class="container" onclick="location.href='/board/password?id=${board.id}'">
				<div class="luck">${board.boardContents }</div>
				<div class="writer">${board.boardWriter }</div>
				<div class="date">${board.createdAt }</div>
			</div>
		</c:forEach>
	</c:if>
	
		<c:if test="${empty list }">
			<span class="h">오늘의 운세를 공유해보세요</span>
			<img class="ethi-pic" src="/resources/img/img-baby-ethi.png" alt="Ethi"/>
			<div class="not">등록된 운세가 없습니다</div>
			<button type="button" onclick="location.href='form'">운세 등록하기</button>
		</c:if>
		<br>
	</div>
</body>
</html>