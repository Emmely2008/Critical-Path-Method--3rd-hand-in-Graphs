package criticalpath;
/**
 * Inspiration from: https://www.geeksforgeeks.org/find-paths-given-source-destination
 * Author Emmely Lundberg
 */
// JAVA program to print all
// paths from a source to
// destination.

import java.util.ArrayList;
import java.util.List;

// A directed graph using
// adjacency list representation
// Undirected Graph
public class Graph {

    // No. of vertices in graph
    private int numberOfVertices;
    private Results results;
    private Vertex source;
    // adjacency list
    private ArrayList<Vertex>[] adjList;
    private boolean DEBUG;

    //Constructor
    public Graph(int numberOfVertices, boolean DEBUG) {

        //initialise vertex count
        this.numberOfVertices = numberOfVertices;

        // initialise adjacency list
        initAdjList();
    }

    // utility method to initialise
    // adjacency list
    @SuppressWarnings("unchecked")
    private void initAdjList() {
        adjList = new ArrayList[numberOfVertices];

        for (int i = 0; i < numberOfVertices; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    // add edge from u to v
    public void addEdge(Vertex u, Vertex v) {
        // Add v to u's list.
        adjList[u.id].add(v);
        adjList[v.id].add(u);
    }

    public void findAllVertexPaths(Vertex s, Vertex d, String flag, Results results) {
        boolean[] isVisited = new boolean[numberOfVertices];
        ArrayList<Vertex> pathList = new ArrayList<>();
        this.source = s;
        //add source to path[]
        pathList.add(s);

        //Call recursive utility
        if(flag.equals("earliest")) {
            if(DEBUG)
            System.out.println("earliest");
            findAllPathsLeftToRightUtil(s, d, isVisited, pathList, results);
        }
        if(flag.equals("latest")) {
            if(DEBUG)
            System.out.println("latest");
            findAllPathsRightToLeftUtil(s, d, isVisited, pathList, results);
        }
    }


    // A recursive method to print
    // all paths from 'u' to 'd'.
    // isVisited[] keeps track of
    // vertices in current path.
    // localPathList<> stores actual
    // vertices in the current path
    private void findAllPathsLeftToRightUtil(Vertex u, Vertex d, boolean[] isVisited, List<Vertex> localPathList, Results results) {
        // Mark the current node
        isVisited[u.id] = true;

        if (u.equals(d)) {
            List<Vertex> finalPathFound = new ArrayList<Vertex>();
            Vertex previous = null;
            if(isValidPathLeftToRightFlow(localPathList)) {
                for (Vertex i : localPathList) {
                    if (previous == null) {
                        previous = i;
                        previous.earliestStart = this.source.earliestStart;
                        previous.earliestFinish = this.source.earliestFinish;
                    }
                    else {
                        if (i.earliestStart == null || i.earliestStart <= previous.earliestFinish) {
                            i.earliestStart = previous.earliestFinish + 1;
                            i.earliestFinish = i.earliestStart + (i.duration - 1);
                        }
                    }
                    previous = i;
                    finalPathFound.add(i);
                }
                results.addPath(finalPathFound);
            }
        }
        for (Vertex i : adjList[u.id]) {

            if (!isVisited[i.id]) {
                // store current node
                // in path[]
                localPathList.add(i);
                findAllPathsLeftToRightUtil(i, d, isVisited, localPathList, results);
                // remove current node
                // in path[]
                localPathList.remove(i);
            }
        }

        // Mark the current node
        isVisited[u.id] = false;
    }
    private void findAllPathsRightToLeftUtil(Vertex u, Vertex d,
                                             boolean[] isVisited,
                                             List<Vertex> localPathList, Results results) {


        // Mark the current node
        isVisited[u.id] = true;

        if (u.equals(d) && isValidPathRightToLeftFlow(localPathList)) {

            List<Vertex> finalPathFound = new ArrayList<Vertex>();
            Vertex previous = null;

            for (Vertex i : localPathList) {
                if (previous == null) {
                    previous = i;
                    previous.latestStart = source.latestStart;//46;
                    previous.latestFinish = source.earliestFinish;//65;
                }

                //System.out.print(i.name+" ");
                else {
                    if (i.latestFinish == null || i.latestFinish < 0 || i.latestFinish >= previous.latestStart) {
                        i.latestFinish  = previous.latestStart - 1;
                        i.latestStart = i.latestFinish - (i.duration - 1);
                    }
                }
                previous = i;
                finalPathFound.add(i);
            }
            results.addPathBackwards(finalPathFound);

        }


        for (Vertex i : adjList[u.id]) {
            if (!isVisited[i.id]) {
                // store current node
                // in path[]
                localPathList.add(i);
                findAllPathsRightToLeftUtil(i, d, isVisited, localPathList, results);

                // remove current node
                // in path[]
                localPathList.remove(i);
            }
        }

        // Mark the current node
        isVisited[u.id] = false;
    }

    /*Make sure we go in the right direction with help of flow value*/
    boolean isValidPathLeftToRightFlow(List<Vertex> path){
        Vertex previous = null;
        for (Vertex i : path) {
            if(previous == null){
                previous = i;
            }
            else{
                if (i.flow < previous.flow){
                    if(DEBUG)
                    System.out.println("INVALID!!");
                    return false;
                }
                previous = i;
            }
        }
        return true;
    }
    boolean isValidPathRightToLeftFlow(List<Vertex> path){
        Vertex previous = null;
        for (Vertex i : path) {
            if(previous == null){
                previous = i;
            }
            else{
                if (i.flow > previous.flow){
                    if(DEBUG)
                        System.out.println("INVALID!!");
                    return false;
                }
                previous = i;
            }
        }
        return true;
    }
    // Driver program
    public static void main(String[] args) {
        // Create a sample graph
        Results results = new Results();
        boolean DEBUG = false;
        Graph graph = new Graph(8,DEBUG);

        Vertex a = new Vertex(0, "A", 10,0);
        Vertex b = new Vertex(1, "B", 20,10);
        Vertex c = new Vertex(2, "C", 5,20);
        Vertex d = new Vertex(3, "D", 10,30);
        Vertex e = new Vertex(4, "E", 20,40);
        Vertex f = new Vertex(5, "F", 15,15);
        Vertex g = new Vertex(6, "G", 5,25);
        Vertex h = new Vertex(7, "H", 15,12);
        graph.addEdge(a, b);
        graph.addEdge(b, c);
        graph.addEdge(c, d);
        graph.addEdge(c, g);
        graph.addEdge(d, e);
        graph.addEdge(a, f);
        graph.addEdge(f, g);
        graph.addEdge(g, e);
        graph.addEdge(a, h);
        graph.addEdge(h, e);


        System.out.println("Following are all different paths from " + a.id + " to " + e.id);
        Results res = new Results();
        a.earliestStart = 1;
        a.earliestFinish = 10;
        graph.findAllVertexPaths(a, e,"earliest", res);
        res.printAllPaths("Find Earliest Start/Finish",new boolean[]{true,false,false,true});
        res.findCriticalPath("Critical Path");
        e.latestStart=46;
        e.latestFinish=65;
        graph.findAllVertexPaths(e, a,"latest",res);
        res = new Results();
        graph.findAllVertexPaths(a, e,"earliest",res);
        res.printAllPaths("Find Latest Start/Finish",new boolean[]{false,true,false,true});

        res.updateFloat();
        res.printAllPaths("Total Floats",new boolean[]{false,false,true,false});


        res.printAllPaths("Complete Project Graph",new boolean[]{true,true,true,true});
    }



}

