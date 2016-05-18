package tr.edu.gtu.mustafa.akilli.cse222.hw09;

import java.io.IOException;
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

    // Other Methods
    /**
     * Load the edges of a graph from the data in an input file.
     * The file should contain a series of lines, each line
     * with two or three data values. The first is the source,
     * the second is the destination, and the optional third
     * is the weight.
     * @param scan The buffered reader containing the data
     * @throws IOException if an I/O error occurs
     */
    public void loadEdgesFromFile(Scanner scan) throws IOException;
}
