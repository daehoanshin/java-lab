package jpa;

import java.sql.Connection;
import java.util.List;

import javax.inject.Provider;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.querydsl.core.Tuple;
import com.querydsl.sql.Configuration;
import com.querydsl.sql.MySQLTemplates;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLTemplates;
import com.querydsl.sql.spring.SpringConnectionProvider;
import com.querydsl.sql.spring.SpringExceptionTranslator;

//DB스키마 기준으로 자바쪽에 자동생성한 쿼리타입 클래스, 메이븐설정에서 접두어를 „S‟로 했다.
import jpa.model.SDept;
import jpa.model.SEmp;

@SpringBootApplication
public class QtypetestApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(QtypetestApplication.class, args);
	}

	@Autowired
	DataSource dataSource;

	@Transactional
	public void run(String... args) {
		// DB스키마구조대로 만든 쿼리 타입
		SEmp emp = new SEmp("emp");
		SDept dept = new SDept("dept");
		///////////////////////////////////////////// JPA형식으로 DB에 질의문 생성
		SQLQueryFactory queryFactory = queryFactory();
		List<String> enames = queryFactory.select(emp.ename).from(emp).fetch();
		for (String ename : enames) {
			System.out.println(ename);
		}
		System.out.println("----------------");
		
		List<Tuple> emps = queryFactory.select(emp.ename, dept.dname)
				 .from(emp).innerJoin(dept)
				 .on(emp.deptno.eq(dept.deptno)).fetch();
		for (Tuple row : emps) {
			System.out.println(row.get(emp.ename) + ":" + row.get(dept.dname));
		}
		System.out.println("----------------");
	}

	public Configuration querydslConfiguration() {
		SQLTemplates templates = MySQLTemplates.builder().build(); // change to
																	// your
																	// Templates
		Configuration configuration = new Configuration(templates);
		configuration.setExceptionTranslator(new SpringExceptionTranslator());
		return configuration;
	}

	// 만약 레토지토리에서 주입받으려면 @Bean 어노테이션으로 빈으로 등록후 사용하면 된다.
	public SQLQueryFactory queryFactory() {
		Provider<Connection> provider = new SpringConnectionProvider(dataSource);
		return new SQLQueryFactory(querydslConfiguration(), provider);
	}
}