import entity.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Lote: ");
                    String lote = sc.nextLine();

                    System.out.println("Tipo de produto:");
                    System.out.println("1 - Eletrônico (Smartphone)");
                    System.out.println("2 - Alimentício (Perecível)");
                    System.out.print("Escolha: ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        // Eletrônico -> Smartphone
                        System.out.print("Tensão: ");
                        String tensao = sc.nextLine();
                        System.out.print("Capacidade da bateria (ex: 4000mAh): ");
                        String bateria = sc.nextLine();
                        System.out.print("Suporta 5G? (true/false): ");
                        boolean c5g = sc.nextBoolean();
                        sc.nextLine();

                        produtos.add(new Smartphone(codigo, nome, lote, tensao, bateria, c5g));
                        System.out.println("Smartphone adicionado.");
                    } else if (tipo == 2) {
                        // Alimentício -> ProdutoPerecivel
                        System.out.print("Data de Validade: ");
                        String validade = sc.nextLine();
                        System.out.print("Embalagem íntegra? (true/false): ");
                        boolean emb = sc.nextBoolean();
                        sc.nextLine();

                        System.out.print("Temperatura de armazenamento: ");
                        String tempArmazenamento = sc.nextLine();
                        System.out.print("Temperatura mínima: ");
                        String tempMin = sc.nextLine();
                        System.out.print("Temperatura máxima: ");
                        String tempMax = sc.nextLine();

                        ProdutoPerecivel pp = new ProdutoPerecivel();
                        pp.setCodigo(codigo);
                        pp.setNome(nome);
                        pp.setLote(lote);
                        pp.setDataValidade(validade);
                        pp.setEmbalagemIntegra(emb);
                        pp.setTemperaturaArmazenamento(tempArmazenamento);
                        pp.setTemperaturaMin(tempMin);
                        pp.setTemperaturaMax(tempMax);

                        produtos.add(pp);
                        System.out.println("Produto perecível adicionado.");
                    } 
                    else {
                        System.out.println("Tipo inválido.");
                    }
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } 
                    else {
                        System.out.println("\n=== Lista de Produtos ===");
                        for (Produto p : produtos) {
                            System.out.println(p.getDetalhes());
                            if (p instanceof Smartphone) {
                                Smartphone s = (Smartphone) p;
                                System.out.println("Tipo: Smartphone");
                                System.out.println("Tensão: " + s.getTensao());
                                System.out.println("Bateria: " + s.getCapacidadeDaBateria());
                                System.out.println("5G: " + s.isConectividade5G());
                            } 
                            else if (p instanceof ProdutoPerecivel) {
                                ProdutoPerecivel pp = (ProdutoPerecivel) p;
                                System.out.println("Tipo: Produto Perecível");
                                System.out.println("Validade: " + pp.getDataValidade());
                                System.out.println("Embalagem íntegra: " + pp.getEmbalagemIntegra());
                                System.out.println("Temp atual: " + pp.getTemperaturaArmazenamento());
                                System.out.println("Faixa: " + pp.getTemperaturaMin() + " a " + pp.getTemperaturaMax());
                            }
                            p.inspecionarQualidade();
                            System.out.println("Aprovado: " + p.isEstaAprovado());
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
