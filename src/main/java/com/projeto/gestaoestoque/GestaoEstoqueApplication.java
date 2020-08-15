package com.projeto.gestaoestoque;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projeto.gestaoestoque.model.Endereco;
import com.projeto.gestaoestoque.model.Entrada;
import com.projeto.gestaoestoque.model.Fornecedor;
import com.projeto.gestaoestoque.model.Produto;

@SpringBootApplication
public class GestaoEstoqueApplication {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("#VAICOMECAR");
		
		Fornecedor fornecedor1 = new Fornecedor("luca ltda", new Endereco("jetulio"));//Objeto 1 do tipo fornecedor
		Fornecedor fornecedor2 = new Fornecedor("SoftDev ltda", new Endereco("paralelas"));//Objeto 2 do tipo fornecedor
		
		System.out.println(fornecedor1);
		System.out.println(fornecedor2);

		Produto produto1 = new Produto();
		produto1.setCodProduto(1L);
		produto1.setNomeProduto("Toner TN 1000 impressora Brother1617nw");
		
		Produto produto2 = new Produto();
		produto2.setCodProduto(2L);
		produto2.setNomeProduto("Toner 85A impressora HP Laserjet");
		
		Produto produto3 = new Produto();
		produto1.setCodProduto(3L);
		produto1.setNomeProduto("Toner 83A impressora HP Laserjet M127");
		
		Produto produto4 = new Produto();
		produto2.setCodProduto(4L);
		produto2.setNomeProduto("Cilindro DR1000 impressora Brother1617nw");
		
		
		fornecedor1.addProdutoLista(produto1);
		fornecedor1.addProdutoLista(produto2);
		fornecedor2.addProdutoLista(produto3);
		fornecedor2.addProdutoLista(produto4);
		
		Entrada entrada = new Entrada(quantidadeEntradaEstoque, dataEntrada, horaEntrada)
		
		//fazer um for para mostrar os produtos.
//		for(Fornecedor f : fornecedor1) {
//			
//		}
		
		System.out.println(fornecedor1);
		System.out.println(fornecedor2);//so está mostrando os dados do fornecedor e não dos produtos
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//SpringApplication.run(GestaoEstoqueApplication.class, args);
		
	       //inicio do ciclo de vida do entityManagerFactory
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "Produto");
        //Inicio do ciclo de vida entityManager
//        EntityManager entityManager = entityManagerFactory.createEntityManager();


        //Cliente cliente = entityManager.find(Cliente.class, 1);
        //.out.println("Id: " + cliente.getId()); //busca o id do cliente
        //System.out.println("Nome: " + cliente.getNome()); //busca o nome do cliente

        /******************************************************
        inserir um registro no banco de dados*/
        //cria uma instancia da entidade cliente
        //Cliente cliente = new Cliente();
        //cliente.setNome("Centro Cirurgico");
        //cliente.setNome("Posto Central");

        //entityManager.getTransaction().begin();
        //vai persistir a entidade cliente no banco de dados
        //entityManager.persist(cliente);

        //entityManager.getTransaction().commit();


        /******************************************************
        trecho de código para remover um registro do banco de dados*/
        /*Cliente cliente = entityManager.find(Cliente.class, 2);
        entityManager.getTransaction().begin();
        entityManager.remove(cliente);
        entityManager.getTransaction().commit();*/

        /******************************************************
         atualização de registros */
        /*Cliente cliente = entityManager.find(Cliente.class, 1);
        entityManager.getTransaction().begin();
        cliente.setNome(cliente.getNome() + " - alterado");
        entityManager.getTransaction().commit();*/

        /*Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Pronto Socorro - PS");
        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();*/

        /*inserção de um objeto não gerenciador. Se nao passar o identificador, o merge vai realizar a inserção do registro*/
        /**Cliente cliente = new Cliente();
        cliente.setNome("Alojamento conjunto");
        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();*/


//        List<Integer> list1 = new ArrayList<>();//definindo uma lista de do tipo Integer(uma wrapper class)
//       List<String> list2 = new ArrayList<>();//definindo uma llista do tipo String



        /**
         * Exemplo de relacionamento @ManyToOne
         */
        //instanciando a classe departamento
//        Departamento dep = new Departamento();
//        dep.setNomeDepartamento("Administração");

//        Funcionario fun1 = new Funcionario("Maria gertrude");
        //fun1.setNomeCompleto("Maria");//seta o nome do funcionario
//        fun1.setDepartamento(dep);//vai setar o funcionario no departamento de vendas;

//        Funcionario fun2 = new Funcionario("Gertrude creidisnilde");
        //fun2.setNomeCompleto("Gertrude");//seta o nome do funcionario
//        fun2.setDepartamento(dep);//vai setar o funcionario no departamento de vendas;


        // definido uma List do tipo Funcionario e você passa os objetos para o método asList da Classe Arrays
        //List<Funcionario> listFunc = Arrays.asList(fun1, fun2);

        //list1.add(777888);//lista de integer
        //list1.add(11111);
        //list1.add(536516);
        //list2.add("maria");//lista de String
        //list2.add("lucas");

        //foresch para percorrer a lista e mostrar os dados
        //for (Funcionario f: listFunc){
        //    System.out.println("Lista 3: " + f.getNomeCompleto());//nessa linha eu preciso bucar(get) o que eu quero mostrar. coloccar o objeto nao adiante.
        //}


        //System.out.println("Lista 1: " + list1);
        //System.out.println("Lista 2: " + list2);

//        System.out.println("Nome do departamento: " + dep.getNomeDepartamento());
//        System.out.println("Nome do funcionario1: " + fun1.getNomeCompleto());
//        System.out.println("Nome do funcionario1: " + fun1.getDepartamento().getNomeDepartamento());
//        System.out.println("Nome do funcionario2: " + fun2.getNomeCompleto());
//        System.out.println("Nome do funcionario2: " + fun2.getDepartamento().getNomeDepartamento());
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(dep);
//        entityManager.persist(fun1);
//        entityManager.persist(fun2);
//        entityManager.getTransaction().commit();



        //fim do ciclo de vida do entityManager
//        entityManager.close();
        //fim do ciclo de vida do entityManagerFactory
//        entityManagerFactory.close();
	}

}
