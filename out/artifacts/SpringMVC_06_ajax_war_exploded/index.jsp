<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/jquery.js"></script>
  </head>
  <body>
  <button type="submit" id="btn">提交</button>
  </body>
  <script>
    $("#btn").click(function (){
      $.post("${pageContext.request.contextPath}/a1",function (data){
        console.log(data);
      })
    })
  </script>
</html>
