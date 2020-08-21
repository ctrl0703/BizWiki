package io.cahlee;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Wiki {
	int id;
	String content;
	Date createdDate;
	String createdId;
	Date lastUpdatedDate;
	String updateUser;
}
