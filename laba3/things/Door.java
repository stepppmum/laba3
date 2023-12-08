package things;

public class Door extends Thing{
    private static boolean isClosed;
    public Door(boolean isClosed){
        super.setName("дверь");
        super.setMaterial("массивная");
        this.isClosed = isClosed;
    }
    public void setClosed(boolean isClosed){
        this.isClosed = isClosed;
    }
    public static boolean getClosed(){
        return isClosed;
    }


}
