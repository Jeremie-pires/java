import java.util.ArrayList;
import java.util.List;

public class MoyenneG {
    public void jeu() {
        List<Matiere> matieres = new ArrayList<>();

        Matiere mat1 = new Matiere("Français");
        mat1.notes = new float[]{12, 8, 13, 6};
        mat1.calculerMoyenne();
        matieres.add(mat1);


        Matiere mat2 = new Matiere("Maths");
        mat2.notes = new float[]{4, 9, 18};
        mat2.calculerMoyenne();
        matieres.add(mat2);

        Matiere mat3 = new Matiere("Sport");
        mat3.notes = new float[]{15, 13, 17, 2, 6};
        mat3.calculerMoyenne();
        matieres.add(mat3);

        float sum = 0f;
        for (Matiere mat : matieres) {
            sum += mat.moyenne;
        }
        float moyenneg = sum / matieres.size();
        System.out.printf("La moyenne générale : %f%n", moyenneg);
    }

}