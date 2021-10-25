package cn.itnanls;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 */
@WebServlet("/login.do")
public class LoginServlet  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //拿到那个类？ subject
        Subject subject = SecurityUtils.getSubject();
        resp.setContentType("text/plain;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        UsernamePasswordToken token=new UsernamePasswordToken(
                req.getParameter("name"),
                req.getParameter("password")
        );
        try {
            subject.login(token);
            writer.write("成功登录");
        }catch (UnknownAccountException uae) {
         writer.write("用户名错误");
        }catch (IncorrectCredentialsException ice) {
            writer.write("密码错误");
        }catch (LockedAccountException lae) {
            writer.write("用户冻结");
        }catch (AuthenticationException ae) {
            writer.write("其他错误");
       }finally {
            writer.flush();
            writer.close();
        }

    }
}
