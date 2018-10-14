/**
 * 
 */
function login() {
	if (form.username.value == "") {
		alert("用户名不能为空！");
		return false;
	}
	if (form.userpwd.value == "") {
		alert("密码不能为空！");
		return false;
	}
}
$(function(){
	$(".validationCode_img").click(function(){
	    $(".validationCode_img").attr("src","/ReportSystem/Java Resources/src/com.qp.servlet/validationCode?"+Math.random());
	});
})
