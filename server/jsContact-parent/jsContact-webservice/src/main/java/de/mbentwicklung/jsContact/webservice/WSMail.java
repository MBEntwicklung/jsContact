package de.mbentwicklung.jsContact.webservice;

/**
 * TODO
 * <p/>
 * User: Marc Bellmann
 * Date: 16.10.13
 * Time: 22:10
 */
public class WSMail {

    /**
     * ID des Clients
     */
    private Long clientId;

    /**
     * Text der Mail
     */
    private String mailText;

    /**
     * Konstuktor
     *
     * @param clientId ID des Clients
     * @param mailText Text der Mail
     */
    public WSMail(Long clientId, String mailText) {
        this.clientId = clientId;
        this.mailText = mailText;
    }

    /**
     * Getter
     *
     * @return ID des Clients
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * Setter
     *
     * @param clientId ID des Clients
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * Getter
     *
     * @return Text der Mail
     */
    public String getMailText() {
        return mailText;
    }

    /**
     * Setter
     *
     * @param mailText Text der Mail
     */
    public void setMailText(String mailText) {
        this.mailText = mailText;
    }
}
