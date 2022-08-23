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

  public static void execMapaSeridoRn() {
    Graph grafo = new Graph();

    // Cidades do Seridó
    Vertice caico = new Vertice("Caicó");
    Vertice currais_novos = new Vertice("Currais Novos");
    Vertice parelhas = new Vertice("Parelhas");
    Vertice jucurutu = new Vertice("Jucurutu");
    Vertice lagoa_nova = new Vertice("Lagoa Nova");
    Vertice jardim_de_piranhas = new Vertice("Jardim de Piranhas");
    Vertice jardim_do_serido = new Vertice("Jardim do Seridó");
    Vertice cerro_cora = new Vertice("Cerro Corá");
    Vertice acari = new Vertice("Acari");
    Vertice florania = new Vertice("Florânia");
    Vertice carnauba_dos_dantas = new Vertice("Carnaúba dos Dantas");
    Vertice serra_negra_do_norte = new Vertice("Serra Negra do Norte");
    Vertice cruzeta = new Vertice("Cruzeta");
    Vertice sao_vicente = new Vertice("São Vicente");
    Vertice sao_joao_do_sabugi = new Vertice("São João do Sabugi");
    Vertice equador = new Vertice("Equador");
    Vertice tenente_laurentino_cruz = new Vertice("Tenente Laurentino Cruz");
    Vertice ouro_branco = new Vertice("Ouro Branco");
    Vertice sao_jose_do_serido = new Vertice("São José do Seridó");
    Vertice sao_fernando = new Vertice("São Fernando");
    Vertice santana_do_serido = new Vertice("Santana do Seridó");
    Vertice timbauba_dos_batistas = new Vertice("Timbaúba dos Batistas");
    Vertice bodo = new Vertice("Bodô");
    Vertice ipueira = new Vertice("Ipueira");

    // Conexões
    grafo.inserirAresta(ipueira, sao_joao_do_sabugi, "1", false);
    grafo.inserirAresta(sao_joao_do_sabugi, caico, "1", false);
    grafo.inserirAresta(sao_joao_do_sabugi, serra_negra_do_norte, "1", false);
    grafo.inserirAresta(serra_negra_do_norte, timbauba_dos_batistas, "1", false);
    grafo.inserirAresta(serra_negra_do_norte, caico, "1", false);
    grafo.inserirAresta(serra_negra_do_norte, jardim_de_piranhas, "1", false);
    grafo.inserirAresta(timbauba_dos_batistas, caico, "1", false);
    grafo.inserirAresta(timbauba_dos_batistas, jardim_de_piranhas, "1", false);
    grafo.inserirAresta(timbauba_dos_batistas, sao_fernando, "1", false);
    grafo.inserirAresta(jardim_de_piranhas, sao_fernando, "1", false);
    grafo.inserirAresta(jardim_de_piranhas, jucurutu, "1", false);
    grafo.inserirAresta(sao_fernando, caico, "1", false);
    grafo.inserirAresta(sao_fernando, jucurutu, "1", false);
    grafo.inserirAresta(caico, jucurutu, "1", false);
    grafo.inserirAresta(caico, cruzeta, "1", false);
    grafo.inserirAresta(caico, sao_jose_do_serido, "1", false);
    grafo.inserirAresta(caico, jardim_do_serido, "1", false);
    grafo.inserirAresta(caico, ouro_branco, "1", false);
    grafo.inserirAresta(caico, florania, "1", false);
    grafo.inserirAresta(jucurutu, florania, "1", false);
    grafo.inserirAresta(florania, tenente_laurentino_cruz, "1", false);
    grafo.inserirAresta(florania, cruzeta, "1", false);
    grafo.inserirAresta(florania, sao_vicente, "1", false);
    grafo.inserirAresta(cruzeta, sao_vicente, "1", false);
    grafo.inserirAresta(cruzeta, acari, "1", false);
    grafo.inserirAresta(cruzeta, sao_jose_do_serido, "1", false);
    grafo.inserirAresta(sao_jose_do_serido, jardim_do_serido, "1", false);
    grafo.inserirAresta(sao_jose_do_serido, acari, "1", false);
    grafo.inserirAresta(jardim_do_serido, ouro_branco, "1", false);
    grafo.inserirAresta(jardim_do_serido, santana_do_serido, "1", false);
    grafo.inserirAresta(jardim_do_serido, acari, "1", false);
    grafo.inserirAresta(jardim_do_serido, parelhas, "1", false);
    grafo.inserirAresta(parelhas, equador, "1", false);
    grafo.inserirAresta(parelhas, carnauba_dos_dantas, "1", false);
    grafo.inserirAresta(carnauba_dos_dantas, acari, "1", false);
    grafo.inserirAresta(acari, currais_novos, "1", false);
    grafo.inserirAresta(currais_novos, sao_vicente, "1", false);
    grafo.inserirAresta(currais_novos, lagoa_nova, "1", false);
    grafo.inserirAresta(currais_novos, cerro_cora, "1", false);
    grafo.inserirAresta(lagoa_nova, bodo, "1", false);
    grafo.inserirAresta(lagoa_nova, cerro_cora, "1", false);
    grafo.inserirAresta(lagoa_nova, sao_vicente, "1", false);

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
    execMapaSeridoRn();
  }
}
