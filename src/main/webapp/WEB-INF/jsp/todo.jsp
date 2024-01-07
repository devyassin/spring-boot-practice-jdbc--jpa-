
                  <%@ include file="common/header.jspf" %>
                <%@ include file="common/navigation.jspf" %>
                <div class="container">
				<h1 class="py-4 text-muted">todo</h1>

                        		<form:form method="post"  modelAttribute="todo">
                                  <div class="mb-3">
                                    <label class="form-label">Description</label>
                                    <form:input name="description" path="description" type="text" required="required" class="form-control mb-3" />
                                    <form:input name="targetDate" path="targetDate" type="date" required="required" class="form-control" />

                                     <form:errors  path="description"  />
                                    <form:input type="hidden" path="id"/>
                                    <form:input type="hidden" path="username"/>
			                    	<form:input type="hidden" path="done"/>
                                  </div>

                                  <button type="submit" class="btn btn-primary">Submit</button>
                                </form:form>

				</div>

                <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
                <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>