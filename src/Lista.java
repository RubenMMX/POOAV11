public class Lista {
    private int[] lista;

    public Lista() {

    }

    public int elementos() {
        return this.lista.length;
    }

    public void insercionFinal(int n) {
        int aux[] = new int[this.lista.length + 1];
        for (int i = 0; i < this.lista.length; i++) {
            aux[i] = this.lista[i];
        }
        aux[this.lista.length-1] = n;
        this.lista = aux;
    }

     public void insercionInicial(int n) {
        int aux[] = new int[this.lista.length+1];
        for (int i = 0; i < this.lista.length; i++) {
            aux[i+1] = this.lista[i];

        }
        aux[0] = n;
        this.lista = aux;

     }

     public void isertarIndices(int indice,int n) {
         int aux[] = new int[this.lista.length+1];
         boolean insertado = false;
        for (int i = 0; i < this.lista.length; i++) {
            aux[i] = this.lista[i];
            if(this.lista[i] == indice) {
                aux[i] = n;
                insertado = true;
                break;

            }
        }
        for(int i = indice; i < this.lista.length; i++) {
            aux[i+1] = this.lista[i];
        }
        this.lista = aux;


     }
     public int obtener(int indice) {
        return this.lista[indice];

    }
    public void insertarlista(Lista l){
        for(int i = 0; i < l.elementos(); i++) {
            int numero = l.obtener(i);
            this.insercionFinal(numero);
        }
    }
    public int buscar(int numero){
        int result = -1;
        for (int i = 0; i < this.lista.length; i++) {
            if(this.lista[i] == numero) {
                result = i;
                break;
            }
        }
        return result;
    }
    public void imprimir() {
        for (int i = 0; i < this.lista.length; i++) {
            System.out.print(this.lista[i] + " ");
        }
        System.out.println();
    }

}
