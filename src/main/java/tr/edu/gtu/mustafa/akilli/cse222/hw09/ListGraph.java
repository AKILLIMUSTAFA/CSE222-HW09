package tr.edu.gtu.mustafa.akilli.cse222.hw09;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * HW09_131044017_Mustafa_Akilli
 *
 * File:   ListGraph
 *
 * Description:
 *
 * The graph ADT implemented using adjacency list
 *
 * @author Mustafa_Akilli
 * @since Wednesday 18 May 2016 by Mustafa_Akilli
 */
public class ListGraph extends AbstractGraph {

    /** An Aray of Lists to contain the edges that originate that
     *  originate with each vertex */
    private List<Edge>[] edges;

    /**
     * Construct a graph with the specified number of vertices
     * and the directed flag. If the directed flag is true,
     * this is a directed graph.
     *
     * @param numberOfVertex     The number of vertices
     * @param directed The directed flag
     */
    public ListGraph(int numberOfVertex, boolean directed) throws Exception {
        super(numberOfVertex, directed);

        edges = new List[numberOfVertex];

        for(int index = 0; index < numberOfVertex; ++index)
            this.edges[index] = new LinkedList<Edge>();
    }

    /**
     * Return The source vertex of iterator
     *
     * @param source The source vertex
     * @return The source vertex of iterator
     */
    public Iterator<Edge> edgeIterator(int source){
        return edges[source].iterator();
    }

    /**
     * Get Edge
     *
     * @param source The source vertex
     * @param destination The destination vertex
     * @return the edge between these two vertices
     */
    public Edge getEdge(int source, int destination){
        Edge target = new Edge(source,destination,Double.POSITIVE_INFINITY);
        CompareEdges compareEdges = new CompareEdges();
        for(Edge edge : edges[source]){
            if(edge.getSource() == target.getSource() && edge.getDest() == target.getDest())
                return edge; /* Desired edge found, return it */
        }
        return target; /* Desired edge not found*/
    }

    /**
     * Insert a new edge into the graph
     *
     * @param edge The new edge
     */
    public void insert(Edge edge){
        edges[edge.getSource()].add(edge);
    }

    /**
     * Determine whether an edge exists
     *
     * @param source The source vertex
     * @param destination The destination vertex
     * @return true if there is an edge from source to dest
     */
    public boolean isEdge(int source, int destination){
        return edges[source].contains(new Edge(source, destination));
    }

    /**
     * Get Edges
     *
     * @return List Of Edges
     */
    public List<Edge>[] getListOfEdges() {
        return edges;
    }

    /**
     * set List Of Edges
     *
     * @param numberOfVertex for Graph
     */
    private void setListOfEdges(int numberOfVertex) {
        this.edges = new LinkedList[numberOfVertex];
    }

    /**
     * Load the edges of a graph from the data in an input String.
     *
     * @param edgeLine for the Edge
     */
    public Edge loadEdgesFromString(String edgeLine){

        int index; /* index for loops */
        Edge newEdge; /* new Edge */
        StringBuilder sourceNumber = new StringBuilder(); /* For The Source Number */
        StringBuilder destinationNumber = new StringBuilder(); /* For The Destination Number */
        StringBuilder weight = new StringBuilder(); /* For The Source Name */

        /* Pass the until source number */
        for (index = 0; index < edgeLine.length(); ++index) {
            if (edgeLine.charAt(index) == 'v')
                break;
        }

        /* Source Number */
        for (index = index + 1 ; index < edgeLine.length(); ++index) {
            if (edgeLine.charAt(index) != '"')
                sourceNumber.append(edgeLine.charAt(index));
            else
                break;
        }

        /* Pass the until destination number */
        for (; index < edgeLine.length(); ++index) {
            if (edgeLine.charAt(index) == 'v')
                break;
        }

        /* Destination Number */
        for (index = index + 1; index < edgeLine.length(); ++index) {
            if (edgeLine.charAt(index) != '"')
                destinationNumber.append(edgeLine.charAt(index));
            else
                break;
        }

        /* Pass the until weight */
        for (index = index+1; index < edgeLine.length(); ++index) {
            if (edgeLine.charAt(index) == '"')
                break;
        }

        /* Destination Number */
        for (index = index+1; index < edgeLine.length(); ++index) {
            if (edgeLine.charAt(index) != '"')
                weight.append(edgeLine.charAt(index));
            else
                break;
        }

        return newEdge = new Edge(Integer.parseInt(String.valueOf(sourceNumber)),
                                Integer.parseInt(String.valueOf(destinationNumber)),
                                    Integer.parseInt(String.valueOf(weight)));
    }

    /**
     * Create Graph From File
     *
     * @param newDataFileName Data File Name
     * @throws IllegalArgumentException if type is neither "Matrix"
     *                                  nor "List"
     * @throws IOException if an I/O error occurs
     */
    public void createGraphFromFile(String newDataFileName)  throws IOException {

        File inFile = new File(newDataFileName); /* XML */

        Scanner sc = new Scanner(inFile);
        String line = sc.nextLine();/*Pass the first line */

        /* Until Start of the Edges */
        while (line.compareTo("  <Edges>") != 0) {
            /* Take the next line */
            line = sc.nextLine();
        }

        /* Take the next line */
        line = sc.nextLine();

        /* Until End of the Edges */
        while (line.compareTo("  </Edges>") != 0) {

            /* Add element in the Linked List */
            insert(loadEdgesFromString(line));

            /* Take the next line */
            line = sc.nextLine();
        }

        /* Close the file */
        sc.close();
    }


}
