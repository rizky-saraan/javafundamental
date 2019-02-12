package collection.Map;
import java.util.*;

public class Planet {
    private String name;
    private double mass;

    public Planet(String name , double mass){
        this.name=name;
        this.mass=mass;
    }


    @Override
    public String toString(){
        return "Planet "+name+" , Mass : "+mass;
    }

}
