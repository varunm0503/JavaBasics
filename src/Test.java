import java.io.*;

/**
 * Created by varunmalhotra on 09/08/17.
 */
public class Test {

    public static void main(String [] args) throws Exception{

        SerializedClass serializedClassObject = new SerializedClass();
        serializedClassObject.id = 10;
        serializedClassObject.phone = 99999999;

        File file= new File("demo.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(serializedClassObject);

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SerializedClass serializedClassObjectReturned = (SerializedClass) objectInputStream.readObject();
        System.out.println(serializedClassObject);
        System.out.println(serializedClassObjectReturned);
        serializedClassObject.stringify();
        serializedClassObject.stringify();

        ExternalizedClass externalizedClassObject = new ExternalizedClass(2,88888);

        File file2 = new File("demo2.txt");
        FileOutputStream fileOutputStreamExtern = new FileOutputStream(file2);
        ObjectOutputStream objectOutputStreamExtern = new ObjectOutputStream(fileOutputStreamExtern);
        objectOutputStreamExtern.writeObject(externalizedClassObject);

        FileInputStream fileInputStreamExtern = new FileInputStream(file2);
        ObjectInputStream objectInputStreamExtern = new ObjectInputStream(fileInputStreamExtern);
        ExternalizedClass externalizedClassObjectReturned = (ExternalizedClass) objectInputStreamExtern.readObject();
        System.out.println(externalizedClassObjectReturned);
        System.out.println(externalizedClassObjectReturned);
        externalizedClassObject.stringify();
        externalizedClassObjectReturned.stringify();

    }

}
