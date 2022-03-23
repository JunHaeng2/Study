package hello.servlet.web.frontController.v5;

import hello.servlet.web.frontController.ModelView;
import org.springframework.web.client.HttpServerErrorException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface MyHandlerAdapter {

    boolean support(Object handler);

    ModelView handle(HttpServletResponse request, HttpServletResponse response, Object handlder) throws IOException, ServletException;
}
