package main.java.ru.cti.parentsPatterns.factoryMethod;

import main.java.ru.cti.parentsPatterns.builder.ILog;

public class ModernServer extends MainFactoryMethodPres.AbstractServer {
    @Override
    protected ILog getLog() {
        return new TelegramLog();
    }
}
