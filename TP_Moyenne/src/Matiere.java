public class Matiere {
    public String label;

    public Matiere(String libelle) {
        this.label = libelle;
    }

    public float moyenne;
    public float[] notes;

    public float calculerMoyenne() {
        float sum = 0f;
        for (float note : notes) {
            sum += note;
        }
        moyenne = sum / notes.length;
        return moyenne;
    }
}