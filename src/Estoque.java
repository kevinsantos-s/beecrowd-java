public class Estoque {

    public static int encontrarMaiorEstoque(int[] estoque){
        int maiorEstoque = estoque[0];

        for(int i = 0; i < estoque.length; i++){
            if(estoque[i] > maiorEstoque){
                maiorEstoque = estoque[i];
            }
        }
        return maiorEstoque;
    }

        public static int encontrarQuantMaiorEstoque(int[] estoque, int maiorEstoque){
            int count = 0;

            for(int i = 0; i < estoque.length; i++){
                if(estoque[i] == maiorEstoque){
                    count++;
                }
            }
            return count;
        }

    public static int contarEstoqueCritico(int[] estoque, int limiteMinimo){
    int count = 0;

    for(int i = 0; i < estoque.length; i++){
        if(estoque[i] < limiteMinimo){
            count++;
            }
        }
    return count;
    }

    public static void main(String[] args){

        int[] quantEstoque = {5, 20, 10, 2, 10, 20};
        int minimoLimite = 5;

        int maiorEstoque = encontrarMaiorEstoque(quantEstoque);
        int estoqueCritico = contarEstoqueCritico(quantEstoque, minimoLimite);

        int quantMaiorEstoque = encontrarQuantMaiorEstoque(quantEstoque, maiorEstoque);

        System.out.println("A maior quantidade de estoque é: " + maiorEstoque +
                " e a quantidade de estoques críticos é: " + estoqueCritico +
                " A quantidade de estoque com maior quantidade é: " + quantMaiorEstoque);
    }
}
