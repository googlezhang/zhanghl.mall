<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div id="contactUpdate">
	<form:form modelAttribute="personForm" id="registPersonForm" method="post">

		<c:if test="${not empty message}">
			<div id="message" class="${message.type}">${message.message}</div>
		</c:if>

		<form:label path="username">
           		 *用户名：
        </form:label>
		<form:input path="username" />
		<div>
			<form:errors path="username" cssClass="error" />
		</div>
		<p />

		<form:label path="password">
            	*设置密码：
        </form:label>
		<form:input path="password" />
		<div>
			<form:errors path="password" cssClass="error" />
		</div>
		<p />

		<form:label path="retypePassword">
            	*确认密码：
        </form:label>
		<form:input path="retypePassword" />
		<div>
			<form:errors path="retypePassword" cssClass="error" />
		</div>
		<p />
		<form:label path="email">
            	*邮箱：
        </form:label>
		<form:input path="email" />
		<div>
			<form:errors path="email" cssClass="error" />
		</div>
		<p />
		<form:label path="recommendedBy">
            	推荐人用户名：
        </form:label>
		<form:input path="recommendedBy" />
		<div>
			<form:errors path="recommendedBy" cssClass="error" />
		</div>
		<p />

		<form:label path="captcha">
            	*验证码：
        </form:label>
		<form:input path="captcha" />
		<div>
			<form:errors path="captcha" cssClass="error" />
		</div>
		<img src="../jcaptcha.jpg" title="" alt=""/>	
<!-- 		<img src="../captcha.html" title="" alt=""/> -->
		<p />
		<button type="submit"
			class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only">
			<span class="ui-button-text">Save</span>
		</button>
		<button type="reset"
			class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only">
			<span class="ui-button-text">Reset</span>
		</button>

	</form:form>
</div>