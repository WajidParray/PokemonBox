package com.dvt.util;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* This is the logger class to log various transactions in ehCache
*
* @author  Abdul Wajid
*/
public class CacheEventLogger implements CacheEventListener<Object, Object> {

	private static final Logger log = LoggerFactory.getLogger(CacheEventLogger.class);

  @Override
  public void onEvent(
    CacheEvent<? extends Object, ? extends Object> cacheEvent) {
      log.info("getting All Pokemons");
  }


}