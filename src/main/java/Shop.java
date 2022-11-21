//import com.sun.org.apache.xpath.internal.operations.Or;
import logic.Order;
import logic.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "Shop", value = "/Shop")
public class Shop extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session =request.getSession();
        User user=(User)session.getAttribute("user");
        String name =request.getParameter("user");
        if(user==null){
            user=new User();
        }
        if (request.getParameter("user")!=null){
            user.setName(name);
        }
        session.setAttribute("user",user);

       Order order = (Order) session.getAttribute("goods");
       String [] goods =request.getParameterValues("goods");
        if(order==null){
            order=new Order();
        }
        if (request.getParameter("goods")!=null){
            order.setBasket(goods);
        }
        session.setAttribute("goods",order);


      if(user.getName()==null ){
           RequestDispatcher enter =request.getRequestDispatcher("/enter.jsp");
           enter.forward(request,response);
       }
        if (order.getBasket()!=null){
         RequestDispatcher basket =request.getRequestDispatcher("/basket.jsp");
          basket.forward(request,response);

       }
       else{ RequestDispatcher orders =request.getRequestDispatcher("/order.jsp");
        orders.forward(request,response);}


    }
}
