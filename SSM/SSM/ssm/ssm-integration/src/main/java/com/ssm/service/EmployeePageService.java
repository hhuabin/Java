package com.ssm.service;

import com.ssm.common.R;

/**
 * @author bin
 * @date 2024-02-22 14:50
 */
public interface EmployeePageService {

    R page(int pageSize, int currentPage);
}
