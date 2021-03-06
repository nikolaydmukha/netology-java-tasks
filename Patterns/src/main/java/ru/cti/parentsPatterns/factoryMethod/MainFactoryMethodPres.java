package main.java.ru.cti.parentsPatterns.factoryMethod;

import main.java.ru.cti.parentsPatterns.builder.ILog;

public class MainFactoryMethodPres {
    public static abstract class AbstractServer {
        protected abstract ILog getLog();

        public void doWork() {
            ILog logger = getLog();
            logger.log("Hello! Давай поработаем!");

        }
    }
}
