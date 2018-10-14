/**
 * 
 */
// 验证确认密码
function validateLoginpass() {
	var UserPwd = document.getElementById("UserPwd").value;
	var IsPwd = document.getElementById("IsPwd").value;
	if (UserPwd.length < 5 || UserPwd.length > 16) {
		window.alert("Password must be between 5 and 16!");
		form.UserPwd.focus();
		return false;
	} else if (UserPwd != IsPwd) {
		window.alert("The password you entered twice is inconsistent!");
		form.IsPwd.focus();
		return false;
	} else {
		return true;
	}
}

//校验手机号码
function validatemobile() {
	var Tel = document.getElementById("UserTel").value;
	var tel = /^1[3|4|5|7|8][0-9]{9}$/;
	if (Tel.length != 11) {
		window.alert("请输入有效的手机号码!");
		form.Tel.focus();
		return false;
	} else if (!tel.test(Tel)) {
		window.alert("请输入有效的手机号码!");
		form.Tel.focus();
		return false;
	} else {
		return true;
	}
}

function checkAll() {
	if (validateLoginpass() && validatemobile()) {
//		alert("ok");
		return true;
	} else {
//		alert("error");
		return false;
	}
}