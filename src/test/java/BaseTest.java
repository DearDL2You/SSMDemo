import com.ding.controller.BaseController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        BaseController baseController = (BaseController) applicationContext.getBean("baseController");
        baseController.BaseAction();
    }
}
