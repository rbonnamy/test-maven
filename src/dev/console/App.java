package dev.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.console.entity.Pizza;
import dev.service.AppService;

public class App {
	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		LOG.info("Bonjour Slf4J !");
		LOG.info("Implémentation Logback");
		new AppService().executer("valeur 1");
		
		Pizza p = new Pizza();

	}
}