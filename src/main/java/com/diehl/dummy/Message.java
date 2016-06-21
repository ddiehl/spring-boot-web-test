/**
 * Sparta Software Co.
 * 2016
 */
package com.diehl.dummy;

import java.io.Serializable;

/**
 * @author Daniel Conde Diehl - Sparta Technology
 *
 * History:
 *  Jun 21, 2016 - Daniel Conde Diehl
 */

public class Message implements Serializable{
    private int id;
    private String description;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description= description;
    }
}
