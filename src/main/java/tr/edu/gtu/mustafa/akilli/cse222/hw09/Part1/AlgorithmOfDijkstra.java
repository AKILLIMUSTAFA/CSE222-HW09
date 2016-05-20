package tr.edu.gtu.mustafa.akilli.cse222.hw09.Part1;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Dijkstra's Shortest-Path algorithm
 *
 * Created by Dijkstra
 */
public class AlgorithmOfDijkstra {

    /**
     * Dijkstra's Shortest-Path algorithm.
     *
     */
    public AlgorithmOfDijkstra(Graph graph, int start, int[]pred, double[]dist){

        int  numV = graph.getNumV();
        HashSet<Integer> vMinusS = new HashSet<Integer>(numV);
        //Initialize V-S
        for(int index = 0; index < numV; ++index) {
            if (index != start) {
                vMinusS.add(index);
            }
        }

        //Initialize pred and dist
        for (int v : vMinusS){
            pred[v] = start;
            dist[v] = graph.getEdge(start, v).getWeight();
        }

        /* For the use iterator */
        boolean isItListGraph = false;
        if( graph instanceof ListGraph)
            isItListGraph = true;

        //Main loop
        while (vMinusS.size() != 1){

            //Find the value u in V-S with the smallest dist[U].
            double minDist = Double.POSITIVE_INFINITY;
            int u = -1;

            for(int v : vMinusS){
                if(dist[v] < minDist) {
                    minDist = dist[v];
                    u = v;
                }
            }

            //Remove u from vMinusS
            vMinusS.remove(u);

            if(isItListGraph){
                //Update the distances
                Iterator<Edge> edgeIterator = graph.edgeIterator(u);
                while (edgeIterator.hasNext()){
                    Edge edge = edgeIterator.next();
                    int v = edge.getDest();
                    if(vMinusS.contains(new Integer(v))){
                        double weight = edge.getWeight();
                        if(dist[u] + weight < dist[v]){
                            dist[v] = dist[u] + weight;
                            pred[v] = u;
                        }

                        if(vMinusS.size() == 1)
                            System.out.println("dist[v]: " + dist[v]);
                    }
                }
            }
            else{
                //Update the distances
                for(int v : vMinusS){
                    if(graph.isEdge(u,v)){
                        double weight = graph.getEdge(u,v).getWeight();
                        if(dist[u] + weight < dist[v]){
                            dist[v] = dist[u] + weight;
                            pred[v] = u;
                        }
                    }

                    if(vMinusS.size() == 1)
                        System.out.println("dist[v]: " + dist[v]);
                }
            }
        }
    }
}
