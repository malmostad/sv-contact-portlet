/**
 * 
 */
package se.malmo.www.kontaktruta.model;

import java.io.Serializable;

/**
 * @author HEKA
 *
 */
public class ContactKey implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 388616112743714308L;
    
    private String dn;
    private String district;
    
    /**
     * 
     */
    public ContactKey() {
        super();
    }

    /**
     * @param dn
     * @param district
     */
    public ContactKey(String dn, String district) {
        super();
        this.dn = dn;
        this.district = district;
    }

    /**
     * @return the dn
     */
    public String getDn() {
        return dn;
    }

    /**
     * @param dn the dn to set
     */
    public void setDn(String dn) {
        this.dn = dn;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj != null && obj instanceof ContactKey) {
            ContactKey ck = (ContactKey)obj;
            return (((this.dn == null && ck.getDn() == null) || this.dn.equals(ck.getDn()) &&
                    ((this.district == null && ck.getDistrict() == null) || this.district.equals(ck.getDistrict()))));
        }
        return false;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + (this.dn == null ? 0 :this.dn.hashCode());
        hash = hash * 31 + (this.district == null ? 0 : this.district.hashCode());
        return hash;
    }
    
}
