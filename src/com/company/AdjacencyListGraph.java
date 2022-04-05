package com.company;

import java.util.ArrayList;

public class AdjacencyListGraph {
    private ArrayList<Vertex> vertices;

    public AdjacencyListGraph() {
        vertices = new ArrayList<Vertex>();
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void newEdge(Vertex from, Vertex to, Integer dist) {
        if (!(vertices.contains(from) && vertices.contains(to))) {
            System.out.println("Vertex not found");
            return;
        }

        Edge newEdge = new Edge(from, to, dist);
    }

    public void printGraph() {
        Vertex currentVertex;
        for (int i = 0; i < vertices.size(); i++) {
            currentVertex = vertices.get(i);
            System.out.println("From Vertex: " + currentVertex.getName());
            for (int j = 0; j < currentVertex.getOutEdges().size(); j++) {
                Edge currentEdge = currentVertex.getOutEdges().get(j);
                System.out.println("to " + currentEdge.getToVertex().getName() + ", the distance is " + currentEdge.getWeight() + " km");
            }
            System.out.println(" ");
        }
    }

    public void Prims() {
        // Gets the starting vertex
        Vertex start = vertices.get(0);
        start.setVisited();
        int dist = 0;

        MinHeap<Edge> prioQ = new MinHeap<Edge>();

        // Uses MinHeap to capture all edges relating to the starting point
        for (Edge edge : start.getOutEdges()) {
            prioQ.Insert(edge);
        }

        // While the priority queue is not empty:
        while (!prioQ.isEmpty()) {
            // Gets minimum edge length
            Edge edge = prioQ.extractMin();

            // If the selected edge has not been visited, travel that path
            if (!edge.getToVertex().getVisited()) {
                edge.getToVertex().setPrev(edge.getFromVertex());
                dist += edge.getWeight();
                edge.getToVertex().distance = edge.getWeight();
                edge.getToVertex().setVisited();

                // Start going through possible edges from starting vertex
                for (Edge out : edge.getToVertex().getOutEdges()) {
                    // If the vertex has not been picked, then pop it into the MinHeap
                    if (!out.getToVertex().getVisited()) {
                        prioQ.Insert(out);
                    }
                }
            }
        }

        System.out.println("The total distance is: " + dist + " km");
        for (Vertex v: vertices) {
            // If the previous vertex does not exist, choose it as the starting point.
            if (v.getPrev() == null) {
                System.out.println(v.getName() + " is the starting point");
            }

            else {
                System.out.println(v.getPrev().getName() + " is connected with " + v.getName() + " (distance: " + v.getDistance() + " km)");
            }
        }

        System.out.println("The total price: " + (dist * 1000000) + " kr");

    }
}

class Vertex implements Comparable<Vertex> {
    private String Name;
    private ArrayList<Edge> outEdges;
    private Vertex prev;
    private boolean beenVisited;
    Integer distance = Integer.MAX_VALUE;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Edge> getOutEdges() {
        return outEdges;
    }

    public void setOutEdges(ArrayList<Edge> outEdges) {
        this.outEdges = outEdges;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Vertex(String id) {
        this.Name = id;
        outEdges = new ArrayList<>();
        this.prev = null;
        this.beenVisited = false;
    }

    public void addOutEdge(Edge outEdge) {
        outEdges.add(outEdge);
    }

    public void setPrev(Vertex prev) {
        this.prev = prev;
    }

    public Vertex getPrev() {
        return this.prev;
    }

    public boolean getVisited() {
        return this.beenVisited;
    }

    public void setVisited() {
        this.beenVisited = true;
    }

    @Override
    public int compareTo(Vertex o) {
        if (this.distance < o.distance)
            return -1;
        if (this.distance > o.distance)
            return 1;
        return 0;
    }
}

class Edge implements Comparable<Edge> {
    private Vertex fromVertex;
    private Vertex toVertex;
    private Integer weight;
    public Vertex getFromVertex() {
        return fromVertex;
    }

    public void setFromVertex(Vertex fromVertex) {
        this.fromVertex = fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public void setToVertex(Vertex toVertex) {
        this.toVertex = toVertex;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Edge(Vertex from, Vertex to, Integer cost) {
        fromVertex = from;
        toVertex = to;
        weight = cost;
        from.addOutEdge(this);
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight.compareTo(o.weight);
    }
}
