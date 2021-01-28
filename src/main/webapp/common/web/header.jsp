<%@ page import="com.laptrinhjavaweb.util.SecurityUtil" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<header>
      <div class="container pt-4">
        <nav class="navbar navbar-expand-lg navbar-dark bg-transparent px-0"><a class="text-white navbar-brand" href="#">Digital Agency</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#da-navbarNav" aria-controls="da-navbarNav" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
          <div class="collapse navbar-collapse text-uppercase" id="da-navbarNav">
            <ul class="navbar-nav ml-auto">
              <li class="nav-item"><a class="nav-link smooth-scroll" href="#">Home</a></li>
              <li class="nav-item"><a class="nav-link smooth-scroll" href="#services">Services</a></li>
              <li class="nav-item"><a class="nav-link smooth-scroll" href="#projects">Projects</a></li>
              <li class="nav-item"><a class="nav-link smooth-scroll" href="#gallery">Gallery</a></li>
              <li class="nav-item"><a class="nav-link smooth-scroll" href="#contact">Contact</a></li>
              <security:authorize access="isAnonymous()">
              <li class="nav-item"><a class="nav-link smooth-scroll" href="<c:url value="/dang-nhap"/>">Login</a></li>
              <li class="nav-item"><a class="nav-link smooth-scroll" href="<c:url value="/dang-ki"/>">Register</a></li>
              </security:authorize>
              
               <security:authorize access="isAuthenticated()">
              <li class="nav-item"><a class="nav-link smooth-scroll" href="#">Welcome, <%=SecurityUtil.getPrincipal().getFullName() %></a></li>
              <li class="nav-item"><a class="nav-link smooth-scroll" href="<c:url value="/thoat"/>">Exit</a></li>
              </security:authorize>
              
            </ul>
          </div>
        </nav>
      </div>
      <div class="da-home-page-text" data-aos="fade-right" data-aos-duration="1000">
        <div class="container">
          <div class="col-md-10 col-sm-12 px-0 mx-0">
            <h2 class="display-3" style="margin-left:-6px;">Digital Creative Agency</h2>
            <h3 class="h5 mt-3">Let us handle your Graphic Design and Web Design Needs</h3><a class="smooth-scroll btn btn-outline-light mt-4" href="#learn">Learn More</a>
          </div>
        </div>
      </div>
    </header>