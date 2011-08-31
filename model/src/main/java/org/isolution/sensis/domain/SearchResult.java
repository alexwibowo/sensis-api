package org.isolution.sensis.domain;

import java.util.Date;
import java.util.List;

/**
 * User: Alex Wibowo
 * Date: 19/08/11
 * Time: 9:54 PM
 */
public class SearchResult {

    private int count;

    private int totalResults;

    private int totalPages;

    /**
     * Response code. Indicates success, failure or partial success 
     */
    private int code;

    /**
     * Response message. Contains an error message (if any).
     */
    private String message;

    private String executedQuery;

    private String originalQuery;

    private int currentPage;

    private Date date;

    /**
     * Time taken to process the request. Reported in milliseconds.
     */
    private int time;

    private List<ResultEntry> results;

    private List<String> details;
    
    /**
     * Validation error messages (if any).
     */
    private List<String> validationErrors;

    public SearchResult() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExecutedQuery() {
        return executedQuery;
    }

    public void setExecutedQuery(String executedQuery) {
        this.executedQuery = executedQuery;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public String getOriginalQuery() {
        return originalQuery;
    }

    public void setOriginalQuery(String originalQuery) {
        this.originalQuery = originalQuery;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<ResultEntry> getResults() {
        return results;
    }

    public void setResults(List<ResultEntry> results) {
        this.results = results;
    }
    
    public void setValidationErrors(List<String> validationErrors) {
		this.validationErrors = validationErrors;
	}
    
    public List<String> getValidationErrors() {
		return validationErrors;
	}
    
}
