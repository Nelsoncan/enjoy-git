package enjoy.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@EnableAutoConfiguration
public class App {

    @RequestMapping("/")
    String home(){
        System.out.println("Hello Git! + giuhub_push!");
        return "Hello Git! -V0.6 -master update --merge合并分支";
    }

    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
