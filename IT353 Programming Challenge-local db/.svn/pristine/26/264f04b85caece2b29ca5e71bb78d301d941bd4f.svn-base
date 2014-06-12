package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author bmsalm
 */
@ManagedBean
@ViewScoped
public class SearchBean 
{
    private String searchTerm;
    private String minPrice;
    private String maxPrice;
    
    private String searchCity;
    private String searchState;
    private String searchZip;
    
    private int searchIndex;
    private int resultsPerPage;
    
    public SearchBean()
    {
        searchTerm = "";
        minPrice = "";
        maxPrice = "";
        
        searchCity = "";
        searchState = "";
        searchZip = "";
        
        searchIndex = 0;
        resultsPerPage = 4;
    }

    public String getSearchTerm() {
        return searchTerm;
    }
    public String getMinPrice() {
        return minPrice;
    }
    public String getMaxPrice() {
        return maxPrice;
    }
    public String getSearchCity() {
        return searchCity;
    }
    public String getSearchState() {
        return searchState;
    }
    public String getSearchZip() {
        return searchZip;
    }
    public int getSearchIndex() {
        return searchIndex;
    }
    public int getResultsPerPage() {
        return resultsPerPage;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }
    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }
    public void setSearchCity(String searchCity) {
        this.searchCity = searchCity;
    }
    public void setSearchState(String searchState) {
        this.searchState = searchState;
    }
    public void setSearchZip(String searchZip) {
        this.searchZip = searchZip;
    }
    public void setSearchIndex(int searchIndex) {
        this.searchIndex = searchIndex;
    }
    public void setResultsPerPage(int resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }
}
