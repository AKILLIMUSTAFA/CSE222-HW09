package tr.edu.gtu.mustafa.akilli.cse222.hw09.Chapter2.junitForChapter2;

import junit.framework.TestCase;
import tr.edu.gtu.mustafa.akilli.cse222.hw09.Chapter2.FindPath;
import tr.edu.gtu.mustafa.akilli.cse222.hw09.Part1.ListGraph;

/**
 * Created by MustafaMonster on 20.05.2016.
 */
public class FindPathTest extends TestCase {

    public void testFindLongestConnectedComponentsInGraph() throws Exception {

        String expectedV2 = "1*4*";
        String expectedV3 = "1*1*4*10*9*3*2*6*5*7*";
        boolean resultv2;
        boolean resultv3;
        ListGraph listGraphsv2 = new ListGraph(11, true);
        ListGraph listGraphsv3 = new ListGraph(11, true);


        listGraphsv2.createGraphFromFile("Chapter2v2.xml");
        listGraphsv3.createGraphFromFile("Chapter2v3.xml");
        FindPath findPathv2 = new FindPath(listGraphsv2);
        FindPath findPathv3 = new FindPath(listGraphsv3);

        if (expectedV2.compareTo(findPathv2.findLongestConnectedComponentsInGraph()) == 0 )
            resultv2 = true;
        else
            resultv2 = false;

        if (expectedV3.compareTo(findPathv3.findLongestConnectedComponentsInGraph()) == 0 )
            resultv3 = true;
        else
            resultv3 = false;

        assertEquals(true, resultv2);

        assertEquals(true, resultv3);
    }

    public void testFindSmallestConnectedComponentsInGraph() throws Exception {

        String expectedV2 = "2*";
        String expectedV3 = "1*1*4*10*9*3*2*6*5*7*";
        boolean resultv2;
        boolean resultv3;
        ListGraph listGraphsv2 = new ListGraph(11, true);
        ListGraph listGraphsv3 = new ListGraph(11, true);

        listGraphsv2.createGraphFromFile("Chapter2v2.xml");
        listGraphsv3.createGraphFromFile("Chapter2v3.xml");
        FindPath findPathv2 = new FindPath(listGraphsv2);
        FindPath findPathv3 = new FindPath(listGraphsv3);

        if (expectedV2.compareTo(findPathv2.findSmallestConnectedComponentsInGraph()) == 0 )
            resultv2 = true;
        else
            resultv2 = false;

        if (expectedV3.compareTo(findPathv3.findSmallestConnectedComponentsInGraph()) == 0 )
            resultv3 = true;
        else
            resultv3 = false;

        assertEquals(true, resultv2);

        assertEquals(true, resultv3);
    }
}