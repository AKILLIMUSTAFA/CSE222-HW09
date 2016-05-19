package tr.edu.gtu.mustafa.akilli.cse222.hw09;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * HW09_131044017_Mustafa_Akilli
 *
 * File:   ListGraph
 *
 * Description:
 *
 * The graph ADT implemented using adjacency matrix
 *
 * @author Mustafa_Akilli
 * @since Wednesday 18 May 2016 by Mustafa_Akilli
 */
public class MatrixGraph extends AbstractGraph {

    /** An Aray of Lists to contain the edges that originate that
     *  originate with each vertex */
    private double[][] edges;

    /**
     * Construct a graph with the specified number of vertices
     * and the directed flag. If the directed flag is true,
     * this is a directed graph.
     *
     * @param numberOfVertex     The number of vertices
     * @param directed The directed flag
     */
    public MatrixGraph(int numberOfVertex, boolean directed) throws Exception {
        super(numberOfVertex, directed);

        if (numberOfVertex > 0)
            setListOfEdges(numberOfVertex);
        else
            throw new Exception();
    }

    /**
     * Get Edge
     *
     * @param source The source vertex
     * @param destination The destination vertex
     * @return the edge between these two vertices
     */
    public Edge getEdge(int source, int destination){
        return new Edge(source, destination , edges[source][destination]);
    }

    /**
     * Insert a new edge into the graph
     *
     * @param edge The new edge
     */
    public void insert(Edge edge){
        edges[edge.getSource()][edge.getDest()] = edge.getWeight();
        if (isDirected()){
            edges[edge.getDest()][edge.getSource()] = edge.getWeight();
        }
    }

    /**
     * Determine whether an edge exists
     *
     * @param source The source vertex
     * @param destination The destination vertex
     * @return true if there is an edge from source to dest
     */
    public boolean isEdge(int source, int destination){

        if (edges[source][destination] > 0 )
            return true;

        return false;
    }

    /**
     * Get Edges
     *
     * @return List Of Edges
     */
    private double[][] getListOfEdges() {
        return this.edges;
    }

    /**
     * set List Of Edges
     *
     * @param numberOfVertex for Graph
     */
    private void setListOfEdges(int numberOfVertex) {
        this.edges = new double[numberOfVertex][numberOfVertex];
    }
}
