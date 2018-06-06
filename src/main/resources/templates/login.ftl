<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Management system of part Trading Center</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="components/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="components/font-awesome/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="components/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="css/AdminLTE.min.css">
    <link rel="stylesheet" href="components/iCheck/square/blue.css">
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="#"><b>PTC-MS</b> Admin</a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">请登录</p>

        <form>
            <div class="form-group has-feedback">
                <input type="text" class="form-control" placeholder="用户名" id="username">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
                <label class="control-label" for="username" style="display:none;"></label>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" placeholder="密码" id="password">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                <label class="control-label" for="password" style="display:none;"></label>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    <select id="role" class="form-control">
                        <option disabled selected hidden>请选择角色</option>
                        <option value="admin">管理员</option>
                        <option value="trader">交易员</option>
                        <option value="supplier">供应商</option>
                        <option value="customer">顾&nbsp;&nbsp;&nbsp;&nbsp;客</option>
                    </select>
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <input type="button" class="btn btn-primary btn-block btn-flat" id="login_submit" value="登录"/>
                </div>
                <!-- /.col -->
            </div>
        </form>

    </div>
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->


<div class="modal fade" id="modal_info" tabindex="-1" role="dialog" aria-labelledby="addModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="infoModalLabel">提示</h4>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-lg-12" id="div_info"></div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" id="btn_info_close" data-dismiss="modal"><i class="fa fa-close"></i>关闭</button>
            </div>
        </div>
    </div>
</div>
<script src="components/jquery/jquery.min.js"></script>
<script src="components/bootstrap/js/bootstrap.min.js"></script>
<script src="js/adminlte.min.js"></script>
<script src="components/iCheck/icheck.min.js"></script>
<script>
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' /* optional */
        });
    });
</script>
<script src="js/login.js"></script>
</body>
</html>