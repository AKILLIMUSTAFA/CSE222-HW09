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

}
