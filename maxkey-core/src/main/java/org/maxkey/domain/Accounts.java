package org.maxkey.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.mybatis.jpa.persistence.JpaBaseDomain;
import org.hibernate.validator.constraints.Length;


/*
   ID                   varchar(40)                    not null,
   UID                  varchar(40)                    null,
   APPID                varchar(40)	                   null,
   USERNAME            	varchar(60)                    null,
   PASSWORD             varchar(60)                    null,
   STATUS	            char(1)                        null
   constraint PK_ROLES primary key clustered (ID)
 */

@Table(name = "ACCOUNTS")  
public class Accounts extends JpaBaseDomain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6829592256223630307L;
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO,generator="uuid")
	private String id;
	@Column
	private String uid;
	@Column
	private String username;
	@Column
	private String displayName;
	@Column
	private String appId;
	@Column
	private String appName;
	
	@Length(max=60)
	@Column
	private String relatedUsername;
	@Column
	private String relatedPassword;
	
	public Accounts(){
		super();
	}

	
	public Accounts(String id) {
		this.id = id;
	}
	
	public Accounts(String uid,String appId){
		this.uid = uid;
		this.appId = appId;
	}

	
	public Accounts(String uid,String appId,String password) {
		this.uid = uid;
		this.appId = appId;
		this.relatedPassword=password;
	}
	


	public String getUid() {
		return uid;
	}


	public void setUid(String uid) {
		this.uid = uid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getDisplayName() {
		return displayName;
	}


	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	public String getAppId() {
		return appId;
	}


	public void setAppId(String appId) {
		this.appId = appId;
	}


	public String getAppName() {
		return appName;
	}


	public void setAppName(String appName) {
		this.appName = appName;
	}


	public String getRelatedUsername() {
		return relatedUsername;
	}


	public void setRelatedUsername(String relatedUsername) {
		this.relatedUsername = relatedUsername;
	}


	public String getRelatedPassword() {
		return relatedPassword;
	}


	public void setRelatedPassword(String relatedPassword) {
		this.relatedPassword = relatedPassword;
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "AppAccounts [uid=" + uid + ", username=" + username
				+ ", displayName=" + displayName + ", appId=" + appId
				+ ", appName=" + appName + ", relatedUsername="
				+ relatedUsername + ", relatedPassword=" + relatedPassword
				+ "]";
	}

}
