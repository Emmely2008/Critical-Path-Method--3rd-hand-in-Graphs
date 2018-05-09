package criticalpath;

public class Vertex {
    public int id;
    public int duration;
    public String name;
    public Integer earliestStart;
    public Integer earliestFinish;
    public Integer latestStart;
    public Integer latestFinish;
    public Integer floatTime;

    public Vertex(int id, String name, int duration){
        this.id = id;
        this.name = name;
        this.duration = duration;

    }
}
