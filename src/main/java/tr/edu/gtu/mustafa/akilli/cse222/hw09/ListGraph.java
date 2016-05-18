package tr.edu.gtu.mustafa.akilli.cse222.hw09;

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
 * @since Sunday 18 May 2016 by Mustafa_Akilli
 */
public class ListGraph extends AbstractGraph {
    /**
     * Construct a graph with the specified number of vertices
     * and the directed flag. If the directed flag is true,
     * this is a directed graph.
     *
     * @param numV     The number of vertices
     * @param directed The directed flag
     */
    public ListGraph(int numV, boolean directed) {
        super(numV, directed);
    }
}
