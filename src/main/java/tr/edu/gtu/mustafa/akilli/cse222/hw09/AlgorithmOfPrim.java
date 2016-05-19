package tr.edu.gtu.mustafa.akilli.cse222.hw09;

import java.util.*;

/**
 * Created by Prim
 */
public class AlgorithmOfPrim {

    public ArrayList<Edge> primsAlgorithm(Graph graph, int start){

        ArrayList<Edge> result = new ArrayList<Edge>();
        int numV = graph.getNumV();
        //Use a HashSet to represent V-S.
        Set<Integer> vMinusS = new HashSet<Integer>(numV);
        //Declare the priority queue
        Queue<Edge> pQ = new PriorityQueue<Edge>(numV, new CompareEdges());

        //Initialize V-S
        for(int index = 0; index < numV; index++){
            if(index != start)
                vMinusS.add(index);
        }

        int current = start;

        /* For the use iterator */
        boolean isItListGraph = false;
        if( graph instanceof ListGraph)
            isItListGraph = true;

        //Main loop
        while (vMinusS.size() != 1){

            //Update priority queue
            Iterator<Edge> iter = graph.edgeIterator(current);
            while (iter.hasNext()){
                Edge edge = iter.next();
                int v = edge.getDest();
                int dest = edge.getDest();
                if(vMinusS.contains(dest))
                    pQ.add(edge);
            }

            //Find the sortest edge whose source is in S and
            //destination is in V-S
            int dest = -1;
            Edge edge = null;

            do {
                edge = pQ.remove();
                dest = edge.getDest();
            }while(!vMinusS.contains(dest));

            //Take dest out of vMinusS
            vMinusS.remove(dest);
            //Add edge to result
            result.add(edge);
            //Make this the current vertex
            current = dest;
        }
        return result;
    }
}
