package md.vladdubceac.learning.component;

import md.vladdubceac.learning.component.dao.ApplicationDao;
import md.vladdubceac.learning.component.models.CollegeStudent;
import md.vladdubceac.learning.component.service.ApplicationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SpringBootUnitTestingDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUnitTestingDemoApplication.class, args);
    }

    @Bean(name = "applicationExample")
    ApplicationService getApplicationService() {
        return new ApplicationService();
    }

    @Bean(name = "applicationDao")
    ApplicationDao getApplicationDao() {
        return new ApplicationDao();
    }

    @Bean(name = "collegeStudent")
    @Scope(value = "prototype")
    CollegeStudent getCollegeStudent() {
        return new CollegeStudent();
    }
}
