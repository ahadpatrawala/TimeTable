<%@page import="java.sql.*;"%>
        <%
        String user_id=request.getParameter("t1");
        String password=request.getParameter("t2");
        try
        {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable","root","");
            PreparedStatement ps=con.prepareStatement("select * from information where user_id=? and password=?");
            ps.setString(1,user_id);
            ps.setString(2,password);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                session.setAttribute("user_id",user_id);
                session.setAttribute("password", password);
                response.sendRedirect("teacherhome.java");
            }
            else
            {
                out.println("Login Unsuccessful");
            }
        }
        catch(Exception e)
        {
            out.println("Error: "+e);
        }
%>
