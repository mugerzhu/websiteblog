import cn.zdhspace.bean.Person;
import org.junit.Test;

import java.io.*;

public class SerializableTest {

    private Person person = new Person("dehong","jiangxi");

    @Test
    public void doit() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object"));
        objectOutputStream.writeObject(person);
        objectOutputStream.close();
    }

    @Test
    public void itdo() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object"));
        Person person1 = (Person) objectInputStream.readObject();
        System.out.println(person1.getName()+person1.getAddress());
    }

}
