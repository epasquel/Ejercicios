
package modelos;

import java.util.ArrayList;

public class cliente {

    public cliente(String codCliente, String nomCliente, String apeCliente, Integer canPrestamos) {
        this.codCliente = codCliente;
        this.nomCliente = nomCliente;
        this.apeCliente = apeCliente;
        this.canPrestamos = canPrestamos;
    }

    public String getApeCliente() {
        return apeCliente;
    }

    public void setApeCliente(String apeCliente) {
        this.apeCliente = apeCliente;
    }

    public Integer getCanPrestamos() {
        return canPrestamos;
    }

    public void setCanPrestamos(Integer canPrestamos) {
        this.canPrestamos = canPrestamos;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public Boolean getFlagEnable() {
        return flagEnable;
    }

    public void setFlagEnable(Boolean flagEnable) {
        this.flagEnable = flagEnable;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }
    
    private String codCliente;
    private String nomCliente;
    private String apeCliente;
    private Integer canPrestamos;
    private Boolean flagEnable;
    private ArrayList<libro> listLibro;


    
}
