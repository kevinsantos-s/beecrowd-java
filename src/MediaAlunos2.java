public class MediaAlunos2 {

    public static double calcMedia(int[] notaAlunos){
        int count = 0;

        for(int i = 0; i < notaAlunos.length; i++){
            count += notaAlunos[i];
        }
        return count / notaAlunos.length;
    }

    public static int acimaMedia(int[] notaAlunos, double mediaAlunos){
        int count = 0;

        for(int i = 0; i < notaAlunos.length; i++){
        if(notaAlunos[i] > mediaAlunos){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
    int[] notas = {0, 0, 10, 10, 5};

    double media = calcMedia(notas);
    int acimaMediaAlunos = acimaMedia(notas, media);

        System.out.println("a média das notas foi: " + media + "e a quant de alunos acima da media foi: " + acimaMediaAlunos );
    }
}
