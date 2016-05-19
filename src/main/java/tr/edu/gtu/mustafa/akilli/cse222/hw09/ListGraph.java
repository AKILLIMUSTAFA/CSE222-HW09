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

        if (numberOfVertex > 0)
            setListOfEdges(numberOfVertex);
        else
            throw new Exception();

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

        for(Edge edge : edges[source]){
            if(edge.equals(target))
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
        if (isDirected()){
            edges[edge.getDest()].add(new Edge(edge.getSource(),
                    edge.getDest(),edge.getWeight()));
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
        return edges[source].contains(new Edge(source, destination));
    }

    /**
     * Get Edges
     *
     * @return List Of Edges
     */
    private List<Edge>[] getListOfEdges() {
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
}
