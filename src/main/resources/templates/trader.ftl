<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>PTC-MS Trader</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="components/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="components/font-awesome/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="components/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="css/AdminLTE.min.css">
    <link rel="stylesheet" href="css/skins/skin-blue.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <!-- Main Header -->
    <header class="main-header">

        <!-- Logo -->
        <a href="index2.html" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>P</b>TC</span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>零件交易中心</b>管理系统</span>
        </a>

        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>
            <!-- Navbar Right Menu -->
            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- User Account Menu -->
                    <li class="dropdown user user-menu">
                        <!-- Menu Toggle Button -->
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <!-- The user image in the navbar-->
                            <img src="images/user2-160x160.jpg" class="user-image" alt="User Image">
                            <!-- hidden-xs hides the username on small devices so only the image appears. -->
                            <span class="hidden-xs"></span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- The user image in the menu -->
                            <li class="user-header">
                                <img src="images/user2-160x160.jpg" class="img-circle" alt="User Image">

                                <p>交易员
                                    <small>Member since Mar. 2018</small>
                                </p>
                            </li>
                            <!-- Menu Body -->
                            <li class="user-body">
                                <div class="row">
                                    <div class="col-xs-4 text-center">
                                        <a href="#updateinfo" class="btn btn-default btn-flat" data-toggle="modal">个人资料</a>
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <a href="#updatepwd" class="btn btn-default btn-flat" data-toggle="modal">修改密码</a>
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <a href="admin/adminLogout" class="btn btn-default btn-flat">退出</a>
                                    </div>
                                </div>
                                <!-- /.row -->
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">

        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">

            <!-- Sidebar user panel (optional) -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="images/user2-160x160.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p></p>
                    <!-- Status -->
                    <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                </div>
            </div>

            <!-- Sidebar Menu -->
            <ul class="sidebar-menu" data-widget="tree">
                <li class="header">菜单导航</li>
                <!-- Optionally, you can add icons to the links -->
                <li class="active"><a href="trader/manageDemand"><i class="fa fa-shopping-basket"></i> <span>顾客需求信息</span></a></li>
                <li><a href="trader/manageAccommdate"><i class="fa fa-cart-plus"></i> <span>供应商供应信息</span></a></li>
                <li><a href="trader/manageAdvice"><i class="fa fa-comments"></i> <span>交易建议信息</span></a></li>
                <li><a href="trader/manageTransaction"><i class="fa fa-handshake"></i> <span>交易订单信息</span></a></li>
                <li><a href="trader/manageTrader"><i class="fa fa-user-tie"></i> <span>交易员个人信息</span></a></li>
            </ul>
            <!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                交易员管理首页
                <small>功能描述</small>
            </h1>
            <ol class="breadcrumb">
                <li class="active"><a href="admin/admin"><i class="fa fa-home"></i> 首页</a></li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content container-fluid">
            <div class="row">

                <div class="col-md-4">
                    <div class="box box-default">
                        <div class="box-header with-border">
                            <h3 class="box-title">顾客需求信息管理</h3>

                            <div class="box-tools pull-right">
                                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                                </button>
                            </div>
                            <!-- /.box-tools -->
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <ul class="list-unstyled">
                                <li><i class="fa fa-eye"></i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;查看需求信息</li>
                                <br/>
                                <br/>
                            </ul>
                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>

                <div class="col-md-4">
                    <div class="box box-default">
                        <div class="box-header with-border">
                            <h3 class="box-title">供应商供应信息管理</h3>

                            <div class="box-tools pull-right">
                                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                                </button>
                            </div>
                            <!-- /.box-tools -->
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <ul class="list-unstyled">
                                <li><i class="fa fa-eye"></i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;查看供应信息</li>
                                <br/>
                                <br/>
                            </ul>
                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>

                <div class="col-md-4">
                    <div class="box box-default">
                        <div class="box-header with-border">
                            <h3 class="box-title">交易建议管理</h3>

                            <div class="box-tools pull-right">
                                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                                </button>
                            </div>
                            <!-- /.box-tools -->
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <ul class="list-unstyled">
                                <li><i class="fa fa-fw fa-user-plus"></i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;添加交易建议</li>
                                <li><i class="fa fa-fw fa-edit"></i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;修改交易建议</li>
                                <li><i class="fa fa-fw fa-trash"></i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除交易建议</li>
                            </ul>
                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>

                <div class="col-md-4">
                    <div class="box box-default">
                        <div class="box-header with-border">
                            <h3 class="box-title">交易订单管理</h3>

                            <div class="box-tools pull-right">
                                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                                </button>
                            </div>
                            <!-- /.box-tools -->
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <ul class="list-unstyled">
                                <li><i class="fa fa-fw fa-plus"></i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;添加新的订单</li>
                                <li><i class="fa fa-fw fa-eye"></i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;查看历史订单</li>
                                <li><i class="fa fa-fw fa-clipboard-check"></i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单完成入库</li>
                            </ul>
                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>

                <div class="col-md-4">
                    <div class="box box-default">
                        <div class="box-header with-border">
                            <h3 class="box-title">交易员个人信息管理</h3>

                            <div class="box-tools pull-right">
                                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                                </button>
                            </div>
                            <!-- /.box-tools -->
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <ul class="list-unstyled">
                                <li><i class="fa fa-fw fa-edit"></i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;修改个人信息</li>
                                <br/>
                                <br/>
                            </ul>
                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>
            </div>
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <!-- Main Footer -->
    <footer class="main-footer">
        <!-- To the right -->
        <div class="pull-right hidden-xs">
            <b>Version</b> 1.0.0
        </div>
        <!-- Default to the left -->
        <strong>Copyright &copy; 2017-2018 <a href="#">PTC</a>.</strong> All rights reserved.
    </footer>
</div>
<script type="text/javascript" src="components/jquery/jquery.min.js"></script>
<script type="text/javascript" src="components/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/adminlte.min.js"></script>
</body>
</html>