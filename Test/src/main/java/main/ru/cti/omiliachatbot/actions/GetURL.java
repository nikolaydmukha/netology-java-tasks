package main.ru.cti.omiliachatbot.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetURL {

    public GetURL() {
    }

    public String getURL(String urlIdentificator, String propFileName) throws IOException {
        FileInputStream fis = null;
        Properties property = new Properties();
        String url = null;
        File f = new File("message.properties");
        //for JAR
        String classpath = System.getProperty("java.class.path");
        System.out.println(("CLASSPATH: " + classpath));
        try (InputStream is = GetURL.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties properties = new Properties();
            properties.load(is);
            if (properties.containsKey(urlIdentificator))
                return properties.getProperty(urlIdentificator);
            else
                return "Key " + urlIdentificator + " not found in " + propFileName;

        } catch (IOException e) {
            url = e.getMessage();
            return url;
        }
    }
}
