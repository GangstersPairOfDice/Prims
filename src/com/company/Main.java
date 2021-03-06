package com.company;

public class Main {
    public static void main(String[] args) {
        // Making a new adjacency list and adding every unique city to the list as a vertex
        AdjacencyListGraph adjGraph = new AdjacencyListGraph();

        Vertex Roskilde = new Vertex("Roskilde");
        adjGraph.addVertex(Roskilde);
        Vertex Ringsted = new Vertex("Ringsted");
        adjGraph.addVertex(Ringsted);
        Vertex Haslev = new Vertex("Haslev");
        adjGraph.addVertex(Haslev);
        Vertex Naestved = new Vertex("Naestved");
        adjGraph.addVertex(Naestved);
        Vertex Slagelse = new Vertex("Slagelse");
        adjGraph.addVertex(Slagelse);
        Vertex Soro = new Vertex("Soro");
        adjGraph.addVertex(Soro);
        Vertex Holbaek = new Vertex("Holbaek");
        adjGraph.addVertex(Holbaek);
        Vertex Koge = new Vertex("Koge");
        adjGraph.addVertex(Koge);
        Vertex Vordingborg = new Vertex("Vordingborg");
        adjGraph.addVertex(Vordingborg);
        Vertex Korsor = new Vertex("Korsor");
        adjGraph.addVertex(Korsor);
        Vertex Kalundborg = new Vertex("Kalundborg");
        adjGraph.addVertex(Kalundborg);
        Vertex Jaegerspris = new Vertex("Jaegerspris");
        adjGraph.addVertex(Jaegerspris);
        Vertex Eskildstrup = new Vertex("Eskildstrup");
        adjGraph.addVertex(Eskildstrup);
        Vertex Maribo = new Vertex("Maribo");
        adjGraph.addVertex(Maribo);
        Vertex Nykobing = new Vertex("Nykobing");
        adjGraph.addVertex(Nykobing);
        Vertex Nakskov = new Vertex("Nakskov");
        adjGraph.addVertex(Nakskov);

        // Adding the distances between the cities
        adjGraph.newEdge(Eskildstrup,Maribo,28);
        adjGraph.newEdge(Maribo,Eskildstrup,28);
        adjGraph.newEdge(Eskildstrup,Nykobing,13);
        adjGraph.newEdge(Nykobing,Eskildstrup,13);
        adjGraph.newEdge(Eskildstrup,Vordingborg,24);
        adjGraph.newEdge(Vordingborg,Eskildstrup,24);
        adjGraph.newEdge(Haslev,Korsor,60);
        adjGraph.newEdge(Korsor,Haslev,60);
        adjGraph.newEdge(Haslev,Koge,24);
        adjGraph.newEdge(Koge,Haslev,24);
        adjGraph.newEdge(Haslev,Naestved,25);
        adjGraph.newEdge(Naestved,Haslev,25);
        adjGraph.newEdge(Haslev,Ringsted,19);
        adjGraph.newEdge(Ringsted,Haslev,19);
        adjGraph.newEdge(Haslev,Roskilde,47);
        adjGraph.newEdge(Roskilde,Haslev,47);
        adjGraph.newEdge(Haslev,Slagelse,48);
        adjGraph.newEdge(Slagelse,Haslev,48);
        adjGraph.newEdge(Haslev,Soro,34);
        adjGraph.newEdge(Soro,Haslev,34);
        adjGraph.newEdge(Haslev,Vordingborg,40);
        adjGraph.newEdge(Vordingborg,Haslev,40);
        adjGraph.newEdge(Holbaek,Jaegerspris,34);
        adjGraph.newEdge(Jaegerspris,Holbaek,34);
        adjGraph.newEdge(Holbaek,Kalundborg,44);
        adjGraph.newEdge(Kalundborg,Holbaek,44);
        adjGraph.newEdge(Holbaek,Korsor,66);
        adjGraph.newEdge(Korsor,Holbaek,66);
        adjGraph.newEdge(Holbaek,Ringsted,36);
        adjGraph.newEdge(Ringsted,Holbaek,36);
        adjGraph.newEdge(Holbaek,Roskilde,32);
        adjGraph.newEdge(Roskilde,Holbaek,32);
        adjGraph.newEdge(Holbaek,Slagelse,46);
        adjGraph.newEdge(Slagelse,Holbaek,46);
        adjGraph.newEdge(Holbaek,Soro,34);
        adjGraph.newEdge(Soro,Holbaek,34);
        adjGraph.newEdge(Jaegerspris,Korsor,95);
        adjGraph.newEdge(Korsor,Jaegerspris,95);
        adjGraph.newEdge(Jaegerspris,Koge,58);
        adjGraph.newEdge(Koge,Jaegerspris,58);
        adjGraph.newEdge(Jaegerspris,Ringsted,56);
        adjGraph.newEdge(Ringsted,Jaegerspris,56);
        adjGraph.newEdge(Jaegerspris,Roskilde,33);
        adjGraph.newEdge(Roskilde,Jaegerspris,33);
        adjGraph.newEdge(Jaegerspris,Slagelse,74);
        adjGraph.newEdge(Slagelse,Jaegerspris,74);
        adjGraph.newEdge(Jaegerspris,Soro,63);
        adjGraph.newEdge(Soro,Jaegerspris,63);
        adjGraph.newEdge(Kalundborg,Ringsted,62);
        adjGraph.newEdge(Ringsted,Kalundborg,62);
        adjGraph.newEdge(Kalundborg,Roskilde,70);
        adjGraph.newEdge(Roskilde,Kalundborg,70);
        adjGraph.newEdge(Kalundborg,Slagelse,39);
        adjGraph.newEdge(Slagelse,Kalundborg,39);
        adjGraph.newEdge(Kalundborg,Soro,51);
        adjGraph.newEdge(Soro,Kalundborg,51);
        adjGraph.newEdge(Korsor,Naestved,45);
        adjGraph.newEdge(Naestved,Korsor,45);
        adjGraph.newEdge(Korsor,Slagelse,20);
        adjGraph.newEdge(Slagelse,Korsor,20);
        adjGraph.newEdge(Koge,Naestved,45);
        adjGraph.newEdge(Naestved,Koge,45);
        adjGraph.newEdge(Koge,Ringsted,28);
        adjGraph.newEdge(Ringsted,Koge,28);
        adjGraph.newEdge(Koge,Roskilde,25);
        adjGraph.newEdge(Roskilde,Koge,25);
        adjGraph.newEdge(Koge,Vordingborg,60);
        adjGraph.newEdge(Vordingborg,Koge,60);
        adjGraph.newEdge(Maribo,Nakskov,27);
        adjGraph.newEdge(Nakskov,Maribo,27);
        adjGraph.newEdge(Maribo,Nykobing,26);
        adjGraph.newEdge(Nykobing,Maribo,26);
        adjGraph.newEdge(Naestved,Roskilde,57);
        adjGraph.newEdge(Roskilde,Naestved,57);
        adjGraph.newEdge(Naestved,Ringsted,26);
        adjGraph.newEdge(Ringsted,Naestved,26);
        adjGraph.newEdge(Naestved,Slagelse,37);
        adjGraph.newEdge(Slagelse,Naestved,37);
        adjGraph.newEdge(Naestved,Soro,32);
        adjGraph.newEdge(Soro,Naestved,32);
        adjGraph.newEdge(Naestved,Vordingborg,28);
        adjGraph.newEdge(Vordingborg,Naestved,28);
        adjGraph.newEdge(Ringsted,Roskilde,31);
        adjGraph.newEdge(Roskilde,Ringsted,31);
        adjGraph.newEdge(Ringsted,Soro,15);
        adjGraph.newEdge(Soro,Ringsted,15);
        adjGraph.newEdge(Ringsted,Vordingborg,58);
        adjGraph.newEdge(Vordingborg,Ringsted,58);
        adjGraph.newEdge(Slagelse,Soro,14);
        adjGraph.newEdge(Soro,Slagelse,14);

        adjGraph.printGraph();
        adjGraph.Prims();

    }
}