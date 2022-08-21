import Graph.Graph;
import Graph.Vertice;
import Coloring.Coloracao;

import java.util.ArrayList;

public class Main {
  public static void testColoracao() {
    Graph grafo = new Graph();

    Vertice verticeA = new Vertice("A");
    Vertice verticeB = new Vertice("B");
    Vertice verticeC = new Vertice("C");
    Vertice verticeD = new Vertice("D");

    grafo.inserirAresta(verticeA, verticeB, 2, false);
    grafo.inserirAresta(verticeA, verticeC, 2, false);
    grafo.inserirAresta(verticeB, verticeD, 2, false);
    grafo.inserirAresta(verticeC, verticeD, 2, false);

    Coloracao coloracao = new Coloracao(grafo);

    ArrayList<ArrayList<Vertice>> colorado = coloracao.handle();

    System.out.println(colorado.toString());
  }

  public static void testColoracao2() {
    Graph grafo = new Graph();

    Vertice verticeA = new Vertice("A");
    Vertice verticeB = new Vertice("B");
    Vertice verticeC = new Vertice("C");
    Vertice verticeD = new Vertice("D");
    Vertice verticeE = new Vertice("E");
    Vertice verticeF = new Vertice("F");

    grafo.inserirAresta(verticeA, verticeB, 2, false);
    grafo.inserirAresta(verticeA, verticeC, 4, false);
    grafo.inserirAresta(verticeB, verticeC, 3, false);
    grafo.inserirAresta(verticeB, verticeE, 5, false);
    grafo.inserirAresta(verticeB, verticeD, 1, false);
    grafo.inserirAresta(verticeC, verticeD, 2, false);
    grafo.inserirAresta(verticeD, verticeE, 1, false);
    grafo.inserirAresta(verticeD, verticeF, 4, false);
    grafo.inserirAresta(verticeE, verticeF, 2, false);

    Coloracao coloracao = new Coloracao(grafo);

    ArrayList<ArrayList<Vertice>> colorado = coloracao.handle();

    System.out.println(colorado.toString());
  }

  public static void main(String[] args) {
    testColoracao();
    testColoracao2();
  }
}
