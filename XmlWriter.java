package read.git;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by 1 on 15.02.2017.
 */
public class XmlWriter {
    public static void main(String[] args)  {
        People p1 = new People();
        p1.setName("John");
        p1.setAge(20);
        p1.setSalary(20.0);

        People p2=new People();
        p2.setName("Sam");
        p2.setAge(20);
        p2.setSalary(20.0);

        try {
            FileOutputStream fs = new FileOutputStream("D:\\task2\\file1.xml");
            java.beans.XMLEncoder enc = new java.beans.XMLEncoder(fs);
            enc.writeObject(p1);
            enc.writeObject(p2);
            enc.flush();
            enc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
