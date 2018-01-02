package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {
	private static final Logger LOG = LoggerFactory.getLogger("dev.service");

	public void executer(String param) {
		LOG.debug("Traitement 1 : param = {}", param);
	}
}