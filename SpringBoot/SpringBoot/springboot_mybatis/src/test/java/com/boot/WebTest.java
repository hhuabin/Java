package com.boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

/**
 * @author bin
 * @date 2023-02-22-9:46
 * 测试web接口，作为一个前端开发者，一般不用这个测试接口
 */
// 启动随机端口
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// 开启虚拟调用
@AutoConfigureMockMvc
public class WebTest {

    @Test
    void testWeb(@Autowired MockMvc mcv) throws Exception {
        // 创建虚拟请求
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/user/search");
        // 执行对应的虚拟请求
        ResultActions action = mcv.perform(builder);

        // 定义执行的匹配状态
        StatusResultMatchers status = MockMvcResultMatchers.status();
        // 定义预期执行状态
        ResultMatcher ok = status.isOk();
        // 使用真实的执行状态与预期结果进行比对
        action.andExpect(ok);
    }

    @Test
    void tesBody(@Autowired MockMvc mcv) throws Exception {
        // 创建虚拟请求
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/user/search");
        // 执行对应的虚拟请求
        ResultActions action = mcv.perform(builder);

        // 定义执行的匹配状态
        ContentResultMatchers content = MockMvcResultMatchers.content();
        // 定义预期返回的内容
        ResultMatcher resultMatcher = content.json("result_code\":0}");
        // 使用真实的执行状态与预期结果进行比对
        action.andExpect(resultMatcher);
    }
}
