$(function () {

    $('#login_submit').click(function () {
        if (!validLogin()) {
            return;
        }
        let username = $.trim($("#username").val());
        let password = $.trim($("#password").val());
        let loginType = $("#role option:selected").val();
        $.ajax({
            type: 'POST',
            url: 'login',
            cache: false,
            dataType:'json',
            data: {username, password, loginType},
            success: function (data) {
                $("#modal_info").modal("hide");//关闭模糊框
                let mmData = eval("("+data+")");
                if(mmData.success==true){
                    window.location.href = loginType;
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
    let flag = true;
    let username = $.trim($("#username").val());
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

    let password = $.trim($("#password").val());
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