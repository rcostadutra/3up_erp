/**
 * 
 */
package br.com.threeup.model;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * @author Thiago
 * 
 */
@Entity
public class ContaBancaria implements Serializable {

    private static final long serialVersionUID = -21253204658480479L;

    @Id
    @GeneratedValue
    private Long id;

    private String carteira;

    private Long convenio;

    private Long diasProtesto;

    private String digitoAgencia;

    private String digitoConta;

    private String gerenteConta;

    private Long instrucaoI;

    private Long instrucaoII;

    private BigDecimal limiteConta;

    private String mnemonico;

    private String nrAgencia;

    private String nrConta;

    private Long remessaFinal;

    private BigDecimal saldoAbertura;

    private Long seqRemessa;

    private String telefone;

    private String tipoConta;


    /**
     * @return the id
     */
    public Long getId() {

        return id;
    }


    /**
     * @param id
     *            the id to set
     */
    public void setId( Long id ) {

        this.id = id;
    }


    /**
     * @return the carteira
     */
    public String getCarteira() {

        return carteira;
    }


    /**
     * @param carteira
     *            the carteira to set
     */
    public void setCarteira( String carteira ) {

        this.carteira = carteira;
    }


    /**
     * @return the convenio
     */
    public Long getConvenio() {

        return convenio;
    }


    /**
     * @param convenio
     *            the convenio to set
     */
    public void setConvenio( Long convenio ) {

        this.convenio = convenio;
    }


    /**
     * @return the diasProtesto
     */
    public Long getDiasProtesto() {

        return diasProtesto;
    }


    /**
     * @param diasProtesto
     *            the diasProtesto to set
     */
    public void setDiasProtesto( Long diasProtesto ) {

        this.diasProtesto = diasProtesto;
    }


    /**
     * @return the digitoAgencia
     */
    public String getDigitoAgencia() {

        return digitoAgencia;
    }


    /**
     * @param digitoAgencia
     *            the digitoAgencia to set
     */
    public void setDigitoAgencia( String digitoAgencia ) {

        this.digitoAgencia = digitoAgencia;
    }


    /**
     * @return the digitoConta
     */
    public String getDigitoConta() {

        return digitoConta;
    }


    /**
     * @param digitoConta
     *            the digitoConta to set
     */
    public void setDigitoConta( String digitoConta ) {

        this.digitoConta = digitoConta;
    }


    /**
     * @return the gerenteConta
     */
    public String getGerenteConta() {

        return gerenteConta;
    }


    /**
     * @param gerenteConta
     *            the gerenteConta to set
     */
    public void setGerenteConta( String gerenteConta ) {

        this.gerenteConta = gerenteConta;
    }


    /**
     * @return the instrucaoI
     */
    public Long getInstrucaoI() {

        return instrucaoI;
    }


    /**
     * @param instrucaoI
     *            the instrucaoI to set
     */
    public void setInstrucaoI( Long instrucaoI ) {

        this.instrucaoI = instrucaoI;
    }


    /**
     * @return the instrucaoII
     */
    public Long getInstrucaoII() {

        return instrucaoII;
    }


    /**
     * @param instrucaoII
     *            the instrucaoII to set
     */
    public void setInstrucaoII( Long instrucaoII ) {

        this.instrucaoII = instrucaoII;
    }


    /**
     * @return the limiteConta
     */
    public BigDecimal getLimiteConta() {

        return limiteConta;
    }


    /**
     * @param limiteConta
     *            the limiteConta to set
     */
    public void setLimiteConta( BigDecimal limiteConta ) {

        this.limiteConta = limiteConta;
    }


    /**
     * @return the mnemonico
     */
    public String getMnemonico() {

        return mnemonico;
    }


    /**
     * @param mnemonico
     *            the mnemonico to set
     */
    public void setMnemonico( String mnemonico ) {

        this.mnemonico = mnemonico;
    }


    /**
     * @return the nrAgencia
     */
    public String getNrAgencia() {

        return nrAgencia;
    }


    /**
     * @param nrAgencia
     *            the nrAgencia to set
     */
    public void setNrAgencia( String nrAgencia ) {

        this.nrAgencia = nrAgencia;
    }


    /**
     * @return the nrConta
     */
    public String getNrConta() {

        return nrConta;
    }


    /**
     * @param nrConta
     *            the nrConta to set
     */
    public void setNrConta( String nrConta ) {

        this.nrConta = nrConta;
    }


    /**
     * @return the remessaFinal
     */
    public Long getRemessaFinal() {

        return remessaFinal;
    }


    /**
     * @param remessaFinal
     *            the remessaFinal to set
     */
    public void setRemessaFinal( Long remessaFinal ) {

        this.remessaFinal = remessaFinal;
    }


    /**
     * @return the saldoAbertura
     */
    public BigDecimal getSaldoAbertura() {

        return saldoAbertura;
    }


    /**
     * @param saldoAbertura
     *            the saldoAbertura to set
     */
    public void setSaldoAbertura( BigDecimal saldoAbertura ) {

        this.saldoAbertura = saldoAbertura;
    }


    /**
     * @return the seqRemessa
     */
    public Long getSeqRemessa() {

        return seqRemessa;
    }


    /**
     * @param seqRemessa
     *            the seqRemessa to set
     */
    public void setSeqRemessa( Long seqRemessa ) {

        this.seqRemessa = seqRemessa;
    }


    /**
     * @return the telefone
     */
    public String getTelefone() {

        return telefone;
    }


    /**
     * @param telefone
     *            the telefone to set
     */
    public void setTelefone( String telefone ) {

        this.telefone = telefone;
    }


    /**
     * @return the tipoConta
     */
    public String getTipoConta() {

        return tipoConta;
    }


    /**
     * @param tipoConta
     *            the tipoConta to set
     */
    public void setTipoConta( String tipoConta ) {

        this.tipoConta = tipoConta;
    }

}
