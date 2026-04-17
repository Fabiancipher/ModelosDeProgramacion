package Template;
public class ObjectOutputStream extends OutputStream{
    private OutputStream output;
    public ObjectOutputStream(){

    }

    public void setOutputStream(OutputStream output){
        this.output = output;
    }

    @Override
    protected byte[] serialize(Object data){
        return null;
    }
    @Override 
    public void writeObject(Object o){

    }
}