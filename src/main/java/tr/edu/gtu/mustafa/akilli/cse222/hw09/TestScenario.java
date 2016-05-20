package tr.edu.gtu.mustafa.akilli.cse222.hw09;


import tr.edu.gtu.mustafa.akilli.cse222.hw09.Chapter2.FindPath;
import tr.edu.gtu.mustafa.akilli.cse222.hw09.Part1.AlgorithmOfDijkstra;
import tr.edu.gtu.mustafa.akilli.cse222.hw09.Part1.AlgorithmOfPrim;
import tr.edu.gtu.mustafa.akilli.cse222.hw09.Part1.ListGraph;
import tr.edu.gtu.mustafa.akilli.cse222.hw09.Part1.MatrixGraph;

/**
 * HW09_131044017_Mustafa_Akilli
 *
 * File:   TestScenario
 *
 * Description:
 *
 * Test Scenario
 *
 * @author Mustafa_Akilli
 * @since Tuesday 19 May 2016 by Mustafa_Akilli
 */
public class TestScenario {
    public static void main(String[] args) throws Exception {
        long startTime; /* For The Start Time */
        long endTime; /* For The End Time */
        long timeofExe; /* For The Time of Execute */

        ListGraph listGraphs10 = new ListGraph(11, false);
        ListGraph listGraphs50 = new ListGraph(51, false);
        ListGraph listGraphs100 = new ListGraph(101, false);
        ListGraph listGraphs500 = new ListGraph(501, false);
        ListGraph listGraphs1000 = new ListGraph(1001, false);

        MatrixGraph matrixGraph10 = new MatrixGraph(11, false);
        MatrixGraph matrixGraph50 = new MatrixGraph(51, false);
        MatrixGraph matrixGraph100 = new MatrixGraph(101, false);
        MatrixGraph matrixGraph500 = new MatrixGraph(501, false);
        MatrixGraph matrixGraph1000 = new MatrixGraph(1001, false);


        int[] pred11 = new int[11];
        double[] dist11 = new double[11];
        int[] pred51 = new int[51];
        double[] dist51 = new double[51];
        int[] pred101 = new int[101];
        double[] dist101 = new double[101];
        int[] pred501 = new int[501];
        double[] dist501 = new double[501];
        int[] pred1001 = new int[1001];
        double[] dist1001 = new double[1001];


        listGraphs10.createGraphFromFile("Chapter2.xml");
        System.out.println("Chapter2");
        FindPath findPath = new FindPath(listGraphs10);

        System.out.println("Longest Connected Components: " + findPath.findLongestConnectedComponentsInGraph());
        System.out.println("---------------");
        System.out.println("Smallest Connected Components: " + findPath.findSmallestConnectedComponentsInGraph());
        System.out.println("---------------");


        /*

        System.out.println("The graph ADT implemented using adjacency list, Algorithm Of Dijkstra: \n");

        {
            listGraphs10.createGraphFromFile("V10-S0.2-XML.xml");
            System.out.println("Vertex: 10 S: 0.2 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs10, 1, pred11, dist11);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs10.createGraphFromFile("V10-S0.5-XML.xml");
            System.out.println("Vertex: 10 S: 0.5 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs10, 1, pred11, dist11);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }


        {
            listGraphs10.createGraphFromFile("V10-S0.75-XML.xml");
            System.out.println("Vertex: 10 S: 0.75 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs10, 1, pred11, dist11);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs10.createGraphFromFile("V10-S0.8-XML.xml");
            System.out.println("Vertex: 10 S: 0.8 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs10, 1, pred11, dist11);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            listGraphs50.createGraphFromFile("V50-S0.2-XML.xml");
            System.out.println("Vertex: 50 S: 0.2 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs50, 1, pred51, dist51);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs50.createGraphFromFile("V50-S0.5-XML.xml");
            System.out.println("Vertex: 50 S: 0.5 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs50, 1, pred51, dist51);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs50.createGraphFromFile("V50-S0.75-XML.xml");
            System.out.println("Vertex: 50 S: 0.75 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs50, 1, pred51, dist51);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs50.createGraphFromFile("V50-S0.8-XML.xml");
            System.out.println("Vertex: 50 S: 0.8 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs50, 1, pred51, dist51);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            listGraphs100.createGraphFromFile("V100-S0.2-XML.xml");
            System.out.println("Vertex: 100 S: 0.2 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs100, 1, pred101, dist101);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs100.createGraphFromFile("V100-S0.5-XML.xml");
            System.out.println("Vertex: 100 S: 0.5 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs100, 1, pred101, dist101);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs100.createGraphFromFile("V100-S0.75-XML.xml");
            System.out.println("Vertex: 100 S: 0.75 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs100, 1, pred101, dist101);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs100.createGraphFromFile("V100-S0.8-XML.xml");
            System.out.println("Vertex: 100 S: 0.8 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs100, 1, pred101, dist101);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            listGraphs500.createGraphFromFile("V500-S0.2-XML.xml");
            System.out.println("Vertex: 500 S: 0.2 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs500, 1, pred501, dist501);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs500.createGraphFromFile("V500-S0.5-XML.xml");
            System.out.println("Vertex: 500 S: 0.5 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs500, 1, pred501, dist501);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs500.createGraphFromFile("V500-S0.75-XML.xml");
            System.out.println("Vertex: 500 S: 0.75 ");

            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs500, 1, pred501, dist501);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs500.createGraphFromFile("V500-S0.8-XML.xml");
            System.out.println("Vertex: 500 S: 0.8 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs500, 1, pred501, dist501);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            listGraphs1000.createGraphFromFile("V1000-S0.2-XML.xml");
            System.out.println("Vertex: 1000 S: 0.2 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs1000, 1, pred1001, dist1001);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs1000.createGraphFromFile("V1000-S0.5-XML.xml");
            System.out.println("Vertex: 1000 S: 0.5 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs1000, 1, pred1001, dist1001);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs1000.createGraphFromFile("V1000-S0.75-XML.xml");
            System.out.println("Vertex: 1000 S: 0.75 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs1000, 1, pred1001, dist1001);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs1000.createGraphFromFile("V1000-S0.8-XML.xml");
            System.out.println("Vertex: 1000 S: 0.8 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(listGraphs1000, 1, pred1001, dist1001);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("The graph ADT implemented using adjacency matrix, Algorithm Of Dijkstra: \n");

        {
            matrixGraph10.createGraphFromFile("V10-S0.2-XML.xml");
            System.out.println("Vertex: 10 S: 0.2 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph10, 1, pred11, dist11);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph10.createGraphFromFile("V10-S0.5-XML.xml");
            System.out.println("Vertex: 10 S: 0.5 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph10, 1, pred11, dist11);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }


        {
            matrixGraph10.createGraphFromFile("V10-S0.75-XML.xml");
            System.out.println("Vertex: 10 S: 0.75 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph10, 1, pred11, dist11);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph10.createGraphFromFile("V10-S0.8-XML.xml");
            System.out.println("Vertex: 10 S: 0.8 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph10, 1, pred11, dist11);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            matrixGraph50.createGraphFromFile("V50-S0.2-XML.xml");
            System.out.println("Vertex: 50 S: 0.2 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph50, 1, pred51, dist51);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph50.createGraphFromFile("V50-S0.5-XML.xml");
            System.out.println("Vertex: 50 S: 0.5 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph50, 1, pred51, dist51);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph50.createGraphFromFile("V50-S0.75-XML.xml");
            System.out.println("Vertex: 50 S: 0.75 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph50, 1, pred51, dist51);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph50.createGraphFromFile("V50-S0.8-XML.xml");
            System.out.println("Vertex: 50 S: 0.8 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph50, 1, pred51, dist51);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            matrixGraph100.createGraphFromFile("V100-S0.2-XML.xml");
            System.out.println("Vertex: 100 S: 0.2 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph100, 1, pred101, dist101);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph100.createGraphFromFile("V100-S0.5-XML.xml");
            System.out.println("Vertex: 100 S: 0.5 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph100, 1, pred101, dist101);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph100.createGraphFromFile("V100-S0.75-XML.xml");
            System.out.println("Vertex: 100 S: 0.75 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph100, 1, pred101, dist101);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph100.createGraphFromFile("V100-S0.8-XML.xml");
            System.out.println("Vertex: 100 S: 0.8 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph100, 1, pred101, dist101);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            matrixGraph500.createGraphFromFile("V500-S0.2-XML.xml");
            System.out.println("Vertex: 500 S: 0.2 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph500, 1, pred501, dist501);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph500.createGraphFromFile("V500-S0.5-XML.xml");
            System.out.println("Vertex: 500 S: 0.5 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph500, 1, pred501, dist501);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph500.createGraphFromFile("V500-S0.75-XML.xml");
            System.out.println("Vertex: 500 S: 0.75 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph500, 1, pred501, dist501);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph500.createGraphFromFile("V500-S0.8-XML.xml");
            System.out.println("Vertex: 500 S: 0.8 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph500, 1, pred501, dist501);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            matrixGraph1000.createGraphFromFile("V1000-S0.2-XML.xml");
            System.out.println("Vertex: 1000 S: 0.2 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph1000, 1, pred1001, dist1001);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph1000.createGraphFromFile("V1000-S0.5-XML.xml");
            System.out.println("Vertex: 1000 S: 0.5 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph1000, 1, pred1001, dist1001);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph1000.createGraphFromFile("V1000-S0.75-XML.xml");
            System.out.println("Vertex: 1000 S: 0.75 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph1000, 1, pred1001, dist1001);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph1000.createGraphFromFile("V1000-S0.8-XML.xml");
            System.out.println("Vertex: 1000 S: 0.8 ");
            startTime = System.currentTimeMillis();
            AlgorithmOfDijkstra algorithmOfDijkstra = new AlgorithmOfDijkstra(matrixGraph1000, 1, pred1001, dist1001);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("The graph ADT implemented using adjacency list, Algorithm Of Prim: \n");

        {
            listGraphs10.createGraphFromFile("V10-S0.2-XML.xml");
            System.out.println("Vertex: 10 S: 0.2 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs10,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs10.createGraphFromFile("V10-S0.5-XML.xml");
            System.out.println("Vertex: 10 S: 0.5 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs10,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs10.createGraphFromFile("V10-S0.75-XML.xml");
            System.out.println("Vertex: 10 S: 0.75 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs10,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs10.createGraphFromFile("V10-S0.8-XML.xml");
            System.out.println("Vertex: 10 S: 0.8 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs10,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            listGraphs50.createGraphFromFile("V50-S0.2-XML.xml");
            System.out.println("Vertex: 50 S: 0.2 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs50,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs50.createGraphFromFile("V50-S0.5-XML.xml");
            System.out.println("Vertex: 50 S: 0.5 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs50,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs50.createGraphFromFile("V50-S0.75-XML.xml");
            System.out.println("Vertex: 50 S: 0.75 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs50,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs50.createGraphFromFile("V50-S0.8-XML.xml");
            System.out.println("Vertex: 50 S: 0.8 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs50,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            listGraphs100.createGraphFromFile("V100-S0.2-XML.xml");
            System.out.println("Vertex: 100 S: 0.2 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs100,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs100.createGraphFromFile("V100-S0.5-XML.xml");
            System.out.println("Vertex: 100 S: 0.5 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs100,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs100.createGraphFromFile("V100-S0.75-XML.xml");
            System.out.println("Vertex: 100 S: 0.75 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs100,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs100.createGraphFromFile("V100-S0.8-XML.xml");
            System.out.println("Vertex: 100 S: 0.8 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs100,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            listGraphs500.createGraphFromFile("V500-S0.2-XML.xml");
            System.out.println("Vertex: 500 S: 0.2 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs500,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs500.createGraphFromFile("V500-S0.5-XML.xml");
            System.out.println("Vertex: 500 S: 0.5 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs500,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs500.createGraphFromFile("V500-S0.75-XML.xml");
            System.out.println("Vertex: 500 S: 0.75 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs500,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs500.createGraphFromFile("V500-S0.8-XML.xml");
            System.out.println("Vertex: 500 S: 0.8 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs500,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            listGraphs1000.createGraphFromFile("V1000-S0.2-XML.xml");
            System.out.println("Vertex: 1000 S: 0.2 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs1000,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs1000.createGraphFromFile("V1000-S0.5-XML.xml");
            System.out.println("Vertex: 1000 S: 0.5 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs1000,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs1000.createGraphFromFile("V1000-S0.75-XML.xml");
            System.out.println("Vertex: 1000 S: 0.75 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs1000,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            listGraphs1000.createGraphFromFile("V1000-S0.8-XML.xml");
            System.out.println("Vertex: 1000 S: 0.8 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(listGraphs1000,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("The graph ADT implemented using adjacency matrix, Algorithm Of Prim: \n");

        {
            matrixGraph10.createGraphFromFile("V10-S0.2-XML.xml");
            System.out.println("Vertex: 10 S: 0.2 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph10,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph10.createGraphFromFile("V10-S0.5-XML.xml");
            System.out.println("Vertex: 10 S: 0.5 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph10,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph10.createGraphFromFile("V10-S0.75-XML.xml");
            System.out.println("Vertex: 10 S: 0.75 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph10,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph10.createGraphFromFile("V10-S0.8-XML.xml");
            System.out.println("Vertex: 10 S: 0.8 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph10,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            matrixGraph50.createGraphFromFile("V50-S0.2-XML.xml");
            System.out.println("Vertex: 50 S: 0.2 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph50,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph50.createGraphFromFile("V50-S0.5-XML.xml");
            System.out.println("Vertex: 50 S: 0.5 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph50,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph50.createGraphFromFile("V50-S0.75-XML.xml");
            System.out.println("Vertex: 50 S: 0.75 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph50,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph50.createGraphFromFile("V50-S0.8-XML.xml");
            System.out.println("Vertex: 50 S: 0.8 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph50,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            matrixGraph100.createGraphFromFile("V100-S0.2-XML.xml");
            System.out.println("Vertex: 100 S: 0.2 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph100,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph100.createGraphFromFile("V100-S0.5-XML.xml");
            System.out.println("Vertex: 100 S: 0.5 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph100,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph100.createGraphFromFile("V100-S0.75-XML.xml");
            System.out.println("Vertex: 100 S: 0.75 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph100,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph100.createGraphFromFile("V100-S0.8-XML.xml");
            System.out.println("Vertex: 100 S: 0.8 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph100,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            matrixGraph500.createGraphFromFile("V500-S0.2-XML.xml");
            System.out.println("Vertex: 500 S: 0.2 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph500,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph500.createGraphFromFile("V500-S0.5-XML.xml");
            System.out.println("Vertex: 500 S: 0.5 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph500,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph500.createGraphFromFile("V500-S0.75-XML.xml");
            System.out.println("Vertex: 500 S: 0.75 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph500,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph500.createGraphFromFile("V500-S0.8-XML.xml");
            System.out.println("Vertex: 500 S: 0.8 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph500,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        System.out.println("\n********************************\n");

        {
            matrixGraph1000.createGraphFromFile("V1000-S0.2-XML.xml");
            System.out.println("Vertex: 1000 S: 0.2 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph1000,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph1000.createGraphFromFile("V1000-S0.5-XML.xml");
            System.out.println("Vertex: 1000 S: 0.5 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph1000,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph1000.createGraphFromFile("V1000-S0.75-XML.xml");
            System.out.println("Vertex: 1000 S: 0.75 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph1000,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }

        {
            matrixGraph1000.createGraphFromFile("V1000-S0.8-XML.xml");
            System.out.println("Vertex: 1000 S: 0.8 ");
            AlgorithmOfPrim algorithmOfPrim = new AlgorithmOfPrim();
            startTime = System.currentTimeMillis();
            algorithmOfPrim.primsAlgorithm(matrixGraph1000,1);
            endTime = System.currentTimeMillis();
            timeofExe = endTime - startTime;
            System.out.println("Time of Exe : " + timeofExe + "ms\n");
        }*/



    }
}
