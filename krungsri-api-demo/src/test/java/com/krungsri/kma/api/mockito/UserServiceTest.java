package com.krungsri.kma.api.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.krungsri.kma.api.repository.UserRepository;
import com.krungsri.kma.api.service.UserService;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@EnableAutoConfiguration(exclude = {
		 ErrorMvcAutoConfiguration.class
		})
public class UserServiceTest {
	
	@Mock
	private UserRepository userRepository;
	
	@Spy
    @InjectMocks
    UserService userService = new UserService(userRepository);
	
	@Before
	public void init() {
	    MockitoAnnotations.initMocks(this);
	}
	
	@BeforeEach
	    void setMockOutput() {
	        when(userRepository.get()).thenReturn("Hello Mockito From Repository");
	}
	
	@DisplayName("Test Mock userRepository")
    @Test
    void testGet() {
        assertEquals("Hello Mockito From Repository", userRepository.get());
    }
	 
	@Test
    public void testProcessSomething() {
        when(userService.classifyMemberType(55000)).thenReturn("G");

        String actual = userService.classifyMemberType(30000);
        assertEquals("G", actual);

        verify(userService, atLeastOnce()).classifyMemberType(30000);
        verify(userService, times(1)).classifyMemberType(30000);
    }
	
	//Business Logic 1
	//Algorithimic Unit Testing
	@Test
	@DisplayName("Mock output of GetReferenceCode() : lenght > 4")
	public void testGetReferenceCode1() {
		System.out.println("==========================================================================================");
		System.out.println("@Test Mock output of GetReferenceCode() : lenght > 4");
		
		String phone = "0854335280";
		String lastFourDigits = ""; 
		
		if (phone.length() > 4) 
			lastFourDigits = phone.substring(phone.length() - 4);
		else 
			lastFourDigits = phone;

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
		Date date = new Date();
		
		
		UserService userService = new UserService(userRepository);
		String result = userService.getReferenceCode(phone);
		System.out.println("Date : " + dateFormat.format(date) + lastFourDigits);
		System.out.println("Result : " + result);
		
		assertEquals(dateFormat.format(date) + lastFourDigits, result);
		
		System.out.println("==========================================================================================");
	}
	
	@Test
	@DisplayName("Mock output of GetReferenceCode() : lenght < 4")
	public void testGetReferenceCode2() {
		System.out.println("==========================================================================================");
		System.out.println("@Test Mock output of GetReferenceCode() : lenght < 4");
		
		String phone = "085";
		String lastFourDigits = ""; 
		
		if (phone.length() > 4) 
			lastFourDigits = phone.substring(phone.length() - 4);
		else 
			lastFourDigits = phone;

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
		Date date = new Date();
		
		UserService userService = new UserService(userRepository);
		String result = userService.getReferenceCode(phone);
		System.out.println("Date : " + dateFormat.format(date) + lastFourDigits);
		System.out.println("Result : " + result);
		
		assertEquals(dateFormat.format(date) + lastFourDigits, result);
		
		System.out.println("==========================================================================================");
	}
	
	@Test
	@DisplayName("Mock output of GetReferenceCode() : lenght = 0")
	public void testGetReferenceCode3() {
		System.out.println("==========================================================================================");
		System.out.println("@Test Mock output of GetReferenceCode() : lenght = 0");
		
		String phone = "";
		String lastFourDigits = ""; 
		
		if (phone.length() > 4) 
			lastFourDigits = phone.substring(phone.length() - 4);
		else 
			lastFourDigits = phone;

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
		Date date = new Date();
		
		
		UserService userService = new UserService(userRepository);
		String result = userService.getReferenceCode(phone);
		System.out.println("Date : " + dateFormat.format(date) + lastFourDigits);
		System.out.println("Result : " + result);
		
		assertEquals(dateFormat.format(date) + lastFourDigits, result);
		
		System.out.println("==========================================================================================");
	}
	
	@Test
	@DisplayName("Mock output of ClassifyMemberType() : Platinum")
	public void testClassifyMemberType1() {
		System.out.println("==========================================================================================");
		System.out.println("@Test Mock output of ClassifyMemberType() : Platinum");
		double salary = 55000;
		
		UserService userService = new UserService(userRepository);
		String result = userService.classifyMemberType(salary);
		System.out.println("Input Salary : " + salary);
		System.out.println("Result : " + result);
		
		assertEquals("P", result);
		System.out.println("==========================================================================================");
	}
	
	@Test
	@DisplayName("Mock output of ClassifyMemberType() : Gold")
	public void testClassifyMemberType2() {
		System.out.println("==========================================================================================");
		System.out.println("@Test Mock output of ClassifyMemberType() : Gold");
		double salary = 50000;
		
		UserService userService = new UserService(userRepository);
		String result = userService.classifyMemberType(salary);
		System.out.println("Input Salary : " + salary);
		System.out.println("Result : " + result);
		
		assertEquals("G", result);
		System.out.println("==========================================================================================");
	}
	
	@Test
	@DisplayName("Mock output of ClassifyMemberType() : Gold")
	public void testClassifyMemberType2_1() {
		System.out.println("==========================================================================================");
		System.out.println("@Test Mock output of ClassifyMemberType() : Gold");
		double salary = 30000;
		
		UserService userService = new UserService(userRepository);
		String result = userService.classifyMemberType(salary);
		System.out.println("Input Salary : " + salary);
		System.out.println("Result : " + result);
		
		assertEquals("G", result);
		System.out.println("==========================================================================================");
	}
	
	@Test
	@DisplayName("Mock output of ClassifyMemberType() : Silver")
	public void testClassifyMemberType3() {
		System.out.println("==========================================================================================");
		System.out.println("@Test Mock output of ClassifyMemberType() : Silver");
		double salary = 25000;
		
		UserService userService = new UserService(userRepository);
		String result = userService.classifyMemberType(salary);
		System.out.println("Input Salary : " + salary);
		System.out.println("Result : " + result);
		
		assertEquals("S", result);
		System.out.println("==========================================================================================");
	}
	
	@Test
	@DisplayName("Mock output of ClassifyMemberType() : Reject")
	public void testClassifyMemberType4() {
		System.out.println("==========================================================================================");
		System.out.println("@Test Mock output of ClassifyMemberType() : Reject");
		double salary = 12000;
		
		UserService userService = new UserService(userRepository);
		String result = userService.classifyMemberType(salary);
		System.out.println("Input Salary : " + salary);
		System.out.println("Result : " + result);
		
		assertEquals("R", result);
		System.out.println("==========================================================================================");
	}
	//Behavioral Unit Testing
}
