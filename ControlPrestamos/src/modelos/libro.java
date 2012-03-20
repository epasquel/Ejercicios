
package modelos;


public class libro {

    public libro(String codLibro, String titLibro, String matLibro, Boolean flagEnable) {
        this.codLibro = codLibro;
        this.titLibro = titLibro;
        this.matLibro = matLibro;
        this.flagEnable = flagEnable;
    }

    public String getCodLibro() {
        return codLibro;
    }

    public void setCodLibro(String codLibro) {
        this.codLibro = codLibro;
    }

    public Boolean getFlagEnable() {
        return flagEnable;
    }

    public void setFlagEnable(Boolean flagEnable) {
        this.flagEnable = flagEnable;
    }

    public String getMatLibro() {
        return matLibro;
    }

    public void setMatLibro(String matLibro) {
        this.matLibro = matLibro;
    }

    public String getTitLibro() {
        return titLibro;
    }

    public void setTitLibro(String titLibro) {
        this.titLibro = titLibro;
    }
    
    private String codLibro;
    private String titLibro;
    private String matLibro;
    private Boolean flagEnable;
    private Boolean staLibro;

    public Boolean getStaLibro() {
        return staLibro;
    }

    public void setStaLibro(Boolean staLibro) {
        this.staLibro = staLibro;
    }
    
}
