package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bgg.user.entity.User;
import com.bgg.user.service.UserService;
import com.bgg.user.serviceimpl.UserServiceImpl;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserServiceImpl user=(UserServiceImpl) context.getBean("userService");
		List<User> res=user.findAllUser();
		System.out.println(res.size());
	}

}
