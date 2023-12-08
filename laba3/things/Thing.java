package things;

import characters.Person;

public abstract class Thing{
    private String Name;
    private String Material;

    public final void setName(String name){
        this.Name = name;
    }
    public final String getName(){
        return Name;
    }
    public final void setMaterial(String material){
        this.Material = material;
    }
    public final String getMaterial(){
        return Material;
    }


    @Override
    public String toString(){
        return this.Name;
    }
}
