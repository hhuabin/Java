package com.ssm.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author bin
 * @date 2024-02-22 14:45
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PageBean<T> {

    private int currentPage;

    private int pageSize;

    private long total;

    private List<T> data;
}
