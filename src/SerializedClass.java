import java.io.Serializable;

/**
 * Created by varunmalhotra on 03/08/17.
 */
public class SerializedClass implements Serializable{

    private static final long serialVersionUID = 1L;

    public int id;
    public transient Integer phone;
    public String name;

    public void stringify(){
        System.out.println("Id:" + this.id + " Phone:" + this.phone + " Name:" + this.name);
        return;
    }
}
