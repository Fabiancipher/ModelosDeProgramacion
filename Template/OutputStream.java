package Template;
public abstract class OutputStream{
    public final void write(Object data){
        Object o = serialize(data);
        writeObject(o);
    }
    protected abstract byte[] serialize(Object data);
    protected abstract void writeObject(Object o);

}