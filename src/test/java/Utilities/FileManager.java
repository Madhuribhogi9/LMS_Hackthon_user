package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileManager
{
    public static String getPropertyValue(String key)
    {
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(Constants.PROPERTIES_FILE_PATH);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        Properties p = new Properties();
        try
        {
            p.load(fis);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return p.getProperty(key);
    }
}
