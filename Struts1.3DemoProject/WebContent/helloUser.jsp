
<%@ taglib uri = "http://struts.apache.org/tags-bean"  prefix = "b" %>
<h:form action="/hello">

<h:text property="userName" />
<h:submit />

<hr />
<h:errors />

</h:form>