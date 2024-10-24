package House;

public class Owner implements Cloneable {
    private String name;


    public Owner(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
@Override
    public Owner clone(){
     try {
         return (Owner) super.clone();

     }catch (CloneNotSupportedException e){
         e.printStackTrace();
         return null;
     }
    }
    }

