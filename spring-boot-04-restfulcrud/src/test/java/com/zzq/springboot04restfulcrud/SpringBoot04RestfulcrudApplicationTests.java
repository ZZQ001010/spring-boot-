package com.zzq.springboot04restfulcrud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class SpringBoot04RestfulcrudApplicationTests {

	@Test
	public void contextLoads() {
		try {
			throw  new IOException();
		} catch (java.io.FileNotFoundException ex) {
			System.out.print("FileNotFoundException!");
		} catch (java.io.IOException ex) {
			System.out.print("IOException!");
		} catch (java.lang.Exception ex) {
			System.out.print("Exception!");
		}
	}


	private  int a(){
		int i = 0 ;
		try {
			return i ;
		}finally {
			++i ;
		}
	}






}
