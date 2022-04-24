package com.tekpro.apicrud.model;

/**
 *Kelompok 3 : 
 * - Delvito Rahim Derivansyah (211524039)
 * - Muhammad Rafi Farhan (211524051)
 * - Rachmat Purwa Saputra (211524054)
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Games {
    @Id
    @Column
    private int id;
    @Column
    private String title;
    @Column
    private String platform;
    @Column
    private int size;
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getPlatform() {
        return platform;
    } 
  
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    public int getSize(){
        return id;
    }
    public void setSize(int size){
        this.id = id;
    }
    
    public Games(int id, String title, String platform, int size){
		super();
		this.id = id;
		this.title = title;
		this.platform = platform;
		this.size = size;
	}

	public Games() {
		super();
	}
}

