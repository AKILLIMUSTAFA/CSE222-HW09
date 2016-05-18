package tr.edu.gtu.mustafa.akilli.cse222.hw09;

import java.util.HashMap;
import java.util.Objects;

/**
 * HW09_131044017_Mustafa_Akilli
 *
 * File:   Edge
 *
 * Description:
 *
 * Edge
 *
 * @author Mustafa_Akilli
 * @since Sunday 19 May 2016 by Mustafa_Akilli
 */
public class Edge{

    /** The destination vertex for an edge */
    private int dest;

    /** The Source vertex for an edge */
    private int source;

    /** The weight */
    private double weight;

    /**
     * Constructs an Edge form Source to Destination.
     * Sets the weight to 1.0
     *
     * @param newSource for the Source of edge
     * @param newDest for the Destination of edge
     */
    public Edge(int newSource, int newDest){
        setSource(newSource);
        setDest(newDest);
        setWeight(1.0);
    }//end of the Two parameter Constructs

    /**
     * Constructs an Edge form Source to Destination.
     * Sets the weight to given weight
     *
     * @param newSource for the Source of edge
     * @param newDest for the Destination of edge
     * @param newWeight for the Weight of edge
     */
    public Edge(int newSource, int newDest, double newWeight){
        setSource(newSource);
        setDest(newDest);
        setWeight(newWeight);
    }//end of the Three parameter Constructs

    /**
     * Get the Destination Vertex
     *
     * @return the destination vertex
     */
    public int getDest() {
        return dest;
    }

    /**
     * Get The Source Vertex
     *
     * @return The Source vertex
     */
    public int getSource() {
        return source;
    }

    /**
     * Get The Weight of Edge
     *
     * @return
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Set the destination vertex
     *
     * @param newDest set for new destination vertex
     */
    private void setDest(int newDest) {
        this.dest = newDest;
    }

    /**
     * Set The Source Vertex
     *
     * @param newSource set for new Source vertex
     */
    private void setSource(int newSource) {
        this.source = newSource;
    }

    /**
     * Set The Weight of Edge
     *
     * @param newWeight set for new Weight
     */
    private void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    /**
     * Compares two edges for equality. Edges are equal if their source and
     * destination vertices are the same. The weight is not considered.
     *
     * @param obj for the compares
     * @return true if two edge is equal, otherwise return false.
     */
    @Override
    public boolean equals(Object obj) {

        /* if obj is a Edge */
        if (obj instanceof Edge) {
            /* Cast The Obj to Edge */
            Edge temp = (Edge) obj;

            /* if source of Edge, destination of Edge and weight of Edge is the same then return true */
            if(temp.getDest() == this.getDest() &&
                    temp.getSource() == this.getSource() &&
                    temp.getWeight() == this.getWeight())
                return true;

            /* if two Edge not equals then return false */
            else
                return false;

        } else {
            /* if obj is not a Edge then return false */
            return false;
        }
    }

    /**
     * Returns a hash code value for the object. This method is
     * supported for the benefit of hash tables such as those provided by
     * {@link HashMap}.
     *
     * The general contract of {@code hashCode} is:
     *
     * Whenever it is invoked on the same object more than once during
     * an execution of a Java application, the {@code hashCode} method
     * must consistently return the same integer, provided no information
     * used in {@code equals} comparisons on the object is modified.
     * This integer need not remain consistent from one execution of an
     * application to another execution of the same application.
     * If two objects are equal according to the {@code equals(Object)}
     * method, then calling the {@code hashCode} method on each of
     * the two objects must produce the same integer result.
     * It is not required that if two objects are unequal
     * according to the {@link Object#equals(Object)}
     * method, then calling the {@code hashCode} method on each of the
     * two objects must produce distinct integer results.  However, the
     * programmer should be aware that producing distinct integer results
     * for unequal objects may improve the performance of hash tables.
     *
     *
     * As much as is reasonably practical, the hashCode method defined by
     * class {@code Object} does return distinct integers for distinct
     * objects. (This is typically implemented by converting the internal
     * address of the object into an integer, but this implementation
     * technique is not required by the
     * Java&trade; programming language.)
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return (getSource() * getDest());
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     *
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     *
     * pre
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * pre
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
