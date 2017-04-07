import org.apache.log4j.PropertyConfigurator;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by laijiayi on 4/3/17.
 */
public class Main {
    public static void main(String[] args) {
        String log4jConfPath = "src/main/java/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        CreateEdgeList createEdgeList = new CreateEdgeList();
        try {
            createEdgeList.initMaps();
            createEdgeList.createEdgeList();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
