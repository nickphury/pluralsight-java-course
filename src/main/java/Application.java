import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service = context.getBean("speakerService", SpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
