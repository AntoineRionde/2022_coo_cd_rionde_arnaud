package donnees;

public class ComparateurPistes implements ComparateurCd{

    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        return cd1.getPistes().size() < cd2.getPistes().size();
    }
}
