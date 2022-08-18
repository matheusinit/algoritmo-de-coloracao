// Classe Grafo
import Graph;
// Classe Vertice do grafo
import Vertice;

import java.util.ArrayList;

public class Coloracao {
    private Graph graph;
    // Primeiro ArrayList
    private ArrayList<ArrayList<Vertice>> verticesColorado;

    public Coloracao(Graph graph) {
        this.graph = graph;
    }

    public void handle() {
        ArrayList<Vertice> vertices = (ArrayList<Vertice>) graph.vertices();

        ArrayList<Vertice> verticesOrdenadoPorGrau = new ArrayList<>();

        int index = 0;
        int menorGrauIndex = 0;
        int menorGrau = Integer.MAX_VALUE;

        // ver todos os vertices
        // comparar o grau de cada com os outros

        /*
        * Ordernar os vertices pelo seu grau
        * */

        // Enquanto tiver vertices
        while (!vertices.isEmpty()) {
            // Pegar o vertice
            Vertice vertice = vertices.get(index);

            // Ver o seu grau
            int grau = graph.arestasIncidentes(vertice).size();

            // Se o grau for menor que o menor grau encontrado
            if (grau < menorGrau) {
                // se for guardar o seu index e o definir o seu grau como o menor
                menorGrauIndex = index;
                menorGrau = grau;
            }

            // Ir para o próximo vertice
            index++;

            // Se chegar no último elemento, definir o index como 0
            if (index == vertices.size() - 1) {
                index = 0;
            }
        }

        index = 0;

        /*
         * Percorrer os vertices ordenado por grau e adicionar os não adjacentes a lista
         * */

        while (!verticesOrdenadoPorGrau.isEmpty()) {
            // Instanciar a lista
            ArrayList<Vertice> coloracaoAtual = new ArrayList<>();

            // Pegar o vertice
            Vertice vertice = vertices.get(0);

            // Adicionar o vertice a lista de coloracao (cor atual)
            coloracaoAtual.add(vertice);

            // Index para comparação com o vertice principal
            int comparacaoIndex = index + 1;

            // Comparar o vertice principal com os outros vertices
            while (comparacaoIndex < vertices.size()) {
                // Se o vertice é adjacente, adicione a lista de coloração e remover da lista de vertices
                if (!graph.éAdjacente(vertice, vertices.get(comparacaoIndex))) {
                    coloracaoAtual.add(vertices.get(comparacaoIndex));
                    verticesOrdenadoPorGrau.remove(comparacaoIndex);
                }
            }

            // Adicionar lista de coloração, a lista de listas
            verticesColorado.add(coloracaoAtual);

            // Ir para o proximo vertice, ate a lista ficar vazia
            index++;
        }
    }
}
