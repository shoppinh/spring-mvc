<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="bg-dark">
	<div class="container">
		<div class="card card-login mx-auto mt-5">
			<div class="card-header">Login</div>
			<div class="card-body">
				<div>
					<c:if test="${param.incorrectAccount != null}">
						<div class="alert alert-danger" role="alert">User or password is incorrect</div>
					</c:if>
				</div>
				
				<div>
					<c:if test="${param.accessDenied != null}">
						<div class="alert alert-danger" role="alert">You do not have permission</div>
					</c:if>
				</div>
				<form action="j_spring_security_check" id="formLogin"
						method="post">
					<div class="form-group">
						<div class="form-label-group">
							<input type="text" id="username" class="form-control" placeholder="Tên đăng nhập"
								name = "j_username" required="required">
								<label for="username">Username</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-label-group">
							<input type="password" id="password" class="form-control" placeholder="Mật khẩu"
								name="j_password" required="required"> <label
								for="password">Password</label>
						</div>
					</div>
					<button class="btn btn-primary btn-block" type="submit" name ="button">Login</button>
				</form>
				<div class="text-center">
          			<a class="d-block small mt-3" href="<c:url value="/dang-ki"/>">Register an Account</a>
       		 	</div>
			</div>
		</div>
	</div>
</body>
</html>