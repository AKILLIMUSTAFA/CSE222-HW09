package tr.edu.gtu.mustafa.akilli.cse222.hw09.Part1;

import java.util.Comparator;

/**
 * HW09_131044017_Mustafa_Akilli
 *
 * File:   CompareEdges
 *
 * Description:
 *
 * Compare for Edges
 *
 * @author Mustafa_Akilli
 * @since Tuesday 19 May 2016 by Mustafa_Akilli
 */
public class CompareEdges implements Comparator<Edge> {

    /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.
     *
     * @param edge1 the first object to be compared.
     * @param edge2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     * first argument is less than, equal to, or greater than the
     * second.
     * @throws NullPointerException if an argument is null and this
     *                              comparator does not permit null arguments
     */
    public int compare(Edge edge1, Edge edge2) {

        if(edge1 == null || edge2 == null)
            throw new NullPointerException();

        /* first argument is less than second, return negative number */
        if(edge1.getWeight() - edge2.getWeight() < 0)
            return -1;
        else if (edge1.getWeight() - edge2.getWeight() > 0)  /* second argument is less than first, return positive number */
            return 1;

        /* second argument is equal to first, return zero */
        return 0;
    }
}