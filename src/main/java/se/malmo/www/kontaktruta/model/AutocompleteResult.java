/**
 * 
 */
package se.malmo.www.kontaktruta.model;

/**
 * @author Henrik Karlsson, Pulsen
 *
 */
public class AutocompleteResult {
    String query;
    String[] suggestions;
    String[] data;

    /**
     * @return the query
     */
    public String getQuery() {
        return query;
    }
    /**
     * @param query the query to set
     */
    public void setQuery(String query) {
        this.query = query;
    }
    /**
     * @return the suggestions
     */
    public String[] getSuggestions() {
        return suggestions;
    }
    /**
     * @param suggestions the suggestions to set
     */
    public void setSuggestions(String[] suggestions) {
        this.suggestions = suggestions;
    }
    /**
     * @return the data
     */
    public String[] getData() {
        return data;
    }
    /**
     * @param data the data to set
     */
    public void setData(String[] data) {
        this.data = data;
    }
}
