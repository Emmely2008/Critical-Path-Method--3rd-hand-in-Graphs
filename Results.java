package criticalpath;

import java.util.ArrayList;
import java.util.List;

public class Results {
    public List<List> allPathsForward;
    public List<List> allPathsBackwards;

    public Results() {
        allPathsForward = new ArrayList<List>();
        allPathsBackwards = new ArrayList<List>();
    }

    public void addPathBackwards(List<Vertex> list) {
        allPathsBackwards.add(list);
    }

    public void addPath(List<Vertex> list) {
        allPathsForward.add(list);
    }

    public void printAllPaths(String title, boolean[] bool) {
        printHeadLine(title);
        System.out.print("[");
        int j = 0;

        for (List<Vertex> path : allPathsForward) {
            if(j>0){
                System.out.print(",");
            }
            j++;
            PrintPathDynamic(path, bool);
        }
        System.out.println("]");
        printPrintHeaderEnd();

    }



    public void findCriticalPath(String title) {
        int max = 0;
        List<Vertex> criticalPath = null;

        for (List<Vertex> path : allPathsForward) {

            int sum = 0;
            for (Vertex i : path) {
                sum += i.duration;
            }
            if (sum > max) {
                max = sum;
                criticalPath = path;
            }
        }
        printHeadLine(title);
        PrintPathDynamic(criticalPath,new boolean[]{false,false,false,true});
        printPrintHeaderEnd();
    }

    private void PrintPathDynamic(List<Vertex> path, boolean[] bool) {
        System.out.print("[");
        int j = 0;
        for (Vertex i : path) {
            if(j>0){
                System.out.print(",");
            }
            j++;
            System.out.print("{\"" + i.name + "\":{");
            //(id:" + i.id + ")");

            if(i.earliestStart != null &&  i.earliestFinish != null && bool[0]){
                System.out.print( "\"EarliestStart\":" + i.earliestStart + ",\"EarliestFinish\":" + i.earliestFinish + "");
            }
            if(i.latestStart != null &&  i.latestFinish != null && bool[1]) {
                System.out.print( ",\"LatestStart\":" + i.latestStart + ",\"LatestFinish\":" + i.latestFinish + "");
            }
            if(i.floatTime != null && bool[2]) {
                System.out.print( ",\"Float Time\":" + i.floatTime + "");
            }
            System.out.print("}}");
        }

        int sum = 0;
        for (Vertex i : path) {
            sum += i.duration;
        }
        if(bool[3])
        System.out.print(",{\"Total Duration\":" + sum+"}");
        System.out.println("]");
    }


    public void updateFloat() {
        for (List<Vertex> path : allPathsForward) {
            for (Vertex i : path) {
                i.floatTime = i.latestFinish - i.latestStart + 1;
            }
        }
    }
    private void printHeadLine(String title){
        System.out.println("------------------------------ "+title+" -------------------------------------\n");

    }
    private void printPrintHeaderEnd(){
        System.out.println("\n\n");

    }
}
