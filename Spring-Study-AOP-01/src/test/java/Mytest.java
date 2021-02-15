import com.southWind.service.UserService;
import com.southWind.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Mytest
 * @Description TODO
 * @Author
 * @Date 2021/2/12
 **/

public class Mytest {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理的是接口：注意点
        UserService userService =context.getBean("userService1",UserService.class);
        userService.add();
    }
}
