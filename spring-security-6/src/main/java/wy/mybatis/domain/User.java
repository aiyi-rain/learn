package wy.mybatis.domain;

import java.io.Serializable;

import lombok.*;

/**
 * 
 * @TableName user
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private Integer enable;

    /**
     * 
     */
    private Integer roleid;

    private static final long serialVersionUID = 1L;
}