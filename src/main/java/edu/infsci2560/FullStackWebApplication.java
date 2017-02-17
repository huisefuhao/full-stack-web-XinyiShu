package edu.infsci2560;

import edu.infsci2560.models.Recipe;
import edu.infsci2560.models.Recipe.recipeType;
import edu.infsci2560.repositories.RecipeRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);

        RecipeRepository repository = ctx.getBean(RecipeRepository.class);
        repository.save(new Recipe(1L, "Chocolate Muffin", recipeType.Baker, "Grease 12 muffin cups or line with paper muffin liners. Combine flour, sugar, 3/4 cup chocolate chips, cocoa powder, and baking soda in a large bowl. Whisk egg, yogurt, milk, and vegetable oil in another bowl until smooth; pour into chocolate mixture and stir until batter is just blended."));
        repository.save(new Recipe(2L, "Mojito", recipeType.Alcoholic, "Muddle lime juice with 1/2 to 1 teaspoon superfine sugar. Add the few mint leaves and Fill glass 2/3 with cracked ice and pour in the rum. Pitch in the squeezed-out lime shell and top off with club soda or seltzer. "));
        repository.save(new Recipe(3L, "Hot Wings", recipeType.MeatLover, "Stir together and heat until butter is melted and mixture is well blended. Remove from heat and reserve for serving. Fry coated wings in hot oil for 10 to 15 minutes, or until parts of wings begin to turn brown. Remove from heat, place wings in serving bowl, add hot sauce mixture and stir together."));
    }
}


//package edu.infsci2560;
//
//import edu.infsci2560.models.Customer;
//import edu.infsci2560.repositories.CustomerRepository;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//@SpringBootApplication
//public class FullStackWebApplication {
//
//    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);
//
//    public static void main(String[] args) {
//        SpringApplication.run(FullStackWebApplication.class, args);
//    }
//
////    @Bean
////    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
////        return args -> {
////
////            System.out.println("Let's inspect the beans provided by Spring Boot:");
////
////            String[] beanNames = ctx.getBeanDefinitionNames();
////            Arrays.sort(beanNames);
////            for (String beanName : beanNames) {
////                System.out.println(beanName);
////            }
////
////        };
////    }
//    @Bean
//    public CommandLineRunner databaseDemo(CustomerRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Customer("Jack", "Bauer"));
//            repository.save(new Customer("Chloe", "O'Brian"));
//            repository.save(new Customer("Kim", "Bauer"));
//            repository.save(new Customer("David", "Palmer"));
//            repository.save(new Customer("Michelle", "Dessler"));
//            repository.save(new Customer("Billy", "Bean"));
//
//            // fetch all customers
//            log.info("[Database Demo] Customers found with findAll():");
//            log.info("[Database Demo] -------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info("[Database Demo] " + customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Customer customer = repository.findOne(1L);
//            log.info("[Database Demo] Customer found with findOne(1L):");
//            log.info("[Database Demo] --------------------------------");
//            log.info("[Database Demo] " + customer.toString());            
//
//            // fetch customers by last name
//            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
//            log.info("[Database Demo] --------------------------------------------");
//            for (Customer bauer : repository.findByLastName("Bauer")) {
//                log.info("[Database Demo] " + bauer.toString());
//            }            
//        };
//    }
//}
