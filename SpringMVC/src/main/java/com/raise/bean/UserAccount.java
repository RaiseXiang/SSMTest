package com.raise.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiangxiaolong
 * @create 2022-03-27 13:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccount {
    private Integer id;
    private String userName;
    private Double money;
}
