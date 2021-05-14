package com.acme.eshop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractServiceImpl {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	protected final DataService dataService = new DataServiceImpl();

}
