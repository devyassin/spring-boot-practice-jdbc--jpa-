           <%@ include file="common/header.jspf" %>
	       <%@ include file="common/navigation.jspf" %>

				<div class="container">
				<title>List of todos</title>
                        		<h1 class="text-muted py-4">List of todos </h1>
                                <h1 class="pb-4">Welcome ${name} </h1>

                                    <table class="table table-dark  table-striped shadow   ">
                                        <tr>
                                            <th>ID</th>
                                            <th>User name</th>
                                            <th>Description</th>
                                            <th>Target Date</th>
                                             <th>Done</th>
                                              <th>Action</th>

                                        </tr>
                                        <c:forEach var="todo" items="${todos}">
                                            <tr>

                                                <td class="py-3">${todo.id}</td>
                                                <td class="py-3">${todo.username}</td>
                                                <td class="py-3">${todo.description}</td>
                                                <td class="py-3">${todo.targetDate}</td>
                                                <td class="py-3">${todo.done}</td>

                                                       <td>
                                                        <a href="update-todo?id=${todo.id}" class="btn btn-primary">
                                                                                                                                                                                            Update
                                                                            </a>
                                                        <a href="delete-todo?id=${todo.id}" class="btn btn-danger">
                                                                          Delete
                                                                      </a> </td>

                                            </tr>
                                        </c:forEach>
                                    </table>
	          	<a href="add-todo" class="btn btn-success">
                        	<button  type="button" class="btn btn-success">Add New Todo</button>
                        	</a>
				</div>
                    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
                    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>

</html>