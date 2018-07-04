$(function () {
    $("#submit").click(function () {
        console.log(localhostPath+"/doLogin"+$("#form").serialize());
        $.get({
            url:"http://127.0.0.1:8080/doLogin",
            data:$("#form").serialize(),
            success:function(data) {
                console.log(data);
                if (data=='1') {
                    window.location=localhostPath+"/";
                }else {
                    alert("密码错误！");
                }
        },
            error:function (data) {
                alert("服务器异常！")
            }
        });
    });
});