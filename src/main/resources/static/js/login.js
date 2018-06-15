$(function () {

    $('#login_submit').click(function () {
        if (!validLogin()) {
            return;
        }

        $.ajax({
            type: 'POST',
            url: 'login',
            cache: false,
            dataType:'json',
            data: {
                username: $.trim($("#username").val()),
                password: $.trim($("#password").val()),
                loginType: $("#role option:selected").val()
            },
            success: function (data) {
                $("#modal_info").modal("hide");//关闭模糊框
                var mmData = eval("("+data+")");
                if(mmData.success==true){
                    window.location.href = "$('#role option:selected').val()";
                }else{
                    showInfo(mmData.success);
                }
            },
            error: function (jqXHR, textStatus, errorThrown) {
                showInfo("提交失败，请重试");
            }
        });
    });


});

function validLogin() {
    var flag = true;

    var username = $.trim($("#username").val());
    if (username == "") {
        $('#username').parent().addClass("has-error");
        $('#username').next().next().html("<i class='fa fa-times-circle-o'></i>    请输入账号");
        $("#username").next().next().show();
        flag = false;
    } else if (username.length!=6) {
        $("#username").parent().addClass("has-error");
        $("#username").next().next().html("<i class='fa fa-times-circle-o'></i>    账号长度输入有误，请检查");
        $("#username").next().next().show();
        flag = false;
    } else {
        $('#username').parent().removeClass("has-error");
        $('#username').next().next().html("");
        $("#username").next().next().hide();
    }

    var password = $.trim($("#password").val());
    if (password == "") {
        $('#password').parent().addClass("has-error");
        $('#password').next().next().html("<i class='fa fa-times-circle-o'></i>    请输入密码");
        $("#password").next().next().show();
        flag = false;
    } else if (password.length<6 || password.length > 20) {
        $("#password").parent().addClass("has-error");
        $("#password").next().next().html("<i class='fa fa-times-circle-o'></i>    密码长度必须在6~20位之间");
        $("#password").next().next().show();
        flag = false;
    } else {
        $('#password').parent().removeClass("has-error");
        $('#password').next().next().html("");
        $("#password").next().next().hide();
    }
    return flag;
}

function showInfo(msg) {
    $("#div_info").text(msg);
    $("#modal_info").modal('show');
}