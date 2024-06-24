## Getting Started
Josue Gonzalez
Dennis Palomeque
version 2.2.1

metodos insert
Si el nodo raíz (root) es null, crea y retorna un nuevo nodo con el valor dado.
Si el valor a insertar es menor que el valor del nodo raíz, inserta el valor en el subárbol izquierdo recursivamente.
Si el valor a insertar es mayor que el valor del nodo raíz, inserta el valor en el subárbol derecho recursivamente.
Finalmente, retorna el nodo raíz actualizado.

metodoInvert
Si el nodo raíz (root) es null, retorna null.
Invierte recursivamente los subárboles izquierdo y derecho.
Intercambia el subárbol izquierdo con el subárbol derecho.
Retorna el nodo raíz invertido.

metodoList
Si el nodo raíz (root) es null, retorna una lista vacía.
Usa una cola (queue) para realizar un recorrido por niveles (BFS).
Mientras la cola no esté vacía, procesa cada nivel:
    Obtiene el tamaño del nivel actual.
    Procesa cada nodo del nivel, añadiendo sus hijos a la cola.
    Añade la lista de valores del nivel a la lista principal de niveles.
Retorna la lista de niveles.

metodoDepth
Si el nodo raíz (root) es null, retorna 0.
Calcula recursivamente la profundidad máxima de los subárboles izquierdo y derecho.
Retorna la mayor profundidad entre los dos subárboles más 1 (para contar el nodo actual).
