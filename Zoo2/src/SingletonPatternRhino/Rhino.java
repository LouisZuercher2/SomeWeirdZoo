package SingletonPatternRhino;

public class Rhino {

    private static Rhino whiteRhino;
    private String name;

    private Rhino(String name){
        this.name = name;
    }

    public static Rhino getWhiteRhino(String name){
        if (whiteRhino == null){
            whiteRhino = new Rhino(name);
        }
        return whiteRhino;
    }

    public String getName() {
        return name;
    }
}
