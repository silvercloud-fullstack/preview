package org.sivlercloud.lcn.tm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;

@SpringBootApplication
@EnableTransactionManagerServer
public class TransactionManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionManagerApplication.class, args);
	}
}