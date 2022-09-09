package edu.javagroup.seabattle;

// убрать комментарий после выполенения задач
import edu.javagroup.seabattle.frame.MainFrame;
import org.springframework.boot.CommandLineRunner;
// закомментировать после выполнения задач
//import org.springframework.boot.SpringApplication;
// строку ниже не трогать
import org.springframework.boot.autoconfigure.SpringBootApplication;
 //убрать комментарий после выполенения задач
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        // закомментировать после выполнения задач
        //SpringApplication.run(App.class, args);
         //убрать комментарий после выполенения задач
        ConfigurableApplicationContext context = new SpringApplicationBuilder(App.class).headless(false).run(args);
        MainFrame mainFrame = context.getBean(MainFrame.class);
        mainFrame.setVisible(true);
    }

    // убрать комментарий после выполенения задач
    @Bean
    public CommandLineRunner commandLineRunner() {
        return new AppCmd();
    }
}
