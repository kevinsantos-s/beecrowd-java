public class MediaAlunos {
    public static int calcMedia(int[] notaAlunos){
        int count = 0;

        for(int i = 0; i < notaAlunos.length; i++){
            count = count + notaAlunos[i];
        }
        return count / notaAlunos.length;
    }

            public static int acimaMedia(int[] notaAlunos, double mediaDosAlunos){
                int count = 0;

                for(int i = 0; i < notaAlunos.length; i++){
                    if(notaAlunos[i] > mediaDosAlunos ){
                        count++;
                    }
                }
                return count;
            }

    public static void main(String[] args){
        int[] notasAlunos = {4, 5, 9, 10, 5};

        double media = calcMedia(notasAlunos);
        int acimaMediaAlunos = acimaMedia(notasAlunos, media);


        System.out.println("a nota média dos alunos é: " + media + "e a quant de alunos acima da média é: " + acimaMediaAlunos);

    }
}


// [1, 2, 3, 4 ]

//i = 0, enquanto i for menor que a quantidade de nota de alunos, i ++
//se a quantidade de nota de aluno for maior que i, adiciona no contador, essa é a
// quantidade de alunos que estao acima da media