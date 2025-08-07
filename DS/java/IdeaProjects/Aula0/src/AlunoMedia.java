public class AlunoMedia {
    public double nota1;
    public double nota2;
    public double nota3;

    public double media;

    public static void verMedia(double n1, double n2, double n3){
        double media = (n1+n2+n3)/3;
        System.out.printf("olá, aluno! sua média é: %.2f", media);

    }
}
