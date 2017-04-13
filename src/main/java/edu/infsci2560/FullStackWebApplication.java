package edu.infsci2560;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"edu.infsci2560"})
public class FullStackWebApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FullStackWebApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FullStackWebApplication.class, args);
    }
}


//import java.net.*;  
//import edu.infsci2560.models.Recipe;
//import edu.infsci2560.models.Recipe.RecipeType;
//import edu.infsci2560.repositories.RecipeRepository;
//import edu.infsci2560.models.Tip;
//import edu.infsci2560.models.Tip.category;
//import edu.infsci2560.repositories.TipRepository;
//import edu.infsci2560.models.Good;
//import edu.infsci2560.repositories.GoodRepository;
//import edu.infsci2560.models.Video;
//import edu.infsci2560.repositories.VideoRepository;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//
//@SpringBootApplication
//@ComponentScan({"edu.infsci2560"})
//public class FullStackWebApplication {
//
////    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);
//    
//    public static void main(String[] args) {
////        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);
//
////        RecipeRepository recipeRepository = ctx.getBean(RecipeRepository.class);
////        recipeRepository.save(new Recipe(1L, "Chocolate Muffin", RecipeType.Baker, "Grease muffin cups. Whisk egg, yogurt, milk, and vegetable oil until smooth and combine other ingredients. Stir until batter is just blended. Then bake."));
////        recipeRepository.save(new Recipe(2L, "Mojito", RecipeType.Alcoholic, "Muddle lime juice with 1/2 to 1 teaspoon superfine sugar. Add mint leaves and cracked ice. Pour in the rum. Pitch in the squeezed-out lime shell and top off with club soda."));
////        recipeRepository.save(new Recipe(3L, "Hot Wings", RecipeType.MeatLover, "Fry coated wings in hot oil for 10 to 15 minutes. Place wings and add hot sauce mixture."));
//        
////        TipRepository tipRepository = ctx.getBean(TipRepository.class);
////        tipRepository.save(new Tip(1L, category.Prep, "Use two bowls to cut corn off the cob without getting kernels everywhere."));
////        tipRepository.save(new Tip(2L, category.Cooking, "Pre-soak pasta and it will cook in about 60 seconds."));
////        tipRepository.save(new Tip(3L, category.Prep, "Use a spoon to peel a kiwi from the inside out."));
//        
////        GoodRepository goodRepository = ctx.getBean(GoodRepository.class);
////        try{
////            URL link1 = new URL("https://goo.gl/tusUSY");
////            URL link2 = new URL("https://goo.gl/N4yF3H");
////            URL link3 = new URL("https://goo.gl/ejuyXP");
////            goodRepository.save(new Good(1L, "Food processor", "KitchenAid", link1));
////            goodRepository.save(new Good(2L, "Coffee maker", "Keurig", link2));
////            goodRepository.save(new Good(3L, "Food scale", "Ozeri", link3));
////        }catch (MalformedURLException e) {
////            e.printStackTrace();
////        }
//        
////        VideoRepository videoRepository = ctx.getBean(VideoRepository.class);
////        try{
////            URL link1 = new URL("https://www.youtube.com/watch?v=uBj-NriY_pQ");
////            URL link2 = new URL("https://www.youtube.com/watch?v=qKqj85oo2wI");
////            videoRepository.save(new Video(1L, "Vanilla Cheesecake by Gordon ramsay", link1));
////            videoRepository.save(new Video(2L, "Chef's Table trailer", link2));
////        }catch (MalformedURLException e) {
////            e.printStackTrace();
////        }
//
//    }
//}

