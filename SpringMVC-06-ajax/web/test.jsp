<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.js"></script>
</head>
<body>
    <button type="submit" id="btn">点击填充表格</button>
    <table id="tab">
        <thead>
         <tr>
             <th>姓名</th>
             <th>年龄</th>
             <th>性别</th>
         </tr>
        </thead>
        <tbody id="content">
        </tbody>
    </table>
    <script>
        $("#btn").click(function (){
            $.post("${pageContext.request.contextPath}/a1",function (data){

                var html="";
                for (let i = 0; i < data.length; i++) {
                    html+= "<tr>" +
                        "<td>" + data[i].name + "</td>" +
                        "<td>" + data[i].age + "</td>" +
                        "<td>" + data[i].sex + "</td>" +
                        "</tr>"
                }
                $("#content").html(html)
            })
        })
    </script>
</body>
</html>
