<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>注册-测试用户</title>
<link rel="stylesheet" type="text/css" media="screen"
	href="../css/screen.css" />
<script src="../jslib/jquery.js" type="text/javascript"></script>
<script src="../validate/jquery.validate.js" type="text/javascript"></script>
<spring:message
	code="com.zhanghl.mall.validation.username.NotEmpty.message"
	var="usernameNotEmpty" />
<spring:message code="com.zhanghl.mall.validation.username.Size.message"
	var="usernameSize" />
<spring:message
	code="com.zhanghl.mall.validation.password.NotEmpty.message"
	var="passwordNotEmpty" />
<spring:message code="com.zhanghl.mall.validation.password.Size.message"
	var="passwordSize" />
<spring:message
	code="com.zhanghl.mall.validation.password.NotEqual.message"
	var="passwordNotEqual" />
<spring:message
	code="com.zhanghl.mall.validation.email.NotEmpty.message"
	var="emailNotEmpty" />
<spring:message code="com.zhanghl.mall.validation.email.Format.message"
	var="emailFormat" />
<spring:message code="com.zhanghl.mall.validation.email.Size.message"
	var="emailSize" />
<spring:message
	code="com.zhanghl.mall.validation.recommendedBy.Size.message"
	var="recommendedBySize" />
<spring:message
	code="com.zhanghl.mall.validation.captcha.NotEmpty.message"
	var="captchaNotEmpty" />
<script type="text/javascript">
	var errorMessage = {
		"usernameNotEmpty" : "${usernameNotEmpty}",
		"usernameSize" : "${usernameSize}",
		"passwordNotEmpty" : "${passwordNotEmpty}",
		"passwordSize" : "${passwordSize}",
		"passwordNotEqual" : "${passwordNotEqual}",
		"emailNotEmpty" : "${emailNotEmpty}",
		"emailFormat" : "${emailFormat}",
		"emailSize" : "${emailSize}",
		"recommendedBySize" : "${recommendedBySize}",
		"captchaNotEmpty" : "${captchaNotEmpty}"
	};
</script>
<script type="text/javascript">
	$().ready(function() {
		// validate signup form on keyup and submit
		$("#signupForm").validate({
			rules : {
				username : {
					required : true,
					minlength : 4,
					maxlength : 20
				},
				password : {
					required : true,
					minlength : 6,
					maxlength : 16
				},
				retypePassword : {
					required : true,
					minlength : 6,
					maxlength : 16,
					equalTo : "#password"
				},
				email : {
					required : true,
					email : true,
					maxlength : 50
				},
				recommendedBy : {
					required : false,
					minlength : 4,
					maxlength : 20
				},
				captcha : "required"
			},
			messages : {
				username : {
					required : errorMessage.usernameNotEmpty,
					minlength : errorMessage.usernameSize,
					maxlength : errorMessage.usernameSize
				},
				password : {
					required : errorMessage.passwordNotEmpty,
					minlength : errorMessage.passwordSize,
					maxlength : errorMessage.passwordSize
				},
				retypePassword : {
					required : errorMessage.passwordNotEmpty,
					minlength : errorMessage.passwordSize,
					maxlength : errorMessage.passwordSize,
					equalTo : errorMessage.passwordNotEqual
				},
				email : {
					required : errorMessage.emailNotEmpty,
					email : errorMessage.emailFormat,
					maxlength : errorMessage.emailSize
				},
				recommendedBy : {
					minlength : errorMessage.recommendedBySize,
					maxlength : errorMessage.recommendedBySize
				},
				captcha : errorMessage.captchaNotEmpty
			}
		});
		// show when newsletter is checked
		newsletter.click(function() {
			topics[this.checked ? "removeClass" : "addClass"]("gray");
			topicInputs.attr("disabled", !this.checked);
		});
	});
</script>

<style type="text/css">
.redColor {
	color: red;
}

#signupForm {
	width: 670px;
}

#signupForm label.error {
	margin-left: 10px;
	width: auto;
	display: inline;
}

#newsletter_topics label.error {
	display: none;
	margin-left: 103px;
}
</style>
</head>
<body>
	<div id="main">
		<form:form modelAttribute="personForm" method="post"
			cssClass="cmxform" id="signupForm">
			<fieldset>
				<legend>个人用户注册</legend>
				<p>
					<form:label path="username">
						<b class="redColor">*</b>用户名：</form:label>
					<form:input path="username" />
					<spring:bind path="personForm.username">
						<c:if test="${status.error}">
							<label for="<c:out value="${status.expression}"/>"
								generated="true" class="error" style=""><c:out
									value="${status.errorMessages[0]}" /></label>
						</c:if>
					</spring:bind>
				</p>
				<p>
					<form:label path="password">
						<b class="redColor">*</b>设置密码：</form:label>
					<%-- 					<form:password path="password" value=""/> --%>
					<spring:bind path="personForm.password">
						<input id="password" type="password"
							name="<c:out value="${status.expression}"/>"
							value="<c:out value="${status.value}"/>" />

						<%-- 			<form:errors path="password" cssClass="error" /> --%>

						<c:if test="${status.error}">
							<label for="<c:out value="${status.expression}"/>"
								generated="true" class="error" style=""><c:out
									value="${status.errorMessages[0]}" /></label>
						</c:if>
					</spring:bind>
				</p>
				<p>
					<form:label path="retypePassword">
						<b class="redColor">*</b>确认密码：</form:label>
					<spring:bind path="personForm.retypePassword">
						<input id="retypePassword" type="password"
							name="<c:out value="${status.expression}"/>"
							value="<c:out value="${status.value}"/>" />
						<c:if test="${status.error}">
							<label for="<c:out value="${status.expression}"/>"
								generated="true" class="error" style=""><c:out
									value="${status.errorMessages[0]}" /></label>
						</c:if>
					</spring:bind>
				</p>
				<p>
					<form:label path="email">
						<b class="redColor">*</b>邮箱：</form:label>
					<form:input path="email" />
					<spring:bind path="personForm.email">
						<c:if test="${status.error}">
							<label for="<c:out value="${status.expression}"/>"
								generated="true" class="error" style=""><c:out
									value="${status.errorMessages[0]}" /></label>
						</c:if>
					</spring:bind>
				</p>
				<p>
					<form:label path="recommendedBy">推荐人用户名：</form:label>
					<form:input path="recommendedBy" />
					<spring:bind path="personForm.recommendedBy">
						<c:if test="${status.error}">
							<label for="<c:out value="${status.expression}"/>"
								generated="true" class="error" style=""><c:out
									value="${status.errorMessages[0]}" /></label>
						</c:if>
					</spring:bind>
				</p>
				<p>
					<form:label path="captcha">
						<b class="redColor">*</b>验证码：</form:label>
					<form:input path="captcha" />
					<spring:bind path="personForm.captcha">
						<c:if test="${status.error}">
							<label for="<c:out value="${status.expression}"/>"
								generated="true" class="error" style=""><c:out
									value="${status.errorMessages[0]}" /></label>
						</c:if>
					</spring:bind>
					<br /> <label for="jcaptcha"></label> <img src="../jcaptcha.jpg"
						title="验证码" alt="验证码" />
				</p>
				<p>
					<input class="submit" type="submit" value="提交" />
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>