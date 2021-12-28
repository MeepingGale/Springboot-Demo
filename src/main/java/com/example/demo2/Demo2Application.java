package com.example.demo2;

import java.util.Arrays;
import java.util.List;

import com.example.demo2.mapper.AuthorMapper;
import com.example.demo2.mapper.BookMapper;
import com.example.demo2.model.Author;
import com.example.demo2.model.Book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Demo2Application.class, args);
		AuthorMapper authorMapper = applicationContext.getBean(AuthorMapper.class);
		BookMapper bookMapper = applicationContext.getBean(BookMapper.class);

		Book book1 = new Book("Book1");
		Book book2 = new Book("Book2");
		Book book3 = new Book("Book3");
		List<Book> books = Arrays.asList(book1, book2, book3);

		Author author1 = new Author("author1");
		Author author2 = new Author("author2");
		List<Author> authors = Arrays.asList(author1, author2);

		authorMapper.saveAll(authors);

		book1.addAuthor(author1);
		book2.addAuthor(author2);
		book3.addAuthor(author1);
		book3.addAuthor(author2);

		bookMapper.saveAll(books);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			// for (String beanName : beanNames) {
			// 	System.out.println(beanName);
			// }

		};
	}
}
