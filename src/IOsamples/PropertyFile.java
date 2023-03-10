package IOsamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

public static void main(String[] args) throws IOException {
   Properties connProp=new Properties();
   connProp.setProperty("username", "trg08"); 
   connProp.setProperty("password", "trg08");
   FileOutputStream propsFile=new FileOutputStream("Information.properties"); 
   connProp.store (propsFile, "Properties File");
   propsFile.close();
   String uname=null;
   String password=null;
   Properties temprop=new Properties();
   FileInputStream obtained=new FileInputStream("Information.properties");
   temprop.load (obtained);
   obtained.close();
   uname=temprop.getProperty("username");
   password=temprop.getProperty("password"); 
   System.out.println (uname+" "+password);
  }
}