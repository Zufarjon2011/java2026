public class Box<T> {
    /*
    think T as Thing, and we are calling, Thing item.
     */

    T item;

    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
}
