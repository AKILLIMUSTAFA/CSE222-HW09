package tr.edu.gtu.mustafa.akilli.cse222.hw09;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {/*
        ListGraph listGraphs = new ListGraph(40,false);

        listGraphs.createGraphFromFile("V10-S0.2-XML.xml");

        Iterator<Edge> edgeIterator = listGraphs.edgeIterator(1);

        while (edgeIterator.hasNext()){
            Edge tempEdge = edgeIterator.next();
            System.out.println("Komsu: " + tempEdge.getDest() + "Weight: " + tempEdge.getWeight());
        }

        */

        long startTime;
        int randomNumber;
        int size;
        long endTime;
        long timeofExe;

        startTime = System.currentTimeMillis();




        MatrixGraph matrixGraph = new MatrixGraph(40,false);

        matrixGraph.createGraphFromFile("V10-S0.2-XML.xml");

        Edge tempEdge = matrixGraph.getEdge(1,4);

        System.out.println("Komsu: " + tempEdge.getDest() + "Weight: " + tempEdge.getWeight());

        tempEdge = matrixGraph.getEdge(1,8);

        System.out.println("Komsu: " + tempEdge.getDest() + "Weight: " + tempEdge.getWeight());




        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("\nTime of Exe : " + timeofExe);
    }
}
