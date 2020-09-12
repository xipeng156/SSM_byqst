$(document).ready(function () {
    $.ajax(
        {
            url: "/getAll",
            type: "GET",
            success: function (data) {
                data = eval(data);
                data.forEach(function (data,index){
                    // 表格形式输出
                    console.table(data,index);
                    $("#userList").append("<li>"+data.userID+" ----> "+data.userPwd+"</li>");
                });
            }
        }
    )
    console.log($("#userList"))
})