

package controlador;

/**
 *
 * @author Wilkince Mauricio
 */
public class Verificador {
    private static boolean error = false;

    /**
     * @return the error
     */
    public static boolean isError() {
        return error;
    }

    /**
     * @param aError the error to set
     */
    public static void setError(boolean aError) {
        error = aError;
    }  
    
}
