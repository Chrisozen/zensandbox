package org.zen.sandbox.web.controller;

import org.slf4j.Logger;

public class BaseController {

	protected Logger logger;
	
	public BaseController()
	{
		logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
		
		logger.debug("BaseController : Logger initialise");
	}
	
}
