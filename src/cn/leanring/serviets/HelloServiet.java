package cn.leanring.serviets;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServiet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //判断什么请求  进行请求方法调度 login()
        if(req.getParameter("actiom").equals("login")){
            login(req,resp);
        }



    }

    private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //获取的参数
        String username = req.getParameter("username");
        System.out.println(username);
//    将参数拼装到JavaBean
    //请求数据库
    //相应
        resp.sendRedirect("/index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }//判断
}
