<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@attribute name="menu" required="true" 
             rtexprvalue="true" 
             type="com.github.julbrygd.twitter.bootstrap.menu.MenuInterface" 
             description="The Menu to show"%>
<div class="navbar">
    <div class="navbar-inner">
        <div class="container">
            <ul class="nav">
                <c:forEach items="${menu}" var="item">
                    <li><a href="${item.url}">${item.label}</a></li>
                </c:forEach>
            </ul>
        </div>
    </div>
</div>