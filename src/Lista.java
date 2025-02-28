public class Lista {
    private int[] lista;

    public Lista() {
        lista = new int[0];
    }

    public int elementos() {
        return this.lista.length;
    }

    public void insercionFinal(int n) {
        int aux[] = new int[this.lista.length + 1];
        for (int i = 0; i < this.lista.length; i++) {
            aux[i] = this.lista[i];
        }
        aux[aux.length - 1] = n;
        this.lista = aux;
    }

    public void insercionInicial(int n) {
        int aux[] = new int[this.lista.length + 1];
        for (int i = 0; i < this.lista.length; i++) {
            aux[i + 1] = this.lista[i];

        }
        aux[0] = n;
        this.lista = aux;

    }

    public void isertarIndices(int indice, int n) {

        int aux[] = new int[this.lista.length + 1];

        for (int i = 0; i < indice; i++) {
            aux[i] = this.lista[i];
        }
        aux[indice] = n;

        for (int i = indice; i < this.lista.length; i++) {
            aux[i + 1] = this.lista[i];
        }
        this.lista = aux;

    }

    public int obtener(int indice) {
        return this.lista[indice];

    }

    public void insertarlista(Lista l) {
        for (int i = 0; i < l.elementos(); i++) {
            int numero = l.obtener(i);
            this.insercionFinal(numero);
        }
    }

    public int buscar(int numero) {
        int result = -1;
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == numero) {
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
    public static Lista listaConcatena(Lista l1, Lista l2){
        Lista aux = new Lista();
        aux.insertarlista(l1);
        aux.insertarlista(l2);
        return aux;

    }

    public boolean equals(Object o){
        Lista l = (Lista) o;
        boolean iguales = true;
        if(this.elementos() == l.elementos()){
            for(int i = 0; i < this.lista.length; i++){
                if(this.obtener(i) != l.obtener(i)){}
            }

        }else{
            iguales = false;
        }

        return iguales;
    }
    public void eliminar(int posicion){
        if(posicion >= 0 && posicion < this.lista.length){
            int[] aux = new int[this.lista.length - 1];
            for (int i = 0; i < this.lista.length; i++) {
                if (i < posicion) {
                    aux[i] = this.lista[i];
                }else{
                    aux[i] = this.lista[i+1];
                }
            }
            this.lista = aux;
        }


    }


}
