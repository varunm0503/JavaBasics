import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by varunmalhotra on 03/08/17.
 */
class ExternalizedClass implements Externalizable{

    private int id;
    private int phone;

    public ExternalizedClass(){

    }

    public ExternalizedClass(int id, int phone){
        this.id=id;
        this.phone=phone;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(id);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = (int) in.readObject();
    }

    public void stringify(){
        System.out.println("Id:" + this.id + " Phone:" + this.phone);
        return;
    }
}
