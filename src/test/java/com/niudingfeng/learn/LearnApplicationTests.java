package com.niudingfeng.learn;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.niudingfeng.learn.entity.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.sql.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnApplicationTests {
	@Autowired
	private DataSource dataSource;
	ObjectMapper MAPPER = new ObjectMapper();
	@Test
	public void contextLoads() throws IOException {
		System.out.println(dataSource.getClass()+"-------------------");
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		String s = MAPPER.writeValueAsString(list);
		System.out.println(s);
		CollectionType type = MAPPER.getTypeFactory().constructCollectionType(List.class, Integer.class);
		List list1 = MAPPER.readValue(s,type);
		System.out.println(list1.get(0));
	}

}
