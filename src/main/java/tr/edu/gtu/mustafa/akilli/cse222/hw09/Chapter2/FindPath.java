package tr.edu.gtu.mustafa.akilli.cse222.hw09.Chapter2;

import tr.edu.gtu.mustafa.akilli.cse222.hw09.Part1.Graph;

public class FindPath {

    Graph graph;/* Graph */

    /**
     * One Parameter Constructor
     *
     * @param newGraph for the search
     */
    public FindPath(Graph newGraph) throws NullPointerException{
        setGraph(newGraph);
    }

    /**
     * Get Graph
     *
     * @return graph
     */
    public Graph getGraph() {
        return graph;
    }

    /**
     * Set Graph
     *
     * @param newGraph the new graph
     * @throws NullPointerException if graph is null
     */
    public void setGraph(Graph newGraph) throws NullPointerException{
        if(newGraph == null)
            throw new NullPointerException();

        this.graph = newGraph;
    }

    /**
     *  Method to find the sizes (number of vertices) of the largest (having maximum number of vertices)
     *  connected components in a graph.
     *
     * @return String of largest connected components in a graph
     */
    public String findLongestConnectedComponentsInGraph(){
        StringBuilder stringBuilder = new StringBuilder();
        int maxPath = -1;
        int maxPathArr[] = null;
        int sizeOfCurrentPath = 0;

        for(int index = 1 ; index < getGraph().getNumV() ;++index) {
            int currentPath[] = BreadthFirstSearch.breadthFirstSearch(getGraph(), index);
           // System.out.println("current: " + current);
            sizeOfCurrentPath = 0;
            for (int i : currentPath)
                if (i != -1)
                    ++sizeOfCurrentPath;

            if(maxPath < sizeOfCurrentPath){
                maxPath = sizeOfCurrentPath;
                maxPathArr = currentPath;
            }
        }

        for (int i : maxPathArr)
            if (i != -1)
                stringBuilder.append(i + "*");

        return stringBuilder.toString();
    }

    /**
     * Method to find the sizes (number of vertices) of the smallest (having minimum number of vertices)
     * connected components in a graph.
     *
     * @return String of smallest connected components in a graph
     */
    public String findSmallestConnectedComponentsInGraph(){
        StringBuilder stringBuilder = new StringBuilder();
        int minPath = Integer.MAX_VALUE;
        int minPathArr[] = null;
        int sizeOfCurrentPath = 0;

        for(int index = 1 ; index < getGraph().getNumV() ;++index) {
            int currentPath[] = BreadthFirstSearch.breadthFirstSearch(getGraph(), index);

            stringBuilder = new StringBuilder();

            sizeOfCurrentPath = 0;
            for (int i : currentPath){
                if (i != -1)
                    ++sizeOfCurrentPath;
            }

            if(minPath > sizeOfCurrentPath){
                minPath = sizeOfCurrentPath;
                minPathArr = currentPath;
            }
        }

        for (int i : minPathArr)
            if (i != -1)
                stringBuilder.append(i + "*");

        return stringBuilder.toString();
    }
}
