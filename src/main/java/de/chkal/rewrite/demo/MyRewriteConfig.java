package de.chkal.rewrite.demo;

import javax.servlet.ServletContext;

import org.ocpsoft.rewrite.config.Configuration;
import org.ocpsoft.rewrite.servlet.config.HttpConfigurationProvider;

public class MyRewriteConfig extends HttpConfigurationProvider {

   @Override
   public Configuration getConfiguration(ServletContext context) {

      return null;

   }

   @Override
   public int priority() {
      return 10;
   }

}
