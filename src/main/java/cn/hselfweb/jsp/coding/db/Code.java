package cn.hselfweb.jsp.coding.db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "code")
public class Code {
    @Id
    @Column(name = "codeid")
    private Long codeId;


    @Column(name = "fileurl")
    private String fileUrl ;

    @Column(name = "userid")
    private Long userId;

    @Column(name = "language")
    private String language;
}
