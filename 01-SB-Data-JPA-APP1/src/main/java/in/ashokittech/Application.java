package in.ashokittech;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokittech.entity.User;
import in.ashokittech.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		UserRepository userrepo=context.getBean(UserRepository.class);
		//System.out.println(userrepo.getClass().getName());
		
		/*User user=new User();
		user.setUser_id(101);
		user.setAge(51);
		user.setUser_country("India");
		user.setUser_name("Mukesh");
		user.setUser_phnno(9999887766L);
		userrepo.save(user);
		System.out.println("==============Record Inserted Successfully============");*/
		
		/*User user1=new User();
		user1.setUser_id(102);
		user1.setAge(40);
		user1.setUser_country("India");
		user1.setUser_name("Laxmi");
		user1.setUser_phnno(9899887766L);
		userrepo.save(user1);
		
		
		User user3=new User();
		user3.setUser_id(103);
		user3.setAge(20);
		user3.setUser_country("India");
		user3.setUser_name("Vaibhav");
		user3.setUser_phnno(9977887766L);
		userrepo.save(user3);
		
		
		List<User> entitiesList=Arrays.asList(user1,user3);
		userrepo.saveAll(entitiesList);**/
		
		/*Optional<User> findbyId = userrepo.findById(101);
		if(findbyId.isPresent()) {
			System.out.println(findbyId.get());
		}*/
		
		/*Iterable<User> findallById = userrepo.findAllById(Arrays.asList(102,103));
		findallById.forEach(user->
		{
			System.out.println(user);
		});*/
		
		Iterable<User> findall = userrepo.findAll();
		findall.forEach(user->
		{
			System.out.println(user);
		});
		System.out.println(userrepo.count());
		userrepo.deleteById(103);
		
	}

}
