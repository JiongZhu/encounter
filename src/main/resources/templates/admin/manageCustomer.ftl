<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>PTC-MS Admin</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="../components/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../components/font-awesome/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="../components/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="../components/jquery/dataTables/css/dataTables.bootstrap.min.css"/>
    <link rel="stylesheet" href="../css/AdminLTE.min.css">
    <link rel="stylesheet" href="../css/skins/skin-blue.min.css">
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
                            <img src="../images/user2-160x160.jpg" class="user-image" alt="User Image">
                            <!-- hidden-xs hides the username on small devices so only the image appears. -->
                            <span class="hidden-xs"></span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- The user image in the menu -->
                            <li class="user-header">
                                <img src="../images/user2-160x160.jpg" class="img-circle" alt="User Image">

                                <p>管理员
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
                    <img src="../images/user2-160x160.jpg" class="img-circle" alt="User Image">
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
                <li  class="active"><a href="manageCustomer"><i class="fa fa-users"></i> <span>顾客信息</span></a></li>
                <li><a href="manageSupplier"><i class="fa fa-user-cog"></i> <span>供应商信息</span></a></li>
                <li><a href="manageTrader"><i class="fa fa-user-tie"></i> <span>交易员信息</span></a></li>
                <li><a href="manageAdmin"><i class="fa fa-user-shield"></i> <span>管理员信息</span></a></li>
                <li><a href="managePart"><i class="fa fa-cogs"></i> <span>零件信息</span></a></li>
                <li><a href="manageAccommdate"><i class="fa fa-cart-plus"></i> <span>供应商供应信息</span></a></li>
                <li><a href="manageDemand"><i class="fa fa-shopping-basket"></i> <span>顾客需求信息</span></a></li>
                <li><a href="manageAdvice"><i class="fa fa-comments"></i> <span>交易建议信息</span></a></li>
                <li><a href="manageTransaction"><i class="fa fa-handshake"></i> <span>交易订单信息</span></a></li>
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
                顾客信息管理
            </h1>
            <ol class="breadcrumb">
                <li><a href="admin"><i class="fa fa-home"></i> 首页</a></li>
                <li class="active"><i class="fa fa-graduation-cap"></i> 顾客信息管理</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content container-fluid">
            <div class="row">
                <div class="col-xs-12">
                    <div class="box">
                        <div class="box-body">
                            <table id="example" class="table table-striped table-bordered table-hover table-condensed">
                            </table>
                        </div>
                    </div>
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

<script type="text/javascript" src="../components/jquery/jquery.min.js"></script>
<script type="text/javascript" src="../components/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/adminlte.min.js"></script>
<script type="text/javascript" src="../components/font-awesome/js/fontawesome-all.min.js"></script>
<script type="text/javascript" src="../components/jquery/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../components/jquery/dataTables/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
        $('#example').DataTable({
            "bProcessing": false, //DataTables载入数据时，是否显示‘进度’提示
            "bServerSide": false, //是否启动服务器端数据导入
            "bStateSave": false, //是否打开客户端状态记录功能,此功能在ajax刷新纪录的时候不会将个性化设定回复为初始化状态
            "bDeferRender": true,//是否延迟渲染
            "iDisplayLength": 4, //默认显示的记录数
            "bLengthChange": false, //每页记录数选择
            "bAutoWidth": true, //是否自适应宽度
            "bScrollCollapse": true, //是否开启DataTables的高度自适应，当数据条数不够分页数据条数的时候，插件高度是否随数据条数而改变
            "bPaginate": true, //是否显示（应用）分页器
            "bInfo": true, //是否显示页脚信息，DataTables插件左下角显示记录数
            "sPaginationType": "full_numbers", //详细分页组，可以支持直接跳转到某页
            "bSort": true, //是否启动各个字段的排序功能
            "aaSorting": [[1, "asc"]], //默认的排序方式，第2列，升序排列
            "bFilter": true, //是否启动过滤、搜索功能
            "sScrollX": "100%", //表格宽度
            "sScrollXInner": "100%", //表格内容宽度
            "asStripeClasses": [ 'odd', 'even'],
            "dom": "<'toolbar'><'top'f>t<'bottom'ip>",
            "aoColumns": [
                {
                    "mDataProp": "id",
                    "sTitle": "ID",
                    "sDefaultContent": "", //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                    "bVisible": false //此列不显示
                },
                {
                    "mDataProp": "cusNo",
                    "sTitle": "顾客编号",
                    "sDefaultContent": "",
                    "sClass": "center"
                },
                {
                    "mDataProp": "cusName",
                    "sTitle": "顾客姓名",
                    "sDefaultContent": "",
                    "sClass": "center"
                },
                {
                    "mDataProp": "cusTel",
                    "sTitle": "联系电话",
                    "sDefaultContent": "",
                    "sClass": "center"
                },
                {
                    "mDataProp": "cusAddress",
                    "sTitle": "顾客地址",
                    "sDefaultContent": "",
                    "sClass": "center"
                },
                {
                    "sTitle": "操作",
                    "bSortable": false,
                    "sDefaultContent": "",
                    render: function() {
                        return[
                            '<button id="TableEditor" type="button" class="btn btn-warning btn-xs"><i class="fas fa-xs fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'+
                            '<button id="TableDelete" type="button" class="btn btn-danger btn-xs"><i class="fas fa-xs fa-trash"></i></button>'
                        ]
                    }
                }
            ],
            "oLanguage": {
                "sProcessing": "正在获取数据，请稍后...",
                "sLoadingRecords": "正在加载，请稍后...",
                "sLengthMenu": "显示 _MENU_ 条",
                "sZeroRecords": "没有您要搜索的内容",
                "sEmptyTable": "表格中没有数据",
                "sInfo": "总共_PAGES_页，显示第 _START_ 到 _END_ 条，筛选之后得到 _TOTAL_ 条，初始 _MAX_ 条",
                "sInfoEmpty": "记录数为0",
                "sInfoFiltered": "(全部记录数 _TOTAL_ 条)",
                "sInfoPostFix": "",
                "sSearch": '<i class="fas fa-search"></i>',
                "sUrl": "",
                "oPaginate": {
                    "sFirst": "&laquo;",
                    "sPrevious": "&lsaquo;",
                    "sNext": "&rsaquo;",
                    "sLast": "&raquo;"
                },
                "oAria": {
                    "sSortAscending":  ": 以升序排列此列",
                    "sSortDescending": ": 以降序排列此列"
                }
            },
            "sAjaxSource": "/customer/showAll" //请求资源路径
        });
        $("div.toolbar").html("<div class='col-md-3 col-sm-4'><button class='btn btn-default btn-sm' id='btn_add' data-toggle='modal' data-target='#addModal'><i class='fa fa-fw fa-user-plus'></i></button> 添加顾客</div>");
    });
</script>
</body>
</html>