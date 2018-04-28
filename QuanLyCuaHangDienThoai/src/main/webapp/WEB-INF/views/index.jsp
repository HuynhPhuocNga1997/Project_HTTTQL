<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Bootstrap -->
    <link href="<c:url value="resources/vendors/bootstrap/dist/css/bootstrap.min.css"/>" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="<c:url value="resources/vendors/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet">
    <!-- NProgress -->
    <link href="<c:url value="resources/vendors/nprogress/nprogress.css"/>" rel="stylesheet">
    <!-- Animate.css -->
    <link href="<c:url value="resources/vendors/animate.css/animate.min.css"/>" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="<c:url value="resources/build/css/custom.min.css"/>" rel="stylesheet">
<title>đăng nhập</title>
</head>
 <body class="login">
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form>
              <h1>Đăng nhập</h1>
              <div>
                <input type="email" class="form-control" placeholder="Username" required="required"/>
              </div>
              <div>
                <input type="password" class="form-control" placeholder="Password" required="required"/>
              </div>
              <div>
                <button type="submit" class="btn btn-default">Đăng nhập</button>
                <a class="reset_pass" href="#">Lost your password?</a>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                

                <div class="clearfix"></div>
                <br />

                <div>
                  <h1><i class="fa fa-paw"></i> Quản lý cửa hàng điện thoại!</h1>
                   <p>©2018 All Rights Reserved. Group 03-HTTTQL Cô Châu</p>
                </div>
              </div>
            </form>
          </section>
        </div>
      </div>
    </div>
  </body>
</html>