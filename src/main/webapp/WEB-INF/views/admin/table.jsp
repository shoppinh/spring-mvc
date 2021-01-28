<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin - Tables</title>

</head>

<body id="page-top">


	<div id="wrapper">

		<!-- Sidebar -->
		<ul class="sidebar navbar-nav">
			<li class="nav-item"><a class="nav-link"
				href="<c:url value="/quan-tri/trang-chu"/>"> <i
					class="fas fa-fw fa-tachometer-alt"></i> <span>Dashboard</span>
			</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="pagesDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <i class="fas fa-fw fa-folder"></i> <span>Pages</span>
			</a>
				<div class="dropdown-menu" aria-labelledby="pagesDropdown">
					<h6 class="dropdown-header">Login Screens:</h6>
					<a class="dropdown-item" href="login.html">Login</a> <a
						class="dropdown-item" href="register.html">Register</a> <a
						class="dropdown-item" href="forgot-password.html">Forgot
						Password</a>
					<div class="dropdown-divider"></div>
					<h6 class="dropdown-header">Other Pages:</h6>
					<a class="dropdown-item" href="404.html">404 Page</a> <a
						class="dropdown-item" href="blank.html">Blank Page</a>
				</div></li>
			<li class="nav-item"><a class="nav-link" href="charts.html">
					<i class="fas fa-fw fa-chart-area"></i> <span>Charts</span>
			</a></li>
		</ul>

		<div id="content-wrapper">

			<div class="container-fluid">

				<!-- Breadcrumbs-->
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="#">Dashboard</a></li>
					<li class="breadcrumb-item active">Tables</li>
				</ol>
				<!-- Edit Modal HTML -->
				<div class="modal-content">
					<form:form role="form" id="editForm1" modelAttribute="model">

						<c:if test="${not empty model.maNV}">
							<div class="modal-header">
								<h4 class="modal-title">Edit Employee</h4>
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
							</div>
						</c:if>
						<c:if test="${ empty model.maNV}">
							<div class="modal-header">
								<h4 class="modal-title">Add Employee</h4>
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
							</div>
						</c:if>
						<div class="modal-body">
							<div class="form-group">
								<label>MaNV</label>
								<form:input path="maNV" cssClass="form-control" />
							</div>
							<div class="form-group">
								<label>TenNV</label>
								<form:input path="tenNV" cssClass="form-control" />
							</div>
							<div class="form-group">
								<label>ChucVu</label>
								<form:input path="chucVu" cssClass="form-control" />
							</div>
							<div class="form-group">
								<label>MieuTa</label>
								<form:input path="mieuTa" rows="5" cols="10"
									cssClass="form-control" />
							</div>
							<div class="form-group">
								<label>Luong</label>
								<form:input path="luong" cssClass="form-control" />
							</div>
						</div>
						<div class="modal-footer">
							<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel"> 
							<c:if test="${not empty model.maNV}">
							<input type="button" class="btn btn-info" value="Save" id="btnAddOrUpdate">

							</c:if>
							<c:if test="${empty model.maNV}">
							<input type="button" class="btn btn-info" value="Add" id="btnAddOrUpdate">

							</c:if>
						</div>
					</form:form>
				</div>
			</div>
			<!-- /.container-fluid -->

			<!-- Sticky Footer -->
			<footer class="sticky-footer">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright © Your Website 2019</span>
					</div>
				</div>
			</footer>

		</div>
		<!-- /.content-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="<c:url value="/thoat"/>">Logout</a>
				</div>
			</div>
		</div>
	</div>

	<!-- Add Modal HTML -->
	<div id="addEmployeeModal" class="modal fade"></div>






</body>
<style>
.card-header .btn {
	color: #fff;
	float: right;
	font-size: 14px;
	border: none;
	min-width: 50px;
	border-radius: 2px;
	border: none;
	outline: none !important;
	margin-left: 10px;
}

.card-header .btn i {
	float: left;
	font-size: 21px;
	margin-right: 5px;
}

.card-header .btn span {
	float: left;
	margin-top: 2px;
}
</style>

</html>