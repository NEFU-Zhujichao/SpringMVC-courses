<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.js"></script>
</head>
<body>
<div>
    用户名：<input type="text" name="username" id="btn1"><span id="sp1"></span><br>
    密码：<input type="password" name="pwd" id="btn2"><span id="sp2"></span>
</div>
<script>
    $("#btn1").blur(function (){
        $.ajax({
            url:"${pageContext.request.contextPath}/a2",
            data:{username:$("#btn1").val()},
            success:function (data){
                if (data == "true"){
                    $("#sp1").html("OK")
                    $("#sp1").css("color","green")
                }else {
                    $("#sp1").html("用户名不存在")
                    $("#sp1").css("color","red")
                }
            }
        })
        }
    )
    $("#btn2").blur(function (){
            $.post({
                url:"${pageContext.request.contextPath}/a2",
                data:{pwd:$("#btn2").val()},
                success:function (data){
                    if (data == "true"){
                        $("#sp2").html("OK")
                        $("#sp2").css("color","green")
                    }else {
                        $("#sp2").html("密码错误")
                        $("#sp2").css("color","red")
                    }
                }
            })
        }
    )
</script>
</body>
</html>
