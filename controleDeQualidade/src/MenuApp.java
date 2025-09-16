import entity.Produto;
import entity.ProdutoEletronico;
import entity.ProdutoAlimenticio;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Lote: ");
                    String lote = sc.nextLine();

                    System.out.print("Tipo de produto: ");
                    System.out.println("1 - Produto Eletronico");
                    System.out.println("2 - Produto Alimenticio");
                    System.out.print("Escolha o tipo: ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        // Produto Eletronico
                        System.out.print("Tensão: ");
                        String tensao = sc.nextLine();
                        
                        ProdutoEletronico pe = new ProdutoEletronico(codigo, nome, lote, tensao);
                        produtos.add(pe);
                        System.out.println("Produto Eletrônico adicionado com sucesso!");
                    } else if (tipo == 2) {
                        // Produto Alimenticio
                        System.out.print("Data de Validade: ");
                        String dataValidade = sc.nextLine();
                        
                        System.out.print("Embalagem íntegra? (true/false): ");
                        boolean embalagemIntegra = sc.nextBoolean();
                        sc.nextLine();
                        
                        ProdutoAlimenticio pa = new ProdutoAlimenticio();
                        pa.setCodigo(codigo);
                        pa.setNome(nome);
                        pa.setLote(lote);
                        pa.setDataValidade(dataValidade);
                        pa.setEmbalagemIntegra(embalagemIntegra);
                        produtos.add(pa);
                        System.out.println("Produto Alimentício adicionado com sucesso!");
                    } else {
                        System.out.println("Tipo de produto inválido!");
                    }
                    break;

                case 2:
                    // Listar produtos
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("\n=== Lista de Produtos ===");
                        for (Produto p : produtos) {
                            System.out.println("Código: " + p.getCodigo());
                            System.out.println("Nome: " + p.getNome());
                            System.out.println("Lote: " + p.getLote());
                            
                            if (p instanceof ProdutoEletronico) {
                                ProdutoEletronico pe = (ProdutoEletronico) p;
                                System.out.println("Tipo: Eletrônico");
                                System.out.println("Tensão: " + pe.getTensao());
                            } else if (p instanceof ProdutoAlimenticio) {
                                ProdutoAlimenticio pa = (ProdutoAlimenticio) p;
                                System.out.println("Tipo: Alimentício");
                                System.out.println("Data de Validade: " + pa.getDataValidade());
                                System.out.println("Embalagem Íntegra: " + pa.getEmbalagemIntegra());
                            }
                            
                            p.inspecionarQualidade();
                            System.out.println("Aprovado: " + p.isEstaAprovado());
                            System.out.println("-------------------------");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}