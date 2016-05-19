package tr.edu.gtu.mustafa.akilli.cse222.hw09;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * HW09_131044017_Mustafa_Akilli
 *
 * File:   Graph
 *
 * Description:
 *
 * The graph ADT interface
 *
 * @author Mustafa_Akilli
 * @since Sunday 18 May 2016 by Mustafa_Akilli
 */
public interface Graph {

    /**
     * Return the number of vertices.
     * @return The number of vertices
     */
    public int getNumV();

    /**
     * Return whether this is a directed graph.
     * @return true if this is a directed graph
     */
    public boolean isDirected();

    /**
     * Get Edge
     *
     * @param source The source vertex
     * @param destination The destination vertex
     * @return the edge between these two vertices
     */
    public Edge getEdge(int source, int destination);

    /**
     * Determine whether an edge exists
     *
     * @param source The source vertex
     * @param destination The destination vertex
     * @return true if there is an edge from source to dest
     */
    public boolean isEdge(int source, int destination);

    /**
     * Return The source vertex of iterator
     *
     * @param source The source vertex
     * @return The source vertex of iterator
     */
    public Iterator<Edge> edgeIterator(int source);
}
