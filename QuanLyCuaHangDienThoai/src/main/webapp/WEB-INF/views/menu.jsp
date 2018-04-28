<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu</title>
</head>
<body>

    <!-- menu profile quick info -->
    <div class="profile clearfix">
        <div class="profile_pic">
            <img src="images/img.jpg" alt="..." class="img-circle profile_img">
        </div>
        <div class="profile_info">
            <span>Xin chào,</span>
            <h2>John Doe</h2>
        </div>
    </div>
    <!-- /menu profile quick info -->

    <br />

    <!-- sidebar menu -->
    <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
        <div class="menu_section">
            <h3>General</h3>
            <ul class="nav side-menu">
                <li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                        <li><a href="index.html">Dashboard</a></li>
                        <li><a href="index2.html">Dashboard2</a></li>
                        <li><a href="index3.html">Dashboard3</a></li>
                    </ul>
                </li>
                <li><a><i class="fa fa-edit"></i> Quản lý <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                        <li><a href="form.html">Quản lý nhân viên</a></li>
                        <li><a href="form.html">Quản lý hóa đơn</a></li>
                        <li><a href="form.html">Quản lý sản phẩm</a></li>
                        <li><a href='<c:url value="/quanlynhacungcap"/>'>Quản lý nhà cung cấp</a></li>
                        <li><a href="form.html">Quản lý kho</a></li>
                        <li><a href="form.html">Quản lý khách hàng</a></li>
                        <li><a href="form.html">Quản lý duyệt hàng</a></li>
                        <li><a href="form.html">Quản lý chấm công</a></li>
                    </ul>
                </li>
               

                <li><a><i class="fa fa-line-chart"></i>Thống kê<span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                        <li><a href="chartjs.html">Chart JS</a></li>
                        <li><a href="chartjs2.html">Chart JS2</a></li>
                        <li><a href="morisjs.html">Moris JS</a></li>
                        <li><a href="echarts.html">ECharts</a></li>
                        <li><a href="widgets.html">Biểu đồ thống kê 1</a></li>
                        <li><a href="other_charts.html">Other Charts</a></li>
                    </ul>
                </li>
                
                <li><a href="profile.html"><i class="fa fa-user"></i>Thông tin cá nhân<span class="fa fa-chevron-down"></span></a>
                   
                </li>
                <li><a href="contacts.html"><i class="fa fa-group"></i>Danh sách thành viên<span class="fa fa-chevron-down"></span></a>
                   
                </li>

            </ul>
        </div>
    </div>
    <!-- sidebar menu -->

    <!-- menu footer buttons -->
    <!-- menu footer buttons -->


    <!-- top navigation -->
    <!-- top navigation -->

    <!-- page content -->
    <!-- page content -->

    <!-- footer content -->
    <!-- footer content -->

</body>
</html>