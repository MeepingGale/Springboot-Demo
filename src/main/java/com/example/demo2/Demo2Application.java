package com.example.demo2;

import java.util.Arrays;

import com.example.demo2.AbstractFactory.AbstFactBook;
import com.example.demo2.AbstractFactory.AbstFactBookFactory;
import com.example.demo2.AbstractFactory.AbstFactStorybookFactory;
import com.example.demo2.Adapter.AdaptBook;
import com.example.demo2.Adapter.AdaptBookAdapter;
import com.example.demo2.Adapter.AdaptBookObjAdapterImpl;
import com.example.demo2.Adapter.AdaptFood;
import com.example.demo2.Builder.BuildBook;
import com.example.demo2.Factory.FactBook;
import com.example.demo2.Factory.FactBookFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);

		AbstFactBook afb = AbstFactBookFactory.getBook(new AbstFactStorybookFactory(1, "Life of Pi", "Storybook"));
		System.out.println("Abstract Factory Pattern [" + afb.toString() + "]");

		FactBook fb = FactBookFactory.getBook(2, "Hello World!", "Textbook");
		System.out.println("Factory Pattern [" + fb.toString() + "]");

		BuildBook bb = new BuildBook.BookBuilder(3, "Java is Lava", "Storybook").setIsPublished(false).build();
		System.out.println("Builder Pattern [" + bb.toString() + "]");

		AdaptBookAdapter sockAdapter = new AdaptBookObjAdapterImpl();
		AdaptFood adaptFood = getPrice(sockAdapter, 0);
		AdaptFood adaptFood2 = getPrice(sockAdapter, 1);
		AdaptFood adaptFood3 = getPrice(sockAdapter, 2);
		System.out.println("Adapter Pattern (Original - 0) [" + adaptFood.toString() + "]");
		System.out.println("Adapter Pattern (Discounted - 1) [" + adaptFood2.toString() + "]");
		System.out.println("Adapter Pattern (Inflated - 2) [" + adaptFood3.toString() + "]");
	}

	private static AdaptFood getPrice(AdaptBookAdapter aBookAdapter, int i) {
		switch (i) {
			case 0:
				return aBookAdapter.getOriginalPrice();
			case 1:
				return aBookAdapter.getDiscountedPrice();
			case 2:
				return aBookAdapter.getInfatedPrice();
			default:
				return null;
		}
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			// for (String beanName : beanNames) {
			// System.out.println(beanName);
			// }

		};
	}
}
