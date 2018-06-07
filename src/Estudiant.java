/**
 * @author dmartineza
 * @version 1.0
 * @since 07/06/2018
 */
public class Estudiant {
    private String nom;
    private String cognoms;
    private String dni;

    /**
     *
     * @param nom nom de l'estudiant
     * @param cognoms cognom de l'estudiant
     * @param dni dni de l'estudiant
     *            @return un estudiant creat
     */
    public Estudiant(String nom, String cognoms, String dni) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
    }
}
