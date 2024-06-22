import main.Ejercicio_01_insert.InsertBST;
import main.Materia.Controlador.ArbolBinario;
import main.Materia.Modelo.Node;

/*
 *              1
 *          2       3
 *      4      5         6           
 *  7        8                            
 * 
 */
public class App {
    public static void main(String[] args) throws Exception {

        ArbolBinario arbolBinario = new ArbolBinario();
        Node nodeRoot = new Node(1);

        nodeRoot.setLeft(new Node(2));
        nodeRoot.setRight(new Node(3));

        nodeRoot.getLeft().setLeft(new Node(4));
        nodeRoot.getLeft().setRight(new Node(5));
        nodeRoot.getRight().setRight(new Node(6));
        nodeRoot.getLeft().getLeft().setLeft(new Node(7));
        nodeRoot.getLeft().getRight().setRight(new Node(8));
        System.out.println("Preorder - Loop");
        arbolBinario.preOrderLopp(nodeRoot);
        System.out.println("\nPreOrden -Recursivo");
        arbolBinario.preOrderRecursivo(nodeRoot);
        System.out.println("\nPostOrden -Lopp");
        arbolBinario.postOrderLopp(nodeRoot);
        System.out.println("\nPostOrden -Recursivo");
        arbolBinario.postOrderRecursivo(nodeRoot);
        System.out.println("\nInOrden- Recursivo");
        arbolBinario.inOrdenRecursivo(nodeRoot);



        InsertBST bst = new InsertBST();

        Node root = null; // Árbol vacio
        root = bst.insert(root, 5);
        root = bst.insert(root, 3);
        root = bst.insert(root, 7);
        root = bst.insert(root, 2);
        root = bst.insert(root, 4);
        root = bst.insert(root, 6);
        root = bst.insert(root, 8);
        System.out.println("\nValores en el arbol:");
    }
}
