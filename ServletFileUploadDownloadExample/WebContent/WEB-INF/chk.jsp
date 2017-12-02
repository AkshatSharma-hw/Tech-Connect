<%
try{
	HttpSession mySession = request.getSession(false);
	String userName = (String)mySession.getAttribute("username");
	System.out.println(mySession.isNew());
	System.out.println(userName);
	if(mySession.isNew() || userName == null){
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
	}
	
}catch (Exception e) {
	e.printStackTrace();
}

%>