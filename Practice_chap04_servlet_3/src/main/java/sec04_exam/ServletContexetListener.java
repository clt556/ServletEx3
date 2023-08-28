package sec04_exam;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContexetListener implements ServletContextListener{
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("contextDestroyed 호출");
	}//톰캣 서버 중지될 때 자동 호출
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("contextInitialized 호출");
	}//톰캣 서버 시작할 때 자동 호출
}


// ServletContextListener는 그냥 서버의 시작과 끝에서 서버사이드를 설정하기 위한
//서버사이드 측 자동 호출 서블릿이다
//그렇기 때문에 webServlet을 통한 매핑도 없음에 유의, 대신 리스너라는 의미로
//@WebListener 어노테이션이 위에 붙음
//여담인데 서버가 종료되고 서블릿의 destroy가 호출되는 순서가 되므로
//리스너의 contextDestroyed가 호출되고 각 서블릿의 destroy가 호출됨
//반대로 서버가 시작하고 나서 서블릿이 설정되므로 contextinitialized가 제일 먼저
//웹 앱에서 호출됨

//1.contextInitialized
//2.생성자
//3.initpostconstructor
//4.init
//5.doGet,doPost
//6.contextDestroyed
//7.destroy
//8.preDestroy
