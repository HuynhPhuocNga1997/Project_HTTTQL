<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="<c:url value=" /resources/vendors/bootstrap/dist/css/bootstrap.min.css "/>" rel="stylesheet">
            <link href="<c:url value=" /resources/vendors/font-awesome/css/font-awesome.min.css "/> " rel="stylesheet">
            <link href="<c:url value=" /resources/vendors/nprogress/nprogress.css "/> " rel="stylesheet">
            <link href="<c:url value=" /resources/vendors/iCheck/skins/flat/green.css "/> " rel="stylesheet">
            <link href="<c:url value=" /resources/vendors/datatables.net-bs/css/dataTables.bootstrap.min.css "/>" rel="stylesheet">
            <link href="<c:url value=" /resources/vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css "/>" rel="stylesheet">
            <link href="<c:url value=" /resources/vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css "/>" rel="stylesheet">
            <link href="<c:url value=" /resources/vendors/datatables.net-responsive-bs/css/responsive.bootstrap.min.css "/>" rel="stylesheet">
            <link href="<c:url value=" /resources/vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css "/>" rel="stylesheet">
            <link href="<c:url value=" /resources/build/css/custom.min.css "/>" rel="stylesheet">
            <title>quản lý nhà cung cấp</title>
        </head>

        <body class="nav-md">
            <div class="container body">
                <div class="main_container">

                    <div class="col-md-3 left_col">
                        <div class="left_col scroll-view">
                            <div class="navbar nav_title" style="border: 0;">
                                <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>Gentelella Alela!</span></a>
                            </div>

                            <div class="clearfix"></div>

                            <br />
                            <!-- sidebar menu -->
                            <c:import url="menu.jsp" />
                            <!-- sidebar menu -->

                            <!-- /menu footer buttons -->
                            <!-- /menu footer buttons -->
                        </div>
                    </div>

                    <!--Top navigation-->
                    <div class="top_nav">
                        <div class="nav_menu">
                            <nav>
                                <div class="nav toggle">
                                    <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                                </div>

                                <ul class="nav navbar-nav navbar-right">
                                    <li class="">
                                        <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="images/img.jpg" alt="">John Doe
                    <span class=" fa fa-angle-down"></span>
                  </a>
                                        <ul class="dropdown-menu dropdown-usermenu pull-right">
                                            <li><a href="javascript:;"> Profile</a></li>
                                            <li>
                                                <a href="javascript:;">
                        <span class="badge bg-red pull-right">50%</span>
                        <span>Settings</span>
                      </a>
                                            </li>
                                            <li><a href="javascript:;">Help</a></li>
                                            <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                                        </ul>
                                    </li>

                                    <li role="presentation" class="dropdown">
                                        <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                    <i class="fa fa-envelope-o"></i>
                    <span class="badge bg-green">6</span>
                  </a>
                                        <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                                            <li>
                                                <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                                            </li>
                                            <li>
                                                <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                                            </li>
                                            <li>
                                                <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                                            </li>
                                            <li>
                                                <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                                            </li>
                                            <li>
                                                <div class="text-center">
                                                    <a>
                          <strong>See All Alerts</strong>
                          <i class="fa fa-angle-right"></i>
                        </a>
                                                </div>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                    </div>


                    <!-- page content -->
                    <div class="right_col" role="main">
                        <div class="">
                            <div class="clearfix"></div>

                            <div class="row">
                                <div class="col-md-12 col-sm-12 col-xs-12">
                                    <div class="x_panel">
                                        <div class="x_title">
                                            <h3>Quản lý nhà cung cấp</h3>
                                            <div style="padding-left: 870px;"><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#themncc"><span class="glyphicon glyphicon-plus"></span>Thêm nhà cung cấp</button>
                                            </div>


                                            <ul class="nav navbar-right panel_toolbox">
                                                <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                                </li>
                                                <li><a class="close-link"><i class="fa fa-close"></i></a>
                                                </li>
                                            </ul>
                                            <div class="clearfix"></div>
                                        </div>
                                        <div class="x_content">


                                            <div class="col-md-12 col-sm-12 col-xs-12">

                                                <div class="x_panel">

                                                    <div class="x_title">
                                                        <h2>Danh sách nhà cung cấp</h2>
                                                        <ul class="nav navbar-right panel_toolbox">
                                                            <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                                            </li>

                                                            <li><a class="close-link"><i class="fa fa-close"></i></a>
                                                            </li>
                                                        </ul>
                                                        <div class="clearfix"></div>
                                                    </div>
                                                    <div class="x_content">
                                                        <table id="datatable-buttons" class="table table-striped table-bordered">
                                                            <thead>
                                                                <tr>
                                                                    <th>Mã nhà cung cấp</th>
                                                                    <th>Tên nhà cung cấp</th>
                                                                    <th>Địa chỉ</th>
                                                                    <th>Số điện thoại</th>
                                                                    <th>Thao tác</th>
                                                                </tr>
                                                            </thead>


                                                            <tbody>
                                                                <c:if test="${!empty list_nhacc}">
                                                                    <c:forEach items="${list_nhacc}" var="nhacc">
                                                                        <tr>
                                                                            <td>${nhacc.manhacungcap}</td>
                                                                            <td>${nhacc.tennhacc}</td>
                                                                            <td>${nhacc.diachi}</td>
                                                                            <td>${nhacc.sodienthoai }</td>
                                                                            <td><a class="btn btn-primary btn-xs" href="<c:url value="/xemthongtin/${nhacc.manhacungcap}"/>"><span class="glyphicon glyphicon-folder-open"></span> Xem thông tin</a>
                                                                                <a class="btn btn-info btn-xs" href="<c:url value="/xemthongtin/${nhacc.manhacungcap}"/>"><span class="glyphicon glyphicon-edit" ></span> Sửa</a>
                                                                                <a class="btn btn-danger btn-xs" data-toggle="modal" data-target="#xoanhacc"><span class="glyphicon glyphicon-trash"></span> Xóa</a></td>
                                                                        </tr>
                                                                    </c:forEach>
                                                                </c:if>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>


                                        </div>
                                    </div>
                                </div>
                                <!-- /page content -->
                            </div>
                        </div>

                        <!--Modal them nha cc-->
                        <div class="container">

                            <!--Model thêm-->
                            <div class="modal fade" id="themncc" role="dialog">
                                <div class="modal-dialog">

                                    <!-- Modal content-->
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                            <h3 class="modal-title">Thêm nhà cung cấp</h3>
                                        </div>
                                        <div class="modal-body">
                                            <form action="">
                                                <label for="mancc">Mã nhà cung cấp *</label>
                                                <input type="text" class="form-control" name="manhacungcap">
                                                <label for="tenncc">Tên nhà cung cấp *</label>
                                                <input type="text" class="form-control" name="tennhacungcap">
                                                <label for="mancc">Số điện thoại nhà cung cấp *</label>
                                                <input type="number" class="form-control" name="sdtnhacungcap">
                                                <label for="mancc">Địa chỉ nhà cung cấp *</label>
                                                <br>
                                                <textarea rows="5" class="form-control"></textarea>
                                                <br>
                                                <div style="text-align: center"><button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Thêm</button></div>
                                            </form>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                        </div>
                                    </div>

                                </div>
                            </div>

                            <!--Model xóa-->

                            <div class="modal fade" id="xoanhacc" role="dialog">
                                <div class="modal-dialog">

                                    <!-- Modal content-->
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                            <h3 class="modal-title">Xóa nhà cung cấp</h3>
                                        </div>
                                        <div class="modal-body">
                                            <h4>Bạn có chắt muốn xóa nhà cung cấp???</h4>
                                        </div>
                                        <div class="modal-footer">
                                            <button class="btn btn-danger"><span class="glyphicon glyphicon-ok	
"></span> Có</button>
                                            <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Không</button>
                                        </div>
                                    </div>

                                </div>
                            </div>

                        </div>
                    </div>
                    <!-- page content -->
                </div>
            </div>

            <!-- jQuery -->
            <script src="<c:url value=" /resources/vendors/jquery/dist/jquery.min.js " />"></script>

            <!-- Bootstrap -->
            <script src="<c:url value=" /resources/vendors/bootstrap/dist/js/bootstrap.min.js " />"></script>
            <!-- FastClick -->
            <script src="<c:url value=" /resources/vendors/fastclick/lib/fastclick.js " />"></script>">

            <!-- NProgress -->
            <script src="<c:url value=" /resources/vendors/nprogress/nprogress.js " />"></script>
            <!-- iCheck -->
            <script src="<c:url value=" /resources/vendors/iCheck/icheck.min.js " />"></script>
            <!-- Datatables -->
            <script src="<c:url value=" /resources/vendors/datatables.net/js/jquery.dataTables.min.js " />"></script>
            <script src="<c:url value=" /resources/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js " />"></script>
            <script src=" <c:url value=" /resources/vendors/datatables.net-buttons/js/dataTables.buttons.min.js " />"></script>
            <script src="<c:url value=" /resources/vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js " />"></script>
            <script src=" <c:url value=" /resources/vendors/datatables.net-buttons/js/buttons.flash.min.js " />"></script>
            <script src="<c:url value=" /resources/vendors/datatables.net-buttons/js/buttons.html5.min.js " />"></script>
            <script src="<c:url value=" /resources/vendors/datatables.net-buttons/js/buttons.print.min.js " />"></script>
            <script src="<c:url value=" /resources/vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js " />"></script>
            <script src="<c:url value=" /resources/vendors/datatables.net-keytable/js/dataTables.keyTable.min.js " />"></script>
            <script src="<c:url value=" /resources/vendors/datatables.net-responsive/js/dataTables.responsive.min.js " />"></script>
            <script src="<c:url value=" /resources/vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js " />"></script>
            <script src="<c:url value=" /resources/vendors/datatables.net-scroller/js/dataTables.scroller.min.js " />"></script>
            <script src="<c:url value=" /resources/vendors/jszip/dist/jszip.min.js " />"></script>
            <script src="<c:url value=" /resources/vendors/pdfmake/build/pdfmake.min.js " />"></script>
            <script src="<c:url value=" /resources/vendors/pdfmake/build/vfs_fonts.js " />"></script>
            <!-- Custom Theme Scripts -->
            <script src="<c:url value=" /resources/build/js/custom.min.js " />"></script>
        </body>

        </html>