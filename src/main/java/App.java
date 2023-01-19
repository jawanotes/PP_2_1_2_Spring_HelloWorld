import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        //System.out.println(bean.getMessage());
        HelloWorld beanHW2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.println("bean and beanHW2 is " + ((bean == beanHW2) ? "equal" : "not equal"));
        System.out.println("cat1 and cat2 is " + ((cat1 == cat2) ? "equal" : "not equal"));

    }
}